/*
 * This class holds the line items for the RecipeChart
 * It also gets each nutrient value for each ingredient
 */
package business;

import java.io.Serializable;
import javax.persistence.Entity;
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
@Entity
public class ChartLineItems implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long lineItemId;
    
    @OneToOne                         // one ingredient to one chart line item
    private Ingredient ingredient;
    @OneToOne                         // one recipe to one chart line item
    private Recipe recipe;
    
    private double amountInRecipe;
    private String directions;
    private String measurementType;
    private int servingSize;
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

    public Ingredient getIngredient() {
        return ingredient;
    }

    public void setIngredient(Ingredient ingredient) {
        this.ingredient = ingredient;
    }

    public Recipe getRecipe() {
        return recipe;
    }

    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }

    public double getAmountInRecipe() {
        return amountInRecipe;
    }

    public void setAmountInRecipe(double amountInRecipe) {
        this.amountInRecipe = amountInRecipe;
    }

    public String getDirections() {
        return directions;
    }

    public void setDirections(String directions) {
        this.directions = directions;
    }

    public String getMeasurementType() {
        return measurementType;
    }

    public void setMeasurementType(String measurementType) {
        this.measurementType = measurementType;
    }

    public int getServingSize() {
        return servingSize;
    }

    public void setServingSize(int servingSize) {
        this.servingSize = servingSize;
    }

    public double getIngredientNutrientValue() {
        return ingredientNutrientValue;
    }

    public void setIngredientNutrientValue(double ingredientNutrientValue) {
        this.ingredientNutrientValue = ingredientNutrientValue;
    }

    public double getPercentOfNutrientPerGram() {
        return percentOfNutrientPerGram;
    }

    public void setPercentOfNutrientPerGram(double percentOfNutrientPerGram) {
        this.percentOfNutrientPerGram = percentOfNutrientPerGram;
    }

    public double getAmtOfIngredInGrams() {
        return amtOfIngredInGrams;
    }

    public void setAmtOfIngredInGrams(double amtOfIngredInGrams) {
        this.amtOfIngredInGrams = amtOfIngredInGrams;
    }
    
    // 1&2) convert the Ingredient amount in the recipe to the grams equivalent
    // measurementType converted to grams
    double amtOfIngredInGrams = Calculate.amountToGrams(28, "liquid oz");
//    double amtOfIngredInGrams = Calculate.amountToGrams(28, "dry cup");
    
    // calculate values for each nutrient for diplay as a chart line item
    public double getCalorieSum() {
        // 3) calculate percentage of each nutrient per gram
        percentOfNutrientPerGram = Calculate.nutrientsPerGram(ingredient.getCalories(), servingSize);
        // 4) find the total value for each nutrient in each ingredient
        ingredientNutrientValue = totalNutrientValueInRecipe(percentOfNutrientPerGram, amtOfIngredInGrams);
        return ingredientNutrientValue;        
    }
    public double getFatSum() {
        percentOfNutrientPerGram = Calculate.nutrientsPerGram(ingredient.getFat(), servingSize);
        ingredientNutrientValue = totalNutrientValueInRecipe(percentOfNutrientPerGram, amtOfIngredInGrams);
        return ingredientNutrientValue;        
    }
    public double getCholesterolSum() {
        percentOfNutrientPerGram = Calculate.nutrientsPerGram(ingredient.getCholesterol(), servingSize);
        ingredientNutrientValue = totalNutrientValueInRecipe(percentOfNutrientPerGram, amtOfIngredInGrams);
        return ingredientNutrientValue;        
    }
    public double getSodiumSum() {
        percentOfNutrientPerGram = Calculate.nutrientsPerGram(ingredient.getSodium(), servingSize);
        ingredientNutrientValue = totalNutrientValueInRecipe(percentOfNutrientPerGram, amtOfIngredInGrams);
        return ingredientNutrientValue;        
    }    
    public double getPotassiumSum() {
        percentOfNutrientPerGram = Calculate.nutrientsPerGram(ingredient.getPotassium(), servingSize);
        ingredientNutrientValue = totalNutrientValueInRecipe(percentOfNutrientPerGram, amtOfIngredInGrams);
        return ingredientNutrientValue;        
    }
    public double getCarbohydrateSum() {
        percentOfNutrientPerGram = Calculate.nutrientsPerGram(ingredient.getCarbohydrate(), servingSize);
        ingredientNutrientValue = totalNutrientValueInRecipe(percentOfNutrientPerGram, amtOfIngredInGrams);
        return ingredientNutrientValue;        
    }
    public double getFiberSum() {
        percentOfNutrientPerGram = Calculate.nutrientsPerGram(ingredient.getFiber(), servingSize);
        ingredientNutrientValue = totalNutrientValueInRecipe(percentOfNutrientPerGram, amtOfIngredInGrams);
        return ingredientNutrientValue;        
    }
    public double getProteinSum() {
        percentOfNutrientPerGram = Calculate.nutrientsPerGram(ingredient.getProtein(), servingSize);
        ingredientNutrientValue = totalNutrientValueInRecipe(percentOfNutrientPerGram, amtOfIngredInGrams);
        return ingredientNutrientValue;        
    }    
}