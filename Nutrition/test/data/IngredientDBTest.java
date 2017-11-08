/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import business.DeleteThisClass;
import business.Recipe;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Tender
 */
public class IngredientDBTest {
    
    public IngredientDBTest() {
    }

    /**
     * Test of insert method, of class IngredientDB.
     */
    @Test
    public void testInsert() {
        System.out.println("insert");
        DeleteThisClass ingredient = null;
        IngredientDB.insert(ingredient);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class IngredientDB.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        DeleteThisClass ingredient = null;
        IngredientDB.update(ingredient);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class IngredientDB.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        DeleteThisClass ingredient = null;
        IngredientDB.delete(ingredient);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of selectIngredient method, of class IngredientDB.
     */
    @Test
    public void testSelectIngredient() {
        System.out.println("selectIngredient");
        DeleteThisClass ingredient = null;
        DeleteThisClass expResult = null;
        DeleteThisClass result = IngredientDB.selectIngredient(ingredient);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of selectRecipe method, of class IngredientDB.
     */
    @Test
    public void testSelectRecipe() {
        System.out.println("selectRecipe");
        Recipe recipe = null;
        Recipe expResult = null;
        Recipe result = IngredientDB.selectRecipe(recipe);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
