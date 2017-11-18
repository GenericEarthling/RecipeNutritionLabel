/*
 * This class holds the line items for the RecipeChart
 * It also gets each nutrient value for each ingredient
 */
package business;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import model.Calculate;
import static model.Calculate.amountToGrams;
import static model.Calculate.totalNutrientValueInRecipe;

/**
 *
 * @author Tender
 */
public class ChartLineItems {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long lineItemId;
    
    @OneToOne                         // one ingredient to one chart line item
    private Ingredient i;
    @OneToOne                         // one recipe to one chart line item
    private Recipe r;
    private double amountInRecipe = r.getAmountInRecipe();
    private String directions = r.getDirections();
    private String measurementType = r.getMeasurementType();
    private int servingSize = i.getServingSizeInGrams();
    private double ingredientNutrientValue;
    private double percentOfNutrientPerGram;

    public ChartLineItems() {
    }

    public Long getLineItemId() {
        return lineItemId;
    }

    public void setLineItemId(Long lineItemId) {
        this.lineItemId = lineItemId;
    }
    
    // 1&2) convert the Ingredient amount in the recipe to the grams equivalent
    // measurementType converted to grams
    double amtOfIngredInGrams = Calculate.amountToGrams(amountInRecipe, measurementType);
    
    // calculate values for each nutrient for diplay as a chart line item
    public double getCalorieSum() {
        // 3) calculate percentage of each nutrient per gram
        percentOfNutrientPerGram = Calculate.nutrientsPerGram(i.getCalories(), servingSize);
        // 4) find the total value for each nutrient in each ingredient
        ingredientNutrientValue = totalNutrientValueInRecipe(percentOfNutrientPerGram, amtOfIngredInGrams);
        return ingredientNutrientValue;        
    }
    public double getFatSum() {
        percentOfNutrientPerGram = Calculate.nutrientsPerGram(i.getFat(), servingSize);
        ingredientNutrientValue = totalNutrientValueInRecipe(percentOfNutrientPerGram, amtOfIngredInGrams);
        return ingredientNutrientValue;        
    }
    public double getCholesterolSum() {
        percentOfNutrientPerGram = Calculate.nutrientsPerGram(i.getCholesterol(), servingSize);
        ingredientNutrientValue = totalNutrientValueInRecipe(percentOfNutrientPerGram, amtOfIngredInGrams);
        return ingredientNutrientValue;        
    }
    public double getSodiumSum() {
        percentOfNutrientPerGram = Calculate.nutrientsPerGram(i.getSodium(), servingSize);
        ingredientNutrientValue = totalNutrientValueInRecipe(percentOfNutrientPerGram, amtOfIngredInGrams);
        return ingredientNutrientValue;        
    }    
    public double getPotassiumSum() {
        percentOfNutrientPerGram = Calculate.nutrientsPerGram(i.getPotassium(), servingSize);
        ingredientNutrientValue = totalNutrientValueInRecipe(percentOfNutrientPerGram, amtOfIngredInGrams);
        return ingredientNutrientValue;        
    }
    public double getCarbohydrateSum() {
        percentOfNutrientPerGram = Calculate.nutrientsPerGram(i.getCarbohydrate(), servingSize);
        ingredientNutrientValue = totalNutrientValueInRecipe(percentOfNutrientPerGram, amtOfIngredInGrams);
        return ingredientNutrientValue;        
    }
    public double getFiberSum() {
        percentOfNutrientPerGram = Calculate.nutrientsPerGram(i.getFiber(), servingSize);
        ingredientNutrientValue = totalNutrientValueInRecipe(percentOfNutrientPerGram, amtOfIngredInGrams);
        return ingredientNutrientValue;        
    }
    public double getProteinSum() {
        percentOfNutrientPerGram = Calculate.nutrientsPerGram(i.getProtein(), servingSize);
        ingredientNutrientValue = totalNutrientValueInRecipe(percentOfNutrientPerGram, amtOfIngredInGrams);
        return ingredientNutrientValue;        
    }    
}
