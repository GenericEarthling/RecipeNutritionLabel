package controller;

import org.junit.Test;
import static org.junit.Assert.*;

public class RecipeTest {
    
    public RecipeTest() {
    }

    Recipe r1 = new Recipe();
    
    /**
     * Test of getName method, of class Recipe.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        String expResult = "donuts";
        r1.setName(expResult);
        String result = r1.getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setName method, of class Recipe.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "Cake";
        r1.setName(name);
        assertEquals(name, r1.getName());
    }

    /**
     * Test of getOvenTemp method, of class Recipe.
     */
    @Test
    public void testGetOvenTemp() {
        System.out.println("getOvenTemp");
        int expResult = 450;
        r1.setOvenTemp(expResult);
        int result = r1.getOvenTemp();
        assertEquals(expResult, result);
    }

    /**
     * Test of setOvenTemp method, of class Recipe.
     */
    @Test
    public void testSetOvenTemp() {
        System.out.println("setOvenTemp");
        int ovenTemp = 320;
        r1.setOvenTemp(ovenTemp);
        assertEquals(ovenTemp, r1.getOvenTemp());
    }

    /**
     * Test of getCookTime method, of class Recipe.
     */
    @Test
    public void testGetCookTime() {
        System.out.println("getCookTime");
        int expResult = 20;
        r1.setCookTime(expResult);
        int result = r1.getCookTime();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCookTime method, of class Recipe.
     */
    @Test
    public void testSetCookTime() {
        System.out.println("setCookTime");
        int cookTime = 30;
        r1.setCookTime(cookTime);
        assertEquals(cookTime, r1.getCookTime());
    }

    /**
     * Test of getStep method, of class Recipe.
     */
    @Test
    public void testGetStep() {
        System.out.println("getStep");
        int expResult = 5;
        r1.setStep(expResult);
        int result = r1.getStep();
        assertEquals(expResult, result);
    }

    /**
     * Test of setStep method, of class Recipe.
     */
    @Test
    public void testSetStep() {
        System.out.println("setStep");
        int step = 1;
        r1.setStep(step);
        assertEquals(step, r1.getStep());
    }

    /**
     * Test of getDescription method, of class Recipe.
     */
    @Test
    public void testGetDescription() {
        System.out.println("getDescription");
        String expResult = "mix until your tired";
        r1.setDescription(expResult);
        String result = r1.getDescription();
        assertEquals(expResult, result);
    }

    /**
     * Test of setDescription method, of class Recipe.
     */
    @Test
    public void testSetDescription() {
        System.out.println("setDescription");
        String description = "do this two more times";
        r1.setDescription(description);
        assertEquals(description, r1.getDescription());
    }

    /**
     * Test of getIngredient method, of class Recipe.
     */
    @Test
    public void testGetIngredient() {
        System.out.println("getIngredient");
        Ingredient expResult = null;
        Ingredient result = r1.getIngredient();
        assertEquals(expResult, result);
    }

    /**
     * Test of setIngredient method, of class Recipe.
     */
    @Test
    public void testSetIngredient() {
        System.out.println("setIngredient");
        Ingredient ingredient = null;
        r1.setIngredient(ingredient);
        assertEquals(ingredient, r1.getIngredient());
    }

    /**
     * Test of hashCode method, of class Recipe.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        int expResult = 0;
        int result = r1.hashCode();
        assertNotEquals(expResult, result);
    }

    /**
     * Test of equals method, of class Recipe.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        boolean expResult = false;
        boolean result = r1.equals(obj);
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class Recipe.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        r1.setDescription("do this two more times");
        r1.setCookTime(12);
        r1.setStep(2);
        r1.setOvenTemp(425);
        r1.setName("Pie");        
        System.out.println(r1);
    }
    
}
