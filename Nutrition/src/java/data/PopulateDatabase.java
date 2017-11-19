/* Murach file
 * If the Products table in the music_jpa database doesn't contain any records,
 * you can use this class to populate the Product table.
 *
 * To do this in NetBeans, press SHIFT+F6
 * while in this window, or right click and select Run File. It is normal for
 * it to take a few minutes to run.
 *
 * After you have done this, you will want to change the
 * javax.persistence.schema-generation.database.action value in the
 * persistence.xml file to "none". Otherwise, the application will pause for
 * two or three minutes each time you start it when it first makes a database
 * call.
*/

package data;

import business.Ingredient;
import java.util.HashMap;
import java.util.Map;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.spi.PersistenceUnitTransactionType;
import static org.eclipse.persistence.config.EntityManagerProperties.JDBC_DRIVER;
import static org.eclipse.persistence.config.EntityManagerProperties.JDBC_PASSWORD;
import static org.eclipse.persistence.config.EntityManagerProperties.JDBC_URL;
import static org.eclipse.persistence.config.EntityManagerProperties.JDBC_USER;
import static org.eclipse.persistence.config.PersistenceUnitProperties.TARGET_SERVER;
import static org.eclipse.persistence.config.PersistenceUnitProperties.TRANSACTION_TYPE;
import org.eclipse.persistence.config.TargetServer;

public class PopulateDatabase {
    private static EntityManagerFactory emf;
    
    public static void insertIngredient(Ingredient ingredient) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction trans = em.getTransaction();
        trans.begin();
        try {
            em.persist(ingredient);
            trans.commit();
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            em.close();
        }
    }
    
    public static void main(String[] args) {
        Map props = new HashMap();
        props.put(TRANSACTION_TYPE,
                PersistenceUnitTransactionType.RESOURCE_LOCAL.name());
        props.put(JDBC_DRIVER, "com.mysql.jdbc.Driver");
        props.put(JDBC_URL,
                "jdbc:mysql://localhost:3306/music_jpa?zeroDateTimeBehavior=convertToNull");
        props.put(JDBC_USER, "root");
        props.put(JDBC_PASSWORD, "4843");
        props.put(TARGET_SERVER, TargetServer.None);
        
        emf = Persistence.createEntityManagerFactory("NutritionPU", props);
        
        // create some basic ingredients for the database
        Ingredient ingredient1 = new Ingredient();
        ingredient1.setIngredientName("");
        ingredient1.setCalories(120);
        ingredient1.setFat(0);
        ingredient1.setCholesterol(0);
        ingredient1.setSodium(0);
        ingredient1.setPotassium(0);
        ingredient1.setCarbohydrate(0);
        ingredient1.setFiber(0);
        ingredient1.setProtein(0);
        ingredient1.setServingSizeInGrams(0);
        ingredient1.setMeasurementType("");
        ingredient1.setIngredientAmount(0);        
        insertIngredient(ingredient1);
        

    }
}