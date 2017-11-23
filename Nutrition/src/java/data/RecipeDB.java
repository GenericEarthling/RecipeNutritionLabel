/*
INCOMPLETE: --------- will need to add the other Recipe fields ------

this maps the Recipe object to the Recipe table in the database.
for the selectRecippe method, this creates a Recipe object from the data 
thaT's stored in a row in the Recipe table. This is called
object-relational mapping, O/R mapping, or ORM.
*/
package data;

import business.Recipe;
//import business.User;
import java.sql.Connection;
import java.sql.PreparedStatement;  // interface
import java.sql.ResultSet;
import java.sql.SQLException;
import sql.ConnectToSQL;

/**
 *
 * @author Tender
 */
public class RecipeDB  {
    
    // executeUpdate() returns an integer a) the row count for SQL Data 
    // Manipulation Language (DML) statements OR b) 0 (zero) for SQL 
    // statements that return nothing
    public static int insert(Recipe recipe) {
        ConnectToSQL pool = ConnectToSQL.getInstance();
        Connection connect = pool.getConnection();
        PreparedStatement ps = null;
        
        String q = 
                "INSERT INTO Recipe (RecipeName, AmountInRecipe, MeasurementType) "
                + "VALUES (?, ?, ?)";
        try {
            ps = connect.prepareStatement(q);
            ps.setString(1, recipe.getName());
            ps.setDouble(2, recipe.getAmountInRecipe());
            ps.setString(3, recipe.getMeasurementType());
            return ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
            return 0;
        } finally {
            DBUtil.closePreparedStatement(ps);
            pool.freeConnection(connect);
        }
    }

    // this will search for recipe name to update. In the future, I want to use 
    // recipeId or some way so it doesn't overwrite it... maybe
    public static int update(Recipe recipe) throws SQLException {
        ConnectToSQL pool = ConnectToSQL.getInstance();
        Connection connect = pool.getConnection();
        PreparedStatement ps = null;
        
        String q = "UPDATE Recipe SET "
                + "AmountInRecipe = ?, "
                + "MeasurementType = ?"
                + "WHERE Name = ?";
        try {
            ps = connect.prepareStatement(q);
            ps.setString(1, recipe.getName());
            ps.setDouble(2, recipe.getAmountInRecipe());
            ps.setString(3, recipe.getMeasurementType());
            return ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
            return 0;
        } finally {
            DBUtil.closePreparedStatement(ps);
            pool.freeConnection(connect);
        }
    }

    public static int delete(Recipe recipe) {
        ConnectToSQL pool = ConnectToSQL.getInstance();
        Connection connect = pool.getConnection();
        PreparedStatement ps = null;
        
        String q = "DELETE FROM Recipe "
                + "WHERE Name = ?";
        try {
            ps = connect.prepareStatement(q);
            ps.setString(1, recipe.getName());
            return ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
            return 0;
        } finally {
            DBUtil.closePreparedStatement(ps);
            pool.freeConnection(connect);
        }    }

    public static Recipe selectRecipe(String recipeName) {
        ConnectToSQL pool = ConnectToSQL.getInstance();
        Connection connect = pool.getConnection();
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        String q = "SELECT * FROM Recipe "
                + "WHERE Name = ?";
        try {
            ps = connect.prepareStatement(q);
            ps.setString(1, recipeName);
            rs = ps.executeQuery();
            Recipe recipe = null;
            if (rs.next()) {
                recipe = new Recipe();
                recipe.setName(rs.getString("RecipeName"));
                recipe.setAmountInRecipe(rs.getDouble("IngredientAmountInRecipe"));
                recipe.setMeasurementType(rs.getString("MeasurementType"));
                recipe.setCookTime(rs.getString("CookTime"));
                recipe.setTemperature(rs.getInt("Temperature"));
                recipe.setDirections(rs.getString("Directions"));
            }
            return recipe;                   
        } catch (SQLException e) {
            System.out.println(e);
            return null;
        } finally {
            DBUtil.closeResultSet(rs);
            DBUtil.closePreparedStatement(ps);
            pool.freeConnection(connect);
        }
    }

    // if this finds the recipe name that already exists in the database
    // it returns true, otherwise false.
    public static boolean RecipeNameExists(String name) {
        ConnectToSQL pool = ConnectToSQL.getInstance();
        Connection connect = pool.getConnection();
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        String q = "SELECT Name FROM Recipe "
                + "WHERE Name = ?";
        try {
            ps = connect.prepareStatement(q);
            ps.setString(1, name);
            rs = ps.executeQuery();
            return rs.next();
        } catch (SQLException e) {
            System.out.println(e);
            return false;
        } finally {
            DBUtil.closeResultSet(rs);
            DBUtil.closePreparedStatement(ps);
            pool.freeConnection(connect);
        }        
    }     
}
