/*
 * This class holds the line items for the RecipeChart
 * It also gets each nutrient SUB-TOTAL value for each ingredient
 * Found this online for setting 2 decimal places:
            DecimalFormat df = new DecimalFormat("#.##");
            or
            value = value.setScale(2, RoundingMode.CEILING)
 * Planning on useing that in the RecipeChart.java file since it gets TOTAL
 */
package business;

import java.io.Serializable;
import model.Calculate;
import business.Recipe;
import static model.Calculate.totalNutrientValueInIngredient;   

/**
 *
 * @author Tender
 */
public class RecipeLineItems implements Serializable {
    
    private int recipeLineItemId;
    
    // one ingredient to one chart line item
    private Ingredient ingredient;
    
    // one recipe to one chart line item
    private Recipe recipe;

    private int servingSize;
    private double ingredientNutrientValue;
    private double percentOfNutrientPerGram;
    private double dishWeight;

    public RecipeLineItems() {
    }

    public int getRecipeLineItemId() {
        return recipeLineItemId;
    }

    public void setRecipeLineItemId(int recipeLineItemId) {
        this.recipeLineItemId = recipeLineItemId;
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

    public int getServingSize() {
        return servingSize;
    }

    public void setServingSize(int servingSize) {
        this.servingSize = servingSize;
    }

    public double getDishWeight() {
        return dishWeight;
    }

    public void setDishWeight(double dishWeight) {
        this.dishWeight = dishWeight;
    }

    // (Steps 1&2 are in Recipe.java) calculate values for each nutrient for diplay as a chart line item
    public double getCalorieSum() {
        // 3) calculate percentage of each nutrient per gram
        percentOfNutrientPerGram = Calculate.nutrientsPerGram(ingredient.getCalories(), servingSize);
        // 4) find the total value for each nutrient in each ingredient
        ingredientNutrientValue = totalNutrientValueInIngredient(percentOfNutrientPerGram, recipe.getAmtToGrams());
        return ingredientNutrientValue;        
    }
    public double getFatSum() {
        percentOfNutrientPerGram = Calculate.nutrientsPerGram(ingredient.getFat(), servingSize);
        ingredientNutrientValue = totalNutrientValueInIngredient(percentOfNutrientPerGram, recipe.getAmtToGrams());
        return ingredientNutrientValue;        
    }
    public double getCholesterolSum() {
        percentOfNutrientPerGram = Calculate.nutrientsPerGram(ingredient.getCholesterol(), servingSize);
        ingredientNutrientValue = totalNutrientValueInIngredient(percentOfNutrientPerGram, recipe.getAmtToGrams());
        return ingredientNutrientValue;        
    }
    public double getSodiumSum() {
        percentOfNutrientPerGram = Calculate.nutrientsPerGram(ingredient.getSodium(), servingSize);
        ingredientNutrientValue = totalNutrientValueInIngredient(percentOfNutrientPerGram, recipe.getAmtToGrams());
        return ingredientNutrientValue;        
    }    
    public double getPotassiumSum() {
        percentOfNutrientPerGram = Calculate.nutrientsPerGram(ingredient.getPotassium(), servingSize);
        ingredientNutrientValue = totalNutrientValueInIngredient(percentOfNutrientPerGram, recipe.getAmtToGrams());
        return ingredientNutrientValue;        
    }
    public double getCarbohydrateSum() {
        percentOfNutrientPerGram = Calculate.nutrientsPerGram(ingredient.getCarbohydrate(), servingSize);
        ingredientNutrientValue = totalNutrientValueInIngredient(percentOfNutrientPerGram, recipe.getAmtToGrams());
        return ingredientNutrientValue;        
    }
    public double getFiberSum() {
        percentOfNutrientPerGram = Calculate.nutrientsPerGram(ingredient.getFiber(), servingSize);
        ingredientNutrientValue = totalNutrientValueInIngredient(percentOfNutrientPerGram, recipe.getAmtToGrams());
        return ingredientNutrientValue;        
    }
    public double getProteinSum() {
        percentOfNutrientPerGram = Calculate.nutrientsPerGram(ingredient.getProtein(), servingSize);
        ingredientNutrientValue = totalNutrientValueInIngredient(percentOfNutrientPerGram, recipe.getAmtToGrams());
        return ingredientNutrientValue;        
    }    
}