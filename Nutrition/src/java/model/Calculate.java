/*    
NOTE: I am using literal values in the switch statement because I want to 
use an enum. So they are literal for now until I figure that out.

LIQUID_OUNCE(30),
DRY_OUNCE(28),
GRAM(1),
MILLIGRAM(1000),
TEASPOON(5),
TABLESPOON(15),
LIQUID_CUP(240),
DRY_CUP(230),
LIQUID_PINT(480),
DRY_PINT(460);

 math
 g = oz x 28.3495231
 1 oz = 28.3495231 g
 1 g = 1,000 mg
 1 lb = 453.5923696 g
 1cup (8oz = 226.7961848g) = 16TBS (226.7961848g / 16 = 14.17476155g in each T)
 1T = 14.17476155g
 1cup = 48tsp
private final double OUNCE = .03527396;
private final double GRAM = 1;
private final double MILLIGRAM = 1000;
private final double TEASPOON = .02254268;     // 4.72492052 grams in a tsp
private final double TABLESPOON = .06762804;   // 14.1747615 grams in a Tbsp
private final double CUP = .00422675;          // 226.7961848 grams in a cup
private final double PINT = .00211337;     //473.176475 grams in a pint
private final double POUND = .00220462;
private double grams;
*/

package model;

public class Calculate {
    
    // want to use the GramEquivalent enum here. hmmmmm
    // 1)and 2)convert amount of ingredient in the recipe to grams
    public static double amountToGrams(double amount, String measurementType) {

        double gramEquivalent;
        switch (measurementType) {
            case "grams": 
                gramEquivalent = 1;
                break;
            case "liquid oz": 
                gramEquivalent = 30;
                break;
            case "dry oz":
                gramEquivalent = 28;
                break;    
            case "teaspoon":
                gramEquivalent = 5;
                break;
            case "tablespoon":
                gramEquivalent = 15;
                break;
            case "milligram":
                gramEquivalent = 1000;
                break;
            case "liquid cup":
                gramEquivalent = 240;
                break;
            case "dry cup":
                gramEquivalent = 230;
                break;
            case "liquid pint":
                gramEquivalent = 480;
                break;
            case "dry pint":
                gramEquivalent = 460;
                break;
            default:
                gramEquivalent = 1;
                break;
        }        
        return gramEquivalent * amount;
    }    
    
    // 3)calculate percentage of each nutrient per gram
    // percentageOfNutrientInEachGram = totalNutrientGramsPerServingOnLabel / totalGramsPerServing
    public static double nutrientsPerGram(double nutrientValue, int servingSize) {
        return nutrientValue / servingSize;
    }
    
    // 4) find the total value for each nutrient in each ingredient
    // totalNutrientValueInRecipe = percentageOfNutrientInEachGram x totalNutrientGramsInRecipe
    public static double totalNutrientValueInRecipe(double percentOfNutrient, double amtOfIngredInGrams) {        
        return percentOfNutrient * amtOfIngredInGrams;
    }
    
    // 5) find the totals for each nutrient for display in the Nut Label for printing
    // needs to be formated to 1 decimal
    public static double totalNutrientForWholeRecipe(double totalNutrientForIngredient, int numberOfServings){
        return totalNutrientForIngredient / numberOfServings;
    }
    
    // 6) Find the weight of each servig. The dish must be weighted by the user 
    public static double weightPerServing(double totalGramsOfWholeRecipe, int numberOfServings) {
        return totalGramsOfWholeRecipe / numberOfServings;
    }
    
}
