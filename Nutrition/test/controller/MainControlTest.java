package controller;

import model.MainControl;
import business.Recipe;
import business.DeleteThisClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class MainControlTest {
    
    public MainControlTest() {
    }
    MainControl mc = new MainControl();
    /**
     * Test of searchForRecipe method, of class MainControl.
     */
    @Test
    public void testSearchForRecipe() {
        System.out.println("searchForRecipe");
        mc.searchForRecipe();
    }

    /**
     * Test of loadRecipe method, of class MainControl.
     */
    @Test
    public void testLoadRecipe() {
        System.out.println("loadRecipe");
        Recipe expResult = null;
        Recipe result = mc.loadRecipe();
        assertEquals(expResult, result);
    }

    /**
     * Test of addRecipeToSession method, of class MainControl.
     */
    @Test
    public void testAddRecipeToSession() {
        System.out.println("addRecipeToSession");
        Recipe newRecipe = null;
        mc.addRecipeToSession(newRecipe);
    }

    /**
     * Test of saveRecipeToDB method, of class MainControl.
     */
    @Test
    public void testSaveRecipeToDB() {
        System.out.println("saveRecipeToDB");
        Recipe newRecipe = null;
        mc.saveRecipeToDB(newRecipe);
    }

    /**
     * Test of searchForIngredient method, of class MainControl.
     */
    @Test
    public void testSearchForIngredient() {
        System.out.println("searchForIngredient");
        mc.searchForIngredient();
    }

    /**
     * Test of loadIngredient method, of class MainControl.
     */
    @Test
    public void testLoadIngredient() {
        System.out.println("loadIngredient");
        DeleteThisClass expResult = null;
        DeleteThisClass result = mc.loadIngredient();
        assertEquals(expResult, result);
    }

    /**
     * Test of saveIngredientToDB method, of class MainControl.
     */
    @Test
    public void testSaveIngredientToDB() {
        System.out.println("saveIngredientToDB");
        DeleteThisClass newIngredient = null;
        mc.saveIngredientToDB(newIngredient);
    }

    /**
     * Test of addIngredientToRecipe method, of class MainControl.
     */
    @Test
    public void testAddIngredientToRecipe() {
        System.out.println("addIngredientToRecipe");
        DeleteThisClass ingredient = null;
        mc.addIngredientToRecipe(ingredient);
    }

    /**
     * Test of editIngredientInRecipe method, of class MainControl.
     */
    @Test
    public void testEditIngredientInRecipe() {
        System.out.println("editIngredientInRecipe");
        DeleteThisClass ingredient = null;
        DeleteThisClass expResult = null;
        DeleteThisClass result = mc.editIngredientInRecipe(ingredient);
        assertEquals(expResult, result);
    }

    /**
     * Test of deleteIngredientFromRecipe method, of class MainControl.
     */
    @Test
    public void testDeleteIngredientFromRecipe() {
        System.out.println("deleteIngredientFromRecipe");
        DeleteThisClass ingredient = null;
        mc.deleteIngredientFromRecipe(ingredient);
    }

    /**
     * Test of addStep method, of class MainControl.
     */
    @Test
    public void testAddStep() {
        System.out.println("addStep");
        int step = 0;
        String description = "";
        mc.addStep(step, description);
    }

    /**
     * Test of editStep method, of class MainControl.
     */
    @Test
    public void testEditStep() {
        System.out.println("editStep");
        int step = 0;
        String description = "";
        String expResult = "";
        String result = mc.editStep(step, description);
        assertEquals(expResult, result);
    }

    /**
     * Test of deleteStep method, of class MainControl.
     */
    @Test
    public void testDeleteStep() {
        System.out.println("deleteStep");
        int step = 0;
        String description = "";
        mc.deleteStep(step, description);
    }

    /**
     * Test of printRecipe method, of class MainControl.
     */
    @Test
    public void testPrintRecipe() {
        System.out.println("printRecipe");
        Recipe recipe = null;
        mc.printRecipe(recipe);
    }

    /**
     * Test of logOut method, of class MainControl.
     */
    @Test
    public void testLogOut() {
        System.out.println("logOut");
        mc.logOut();
    }
    
}
