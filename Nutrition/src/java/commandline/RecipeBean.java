/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commandline;

import business.Ingredient;
import business.Recipe;
import java.util.List;
import java.util.Objects;
import model.Calculate;

/**
 *
 * @author Tender
 */
public class RecipeBean {
    private int RecipeId;
    private String name;
    private int temperature;
    private String cookTime;
    private String directions;
    
    // one ingredients to many recipes
    private List<Ingredient> ingredients;        
    private double amountInRecipe;
    private String measurementType;

    public RecipeBean() {
        name = "";
        temperature = 0;
        cookTime = "";
        directions = "";
    }

    public RecipeBean(String name, int temperature, String cookTime, String directions, double amountInRecipe, String measurementType) {
        this.name = name;
        this.temperature = temperature;
        this.cookTime = cookTime;
        this.directions = directions;
        this.amountInRecipe = amountInRecipe;
        this.measurementType = measurementType;
    }

    public RecipeBean(List<Ingredient> ingredient, 
            double amountInRecipe, String measurementType) {
        this.ingredients = ingredient;
        this.amountInRecipe = amountInRecipe;
        this.measurementType = measurementType;
    }
     
    // getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public String getCookTime() {
        return cookTime;
    }

    public void setCookTime(String cookTime) {
        this.cookTime = cookTime;
    }

    public List<Ingredient> getIngredients() {            // should these be getting the IngredientId???
        return ingredients;
    }

    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public double getAmountInRecipe() {
        return amountInRecipe;
    }

    public void setAmountInRecipe(double amountInRecipe) {
        this.amountInRecipe = amountInRecipe;
    }

    public String getMeasurementType() {
        return measurementType;
    }

    public void setMeasurementType(String measurementType) {        
        this.measurementType = measurementType;
    }
    
    // 1&2) convert the Ingredient amount in the recipe to the grams equivalent
    //////////////////////////////////////// Not sure about this being here
    public double getAmtToGrams() {
        double amtToGrams = Calculate.amountToGrams(getAmountInRecipe(), getMeasurementType());
        return amtToGrams;
    }
    ///////////////////////////////////////
    
    
    public String getDirections() {
        return directions;
    }

    public void setDirections(String directions) {
        this.directions = directions;
    }

//    public User getUser() {
//        return user;
//    }
//
//    public void setUser(User user) {
//        this.user = user;
//    }

    public int getRecipeId() {
        return RecipeId;
    }

    public void setRecipeId(int RecipeId) {
        this.RecipeId = RecipeId;
    }
  
    @Override
    public String toString() {
        return "Recipe object:::  " 
                + "Name: " + name + "   "
                + "Cooking Time: " + cookTime + "   "
                + "Oven Temp: " + temperature + "   "
                + "Ingredient: " + ingredients + "   "
                + "Measurement type: " + measurementType + "   "
                + "Direction: " + directions;
    }    
}
