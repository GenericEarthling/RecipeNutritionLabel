/*
Ingredient Bean class: This class holds ingredient and gets the nutrient values 

http://www.codejava.net/java-core/collections/java-map-collection-tutorial-and-examples

replace(K key, V value) method replaces the entry for the specified key only 
if it is currently mapping to some value.
public ArrayList(Collection<? extends E> c);
 */
package business;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.*;
import model.Calculate;
import static model.Calculate.totalNutrientValueInRecipe;

/**
 *
 * @author Tender
 */
public class Ingredient implements Serializable {


    private int ingredientId;             // primary key
    private String ingredientName;
    private int servingSizeInGrams;       // not displayed in RecipeChart
    private double calories;
    private double fat;
    private double cholesterol;
    private double sodium;
    private double potassium;
    private double carbohydrate;
    private double fiber;
    private double protein;
    
    // these are not saved to the IngredientDB. They are for display session only.
//    private double ingredientAmount;   // I think this should be deleted MAYBE   
//    private String measurementType;             // example: cups, teas, oz,...
    private double nutrientSum;        // I think this should be deleted along with the getter/setter
    
    // default constructor
    public Ingredient() {
        this.ingredientName = "";
        this.servingSizeInGrams = 0;
        this.calories = 0;
        this.fat = 0;
        this.cholesterol = 0;
        this.sodium = 0;
        this.potassium = 0;
        this.carbohydrate = 0;
        this.fiber = 0;
        this.protein = 0;
    }

    // Constructor for saving to database
    public Ingredient(String ingredientName, int servingSizeInGrams, 
            double calories, double fat, double cholesterol, double sodium, 
            double potassium, double carbohydrate, double fiber, double protein) {
        this.ingredientName = ingredientName;
        this.servingSizeInGrams = servingSizeInGrams;
        this.calories = calories;
        this.fat = fat;
        this.cholesterol = cholesterol;
        this.sodium = sodium;
        this.potassium = potassium;
        this.carbohydrate = carbohydrate;
        this.fiber = fiber;
        this.protein = protein;
    }

    // constructor for saving to session to display in table
    public Ingredient(
            String ingredientName, double calories, double fat, 
            double cholesterol, double sodium, double potassium, 
            double carbohydrate, double fiber, double protein) {
        this.ingredientName = ingredientName;
        this.calories = calories;
        this.fat = fat;
        this.cholesterol = cholesterol;
        this.sodium = sodium;
        this.potassium = potassium;
        this.carbohydrate = carbohydrate;
        this.fiber = fiber;
        this.protein = protein;
    }    

    // getters and setters
    public double getNutrientSum() {
        return nutrientSum;
    }

    public void setNutrientSum(double nutrientSum) {
        this.nutrientSum = nutrientSum;
    }

//    public double getIngredientAmount() {
//        return ingredientAmount;
//    }
//
//    public void setIngredientAmount(double ingredientAmount) {
//        this.ingredientAmount = ingredientAmount;
//    }
//
//    public String getMeasurementType() {
//        return measurementType;
//    }
//
//    public void setMeasurementType(String measurementType) {
//        this.measurementType = measurementType;
//    }
    
    public int getIngredientId() {
        return ingredientId;
    }

    public void setIngredientId(int ingredientId) {
        this.ingredientId = ingredientId;
    }

    public String getIngredientName() {
        return ingredientName;
    }

    public void setIngredientName(String ingredientName) {
        this.ingredientName = ingredientName;
    }

    public int getServingSizeInGrams() {
        return servingSizeInGrams;
    }

    public void setServingSizeInGrams(int ServingSizeInGrams) {
        this.servingSizeInGrams = ServingSizeInGrams;
    }

    public double getCalories() {
        return calories;
    }

    public void setCalories(double calories) {
        this.calories = calories;
    }

    public double getFat() {
        return fat;
    }

    public void setFat(double fat) {
        this.fat = fat;
    }

    public double getCholesterol() {
        return cholesterol;
    }

    public void setCholesterol(double cholesterol) {
        this.cholesterol = cholesterol;
    }

    public double getSodium() {
        return sodium;
    }

    public void setSodium(double sodium) {
        this.sodium = sodium;
    }

    public double getPotassium() {
        return potassium;
    }

    public void setPotassium(double potassium) {
        this.potassium = potassium;
    }

    public double getCarbohydrate() {
        return carbohydrate;
    }

    public void setCarbohydrate(double carbohydrate) {
        this.carbohydrate = carbohydrate;
    }

    public double getFiber() {
        return fiber;
    }

    public void setFiber(double fiber) {
        this.fiber = fiber;
    }

    public double getProtein() {
        return protein;
    }

    public void setProtein(double protein) {
        this.protein = protein;
    }    

    // override toString
    @Override
    public String toString() {
        return "Ingredient "
                + "name: " + ingredientName + "  "
                + "serving size in grams: " + servingSizeInGrams + "  "
                + "calories: " + calories + "  "
                + "fat: " + fat + "  "
                + "cholesterol: " + cholesterol + "  "
                + "sodium: " + sodium + "  "
                + "potassium: " + potassium + "  "
                + "carbohydrate: " + carbohydrate + "  "
                + "fiber: " + fiber + "  "
                + "protein: " + protein + "  ";
    } 
    
}
