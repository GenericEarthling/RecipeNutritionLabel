/*
when closing connections, First In ... Last Out
*/
package data;

import business.Ingredient;
import java.sql.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import sql.ConnectToSQL;

public class IngredientDB {
    
    public static int insert(Ingredient ingredient) throws SQLException {
        ConnectToSQL pool = ConnectToSQL.getInstance();
        Connection connection = pool.getConnection();
        PreparedStatement ps = null;
        String query = "INSERT INTO Ingredient (IngredientName, ServingSize, Calories, Fat, Cholesterol, Sodium, Potassium, Carbohydrates, Fiber, Protein) "
                        + "VALUES(?,?,?,?,?,?,?,?,?,?)";
        try {
            ps = connection.prepareStatement(query);
            ps.setString(1, ingredient.getIngredientName());
            ps.setInt(2, ingredient.getServingSizeInGrams());
            ps.setDouble(3, ingredient.getCalories());
            ps.setDouble(4, ingredient.getFat());
            ps.setDouble(5, ingredient.getCholesterol());
            ps.setDouble(6, ingredient.getSodium());
            ps.setDouble(7, ingredient.getPotassium());
            ps.setDouble(8, ingredient.getCarbohydrate());
            ps.setDouble(9, ingredient.getFiber());
            ps.setDouble(10, ingredient.getProtein());
            return ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
            return 0;
        } finally {
            DBUtil.closePreparedStatement(ps);
            pool.freeConnection(connection);
        }
    }    

    public static int update(Ingredient ingredient) {
        ConnectToSQL pool = ConnectToSQL.getInstance();
        Connection connection = pool.getConnection();
        PreparedStatement ps = null;
        String query = "UPDATE Ingredient SET "
                + "ServingSize = ?, "
                + "Calories = ?, "
                + "Fat = ?, "
                + "Cholesterol = ?, "
                + "Sodium = ?, "
                + "Potassium = ?, "
                + "Carbohydrates = ?, "
                + "Fiber = ?, "
                + "Protein = ?, "
                + "WHERE IngredientName = ?";
        try {
            ps = connection.prepareStatement(query);
            ps.setInt(1, ingredient.getServingSizeInGrams());
            ps.setDouble(2, ingredient.getCalories());
            ps.setDouble(3, ingredient.getFat());
            ps.setDouble(4, ingredient.getCholesterol());
            ps.setDouble(5, ingredient.getSodium());
            ps.setDouble(6, ingredient.getPotassium());
            ps.setDouble(7, ingredient.getCarbohydrate());
            ps.setDouble(8, ingredient.getFiber());
            ps.setDouble(9, ingredient.getProtein());
            ps.setString(10, ingredient.getIngredientName());
            return ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
            return 0;
        } finally {
            DBUtil.closePreparedStatement(ps);
            pool.freeConnection(connection);
        }       
    }

    public static int delete(Ingredient ingredient) {
        ConnectToSQL pool = ConnectToSQL.getInstance();
        Connection connection = pool.getConnection();
        PreparedStatement ps = null;
        String query = "DELETE FROM Ingredient "
                + "WHERE IngredientName = ?";
        try {
            ps = connection.prepareStatement(query);
            ps.setString(1, ingredient.getIngredientName());
            return ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
            return 0;
        } finally {
            DBUtil.closePreparedStatement(ps);
            pool.freeConnection(connection);
        }             
    }
    
    public static Ingredient selectIngredient(String ingredientName) throws SQLException {
        ConnectToSQL pool = ConnectToSQL.getInstance();
        Connection connection = pool.getConnection();
        PreparedStatement ps = null;
        ResultSet rs = null;
        String query = "SELECT * FROM Ingredient "
                + "WHERE IngredientName = ?";  
        try {
            ps = connection.prepareStatement(query);
            ps.setString(1, ingredientName);
            rs = ps.executeQuery();
            Ingredient ingredient = null;
            if (rs.next()) {
                ingredient = new Ingredient();
                ingredient.setIngredientName(rs.getString("IngredientName"));
                ingredient.setServingSizeInGrams(rs.getInt("ServingSize"));
                ingredient.setCalories(rs.getDouble("Calories"));
                ingredient.setFat(rs.getDouble("Fat"));
                ingredient.setCholesterol(rs.getDouble("Cholesterol"));
                ingredient.setSodium(rs.getDouble("Sodium"));
                ingredient.setPotassium(rs.getDouble("Potassium"));
                ingredient.setCarbohydrate(rs.getDouble("Carbohydrates"));
                ingredient.setFiber(rs.getDouble("Fiber"));
                ingredient.setProtein(rs.getDouble("Protein"));
            }
            return ingredient;
        } catch (SQLException e) {
            System.out.println(e);
            return null;
        } finally {
            DBUtil.closeResultSet(rs);
            DBUtil.closePreparedStatement(ps);
            pool.freeConnection(connection);
        }
    }
            
        public static boolean ingredientExists(String ingredientName) {
            ConnectToSQL pool = ConnectToSQL.getInstance();
            Connection connection = pool.getConnection();
            PreparedStatement ps = null;
            ResultSet rs = null;
            String query = "SELECT IngredientName FROM Ingredient "
                    + "WHERE IngredientName = ?";  
            try {
                ps = connection.prepareStatement(query);
                ps.setString(1, ingredientName);
                rs = ps.executeQuery();
                return rs.next();
            } catch (SQLException e) {
                System.out.println(e);
                return false;
            } finally {
                DBUtil.closeResultSet(rs);
                DBUtil.closePreparedStatement(ps);
                pool.freeConnection(connection);
            }            
        }


}
