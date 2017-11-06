package controller;

import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

public class NutritionTest {
    
    public NutritionTest() {
    }
    Nutrition n1 = new Nutrition("Calories", 28.0, 120.0);
    Nutrition n2 = new Nutrition("Sodium", 28.0, 160);
    Nutrition n3 = new Nutrition("Fat", 28.0, 120.0);
    
    /**
     * Test of getNutritionName method, of class Nutrition.
     */
    @Test
    public void testGetNutritionName() {
        System.out.println("getNutritionName");
        List<NutritionType> expResult = null;
        List<NutritionType> result = n1.getNutritionName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setNutritionName method, of class Nutrition.
     */
    @Test
    public void testSetNutritionName() {
        System.out.println("setNutritionName");
        List<NutritionType> nutritionName = null;
        n2.setNutritionName(nutritionName);
        assertEquals(nutritionName, n2.getNutritionName());
    }

    /**
     * Test of getLabelServingSizeInGrams method, of class Nutrition.
     */
    @Test
    public void testGetLabelServingSizeInGrams() {
        System.out.println("getLabelServingSizeInGrams");
        double expResult = 0.0;
        double result = n1.getLabelServingSizeInGrams();
        assertNotEquals(expResult, result, 0.0);
        assertEquals(28.0, result, 0.0);
    }

    /**
     * Test of setLabelServingSizeInGrams method, of class Nutrition.
     */
    @Test
    public void testSetLabelServingSizeInGrams() {
        System.out.println("setLabelServingSizeInGrams");
        double labelServingSizeInGrams = 0.0;
        n1.setLabelServingSizeInGrams(labelServingSizeInGrams);
        assertEquals(0.0, n1.getLabelServingSizeInGrams(), 0.0);
    }

    /**
     * Test of getLabelValueMilligrams method, of class Nutrition.
     */
    @Test
    public void testGetLabelValueMilligrams() {
        System.out.println("getLabelValueMilligrams");
        int expResult = 160;
        int result = n2.getLabelValueMilligrams();
        assertEquals(expResult, result);
    }

    /**
     * Test of setLabelValueMilligrams method, of class Nutrition.
     */
    @Test
    public void testSetLabelValueMilligrams() {
        System.out.println("setLabelValueMilligrams");
        int labelValueMilligrams = 0;
        n2.setLabelValueMilligrams(labelValueMilligrams);
        assertEquals(labelValueMilligrams, n2.getLabelValueMilligrams());
    }

    /**
     * Test of getLabelValueGrams method, of class Nutrition.
     */
    @Test
    public void testGetLabelValueGrams() {
        System.out.println("getLabelValueGrams");
        double expResult = 0.0;
        double result = n3.getLabelValueGrams();
        assertNotEquals(expResult, result, 0.0);
        assertEquals(120.0, result, 0.0);
    }

    /**
     * Test of setLabelValueGrams method, of class Nutrition.
     */
    @Test
    public void testSetLabelValueGrams() {
        System.out.println("setLabelValueGrams");
        double labelValueGrams = 28.0;
        n1.setLabelValueGrams(labelValueGrams);
        assertEquals(labelValueGrams, n1.getLabelValueGrams(), 0.0);
        assertNotEquals(120.0, n1.getLabelValueGrams());
    }

    /**
     * Test of toString method, of class Nutrition.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        String expResult = "";
        String result = n3.toString();
        assertNotEquals(expResult, result);
        System.out.println(n1.toString());
        System.out.println(n2.toString());
    }
    
}
