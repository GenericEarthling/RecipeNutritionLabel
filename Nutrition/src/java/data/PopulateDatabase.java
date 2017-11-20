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
        System.out.println("From insertIngredient method");
        System.out.println(ingredient);
        
    }
    
    public static void main(String[] args) {
        Map props = new HashMap();
        props.put(TRANSACTION_TYPE,
                PersistenceUnitTransactionType.RESOURCE_LOCAL.name());
        props.put(JDBC_DRIVER, "com.mysql.jdbc.Driver");
        props.put(JDBC_URL,
                "jdbc:mysql://localhost:3306/mysql?zeroDateTimeBehavior=convertToNull");
        props.put(JDBC_USER, "root");
        props.put(JDBC_PASSWORD, "4843");
        props.put(TARGET_SERVER, TargetServer.None);
        
        emf = Persistence.createEntityManagerFactory("NutritionPU", props);
        
        // create some basic ingredients for the database
        Ingredient ingredient1 = new Ingredient();
        ingredient1.setIngredientName("Steel Cut Oatmeal");
        ingredient1.setCalories(150);
        ingredient1.setFat(3);
        ingredient1.setCholesterol(0);
        ingredient1.setSodium(0);
        ingredient1.setPotassium(0);
        ingredient1.setCarbohydrate(27);
        ingredient1.setFiber(4);
        ingredient1.setProtein(5);
        ingredient1.setServingSizeInGrams(40);
//        ingredient1.setMeasurementType("dry cup");
//        ingredient1.setIngredientAmount(1);        
        insertIngredient(ingredient1);
        
        
        Ingredient i2 = new Ingredient();
        i2.setIngredientName("Walnuts");
        i2.setCalories(190);
        i2.setFat(18);
        i2.setCholesterol(0);
        i2.setSodium(1);
        i2.setPotassium(125);
        i2.setCarbohydrate(4);
        i2.setFiber(2);
        i2.setProtein(4);
        i2.setServingSizeInGrams(28);
//        i2.setMeasurementType("grams");
//        i2.setIngredientAmount(40);        
        insertIngredient(i2);                
                
        System.out.println("From Main");
        System.out.println();        

    }
}