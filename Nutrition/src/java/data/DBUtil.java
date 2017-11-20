/*
this is an example from chapter 13 (murach)
Entity example #1 shows mapping the emf to persistance unit with an annotation
placed above the declaration:
    @PersistanceUnit
    private EntityManagerFactory emf;
NOTE: the name of the file is persistence.xml, but in the design view it has
another name. So I changed it to NutritionPU.
 */
package data;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Tender
 */
public class DBUtil {
    private static final EntityManagerFactory emf =
            Persistence.createEntityManagerFactory("NutritionPU");
    
    public static EntityManagerFactory getEmFactory() {
        return emf;
    }    

    static void closePreparedStatement(PreparedStatement ps) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    static void closeResultSet(ResultSet rs) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
