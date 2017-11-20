/*
This class closes statements and result sets

For this application, this utilities class does not use the Entity Manager, 
but I have left this in for future use/reference.
See chapter 13 (murach) for more information
Entity example #1 shows mapping the emf to persistance unit with an annotation
placed above the declaration:
    @PersistanceUnit
    private EntityManagerFactory emf;
NOTE: the name of the file is persistence.xml, but in the design view it has
another name. So I changed it to NutritionPU.
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
    private static final EntityManagerFactory emf =
            Persistence.createEntityManagerFactory("NutritionPU");
    
    public static EntityManagerFactory getEmFactory() {
        return emf;
    } 
 */
package data;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Tender
 */
public class DBUtil {   

    public static void closeStatement(Statement s) throws SQLException {
        try {
            if (s != null) {
                s.close();
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    static void closePreparedStatement(PreparedStatement ps) {
        try {
            if (ps!=null) {
                ps.close();
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    static void closeResultSet(ResultSet rs) {
        try {
            if (rs != null) {
                rs.close();
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}
