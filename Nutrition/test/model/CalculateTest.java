package model;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculateTest {
    
    public CalculateTest() {
    }

    Calculate calc = new Calculate();
    /**
     * Test of amountToGrams method, of class Calculate.
     */
    @Test
    public void testAmountToGrams() {
        System.out.println("amountToGrams");
        double amount = 5.2;
        String measurementType = "";
        double expResult = 0;
        double result = calc.amountToGrams(amount, measurementType);
        assertEquals(expResult, result, 0);
    }

    /**
     * Test of nutrientsPerGram method, of class Calculate.
     */
    @Test
    public void testNutrientsPerGram() {
        System.out.println("nutrientsPerGram");
        double expResult = 0;
        double result = calc.nutrientsPerGram(5, 3);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of totalNutrientValueInRecipe method, of class Calculate.
     */
    @Test
    public void testTotalNutrientValueInRecipe() {
        System.out.println("totalNutrientValueInRecipe");
        double expResult = 0;
        double result = calc.totalNutrientValueInRecipe(3.2, 58);
        assertEquals(expResult, result, 0.0);
    }
    
}
