package controller;

import java.util.Map;
import org.junit.Test;
import static org.junit.Assert.*;

public class IngredientTest {
    
    public IngredientTest() {
    }
    Ingredient i1 = new Ingredient("flour", 4, "cup");
    Ingredient i4 = new Ingredient("flour", 4, "cup");
    Ingredient i2 = new Ingredient("sugar", 2, "tablespoon");
    Ingredient i3 = new Ingredient("butter", .5, "cup");    

    /**
     * Test of getIngredientName method, of class Ingredient.
     */
    @Test
    public void testGetIngredientName() {
        System.out.println("getIngredientName");
        String expResult = "sugar";
        String expResult2 = "milk";
        String result = i2.getIngredientName();
        assertEquals(expResult, result);
        assertNotEquals(expResult2, result);
    }

    /**
     * Test of setIngredientName method, of class Ingredient.
     */
    @Test
    public void testSetIngredientName() {
        System.out.println("setIngredientName");
        String ingredientName = "milk";
        i4.setIngredientName(ingredientName);
        assertNotEquals(i4.getIngredientName(), i2.getIngredientName());        
        assertEquals("sugar", i2.getIngredientName());        
    }

    /**
     * Test of getAmountInRecipe method, of class Ingredient.
     */
    @Test
    public void testGetAmountInRecipe() {
        System.out.println("getAmountInRecipe");
        double expResult = .5;
        double expResult2 = 1;
        double result = i3.getAmountInRecipe();
        assertEquals(expResult, result, 0.0);
        assertNotEquals(expResult2, result);
    }

    /**
     * Test of setAmountInRecipe method, of class Ingredient.
     */
    @Test
    public void testSetAmountInRecipe() {
        System.out.println("setAmountInRecipe");
        double amountInRecipe = 5.2;
        i2.setAmountInRecipe(amountInRecipe);
        assertEquals(5.2, i2.getAmountInRecipe(), 0.0);
        assertNotEquals(3, i2.getAmountInRecipe());        
    }

    /**
     * Test of getMeasurementType method, of class Ingredient.
     */
    @Test
    public void testGetMeasurementType() {
        System.out.println("getMeasurementType");
        String expResult = "gram";
        String result = i1.getMeasurementType();
        assertNotEquals(expResult, result);
        assertEquals("cup", result);
    }

    /**
     * Test of setMeasurementType method, of class Ingredient.
     */
    @Test
    public void testSetMeasurementType() {
        System.out.println("setMeasurementType");
        String measurementType = "gram";
        i4.setMeasurementType(measurementType);
        assertEquals("tablespoon", i2.getMeasurementType());
        assertNotEquals("cake", i4.getMeasurementType());
    }

    /**
     * Test of getMapNutrients method, of class Ingredient.
     */
    @Test
    public void testGetMapNutrients() {
        System.out.println("getMapNutrients");
        Map<String, Integer> expResult = null;
        Map<String, Integer> result = i4.getMapNutrients();
        assertEquals(expResult, result);
    }

    /**
     * Test of setMapNutrients method, of class Ingredient.
     */
    @Test
    public void testSetMapNutrients() {
        System.out.println("setMapNutrients");
        Map<String, Integer> mapNutrients = null;
        i3.setMapNutrients(mapNutrients);
        assertEquals(mapNutrients, i3.getMapNutrients());
    }

    /**
     * Test of hashCode method, of class Ingredient.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        int expResult = 0;
        int result = i3.hashCode();
        assertNotEquals(expResult, result);
    }

    /**
     * Test of equals method, of class Ingredient.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        boolean expResult = false;
        boolean result = i1.equals(obj);
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class Ingredient.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        String expResult = "";
        String result = i3.toString();
        assertNotEquals(expResult, result);
        System.out.println("The toString result is: " + result);
    }    
}
