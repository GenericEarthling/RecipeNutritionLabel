/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commandline;

import java.io.Serializable;
import model.Calculate;

/**
 *
 * @author Tender
 */
public class IngredBean implements Serializable{
    
    private String ingredientName;
    private int servingSizeInGrams;       // not displayed in Chart
    private double calories;
    private double fat;
    private double cholesterol;
    private double sodium;
    private double potassium;
    private double carbohydrate;
    private double fiber;
    private double protein;
    private double ingredientAmount;
    private double ingredientAmtInGrams;
    private String measurementType;             // example: cups, teas, oz,...    
    
    // default constructor
    public IngredBean() {
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
        this.ingredientAmount = 0;
        this.ingredientAmtInGrams = 0;
        this.measurementType = "";
    }

    // Constructor for saving to file/db
    public IngredBean(String ingredientName, int servingSizeInGrams, 
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
    
    // constructor for commandline
    public IngredBean(String ingredientName, int servingSizeInGrams, 
            double calories, double fat, double cholesterol, 
            double sodium, double potassium, double carbohydrate, 
            double fiber, double protein, double ingredientAmount, 
            String measurementType) {
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
        this.ingredientAmount = ingredientAmount;
        this.measurementType = measurementType;
    }
    

    // getters and setters
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

    public double getIngredientAmount() {
        return ingredientAmount;
    }

    public void setIngredientAmount(double ingredientAmount) {
        this.ingredientAmount = ingredientAmount;
    }

    public String getMeasurementType() {
        return measurementType;
    }

    public void setMeasurementType(String measurementType) {
        this.measurementType = measurementType;
    }

    public double getIngredientAmtInGrams() {
        return ingredientAmtInGrams;
    }

    public void setIngredientAmtInGrams(double ingredientAmtInGrams) {
        this.ingredientAmtInGrams = ingredientAmtInGrams;
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
                + "protein: " + protein + "  "
                + "Ingredient amt: " + ingredientAmount + "  "
                + "Measure Type: " + measurementType + "  "
                + "Amount in Grams: " + ingredientAmtInGrams + "\n";
    } 
}
