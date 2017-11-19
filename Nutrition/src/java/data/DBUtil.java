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
