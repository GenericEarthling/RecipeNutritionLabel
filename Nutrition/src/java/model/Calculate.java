/*    
 math
 g = oz x 28.3495231
 1 oz = 28.3495231 g
 1 g = 1,000 mg
 1 lb = 453.5923696 g
 1cup (8oz = 226.7961848g) = 16TBS (226.7961848g / 16 = 14.17476155g in each T)
 1T = 14.17476155g
 1cup = 48tsp
*/

package model;

public class Calculate {
    
    // each of the following equals 1 gram
    private final double OUNCE = .03527396;
    private final double GRAM = 1;
    private final double MILLIGRAM = 1000;
    private final double TEASPOON = .02254268;     // 4.72492052 grams in a tsp
    private final double TABLESPOON = .06762804;   // 14.1747615 grams in a Tbsp
    private final double CUP = .00422675;          // 226.7961848 grams in a cup
    private final double PINT = .00211337;     //473.176475 grams in a pint
    private final double POUND = .00220462;
    private double grams;
    
    // convert amount of ingredient in the recipe to grams
    public double amountToGrams(double amount, String measurementType) {
        // switch statement to select measurementType used
        // grams = measurementType * amount;
        return 0;
    }    
    
    // calculate percentage of each nutrient per gram
    // percentageOfNutrientInEachGram = totalNutrientGramsPerServingOnLabel / totalGramsPerServing
    public double nutrientsPerGram(double nutrientValue, double servingSize) {
        return 0;
    }
    
    // find the total value for each nutrient in each ingredient
    // totalNutrientValueInRecipe = percentageOfNutrientInEachGram x totalNutrientGramsInRecipe
    public double totalNutrientValueInRecipe(double percentInEachGram, double totalNutrientGrams) {
        double total;
        return 0;
    }
    
}
