/*
this will hold the misc methods to connect to db
 */
package data;

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
}
