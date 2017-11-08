package data;

import business.Recipe;
import org.junit.Test;
import static org.junit.Assert.*;

public class RecipeDBTest {
    
    public RecipeDBTest() {
    }

    RecipeDB rdb = new RecipeDB();
    /**
     * Test of insert method, of class RecipeDB.
     */
    @Test
    public void testInsert() {
        System.out.println("insert");
        Recipe recipe = null;
        RecipeDB.insert(recipe);
    }

    /**
     * Test of update method, of class RecipeDB.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        Recipe recipe = null;
        RecipeDB.update(recipe);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class RecipeDB.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        Recipe recipe = null;
        RecipeDB.delete(recipe);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of selectRecipe method, of class RecipeDB.
     */
    @Test
    public void testSelectRecipe() {
        System.out.println("selectRecipe");
        Recipe recipe = null;
        Recipe expResult = null;
        Recipe result = RecipeDB.selectRecipe(recipe);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
