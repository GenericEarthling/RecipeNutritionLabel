/*
Ingredient class extends Recipe
This class holds ingredient and gets the nutrient 
values from the nutrient class

http://www.codejava.net/java-core/collections/java-map-collection-tutorial-and-examples

replace(K key, V value) method replaces the entry for the specified key only if it is currently mapping to some value.
public ArrayList(Collection<? extends E> c);
See CoinPurse example
*/
package controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Nutrition extends Ingredient {
    private String listPlaceHolder;          // used in 4th constructor (nutrition name goes here)
    List<NutritionType> nutritionName;
    private double labelServingSizeInGrams;
    private int labelValueMilligrams;
    private double labelValueGrams;
    
    // default Constructor
    public Nutrition() {
        this.nutritionName = new ArrayList<>();
        labelServingSizeInGrams = 0.0;
        labelValueGrams = 0.0;
        labelValueMilligrams = 0;
    }
    // Milligram measurement for sodium, cholesterol, potassium
    public Nutrition(List<NutritionType> nutritionName, double labelServingSizeInGrams, int labelValueMilligrams) {
        this.nutritionName = nutritionName;
        this.labelServingSizeInGrams = labelServingSizeInGrams;
        this.labelValueMilligrams = labelValueMilligrams;
    }
    // gram measurement for the rest of the nutrition values
    public Nutrition(List<NutritionType> nutritionName, double labelServingSizeInGrams, double labelValueGrams) {
        this.nutritionName = nutritionName;
        this.labelServingSizeInGrams = labelServingSizeInGrams;
        this.labelValueGrams = labelValueGrams;
    }

    public Nutrition(String listPlaceHolder, double labelServingSizeInGrams, int labelValueMilligrams) {
        this.listPlaceHolder = listPlaceHolder;
        this.labelServingSizeInGrams = labelServingSizeInGrams;
        this.labelValueMilligrams = labelValueMilligrams;
    }

    public Nutrition(String listPlaceHolder, double labelServingSizeInGrams, double labelValueGrams) {
        this.listPlaceHolder = listPlaceHolder;
        this.labelServingSizeInGrams = labelServingSizeInGrams;
        this.labelValueGrams = labelValueGrams;
    }

    public List<NutritionType> getNutritionName() {
        return nutritionName;
    }

    public void setNutritionName(List<NutritionType> nutritionName) {
        this.nutritionName = nutritionName;
    }

    public double getLabelServingSizeInGrams() {
        return labelServingSizeInGrams;
    }

    public void setLabelServingSizeInGrams(double labelServingSizeInGrams) {
        this.labelServingSizeInGrams = labelServingSizeInGrams;
    }

    public int getLabelValueMilligrams() {
        return labelValueMilligrams;
    }

    public void setLabelValueMilligrams(int labelValueMilligrams) {
        this.labelValueMilligrams = labelValueMilligrams;
    }

    public double getLabelValueGrams() {
        return labelValueGrams;
    }

    public void setLabelValueGrams(double labelValueGrams) {
        this.labelValueGrams = labelValueGrams;
    }

    // override toString()
    @Override
    public String toString() {
        return "Nutrient Class:::  "
                + "Nutrition name: " + this.nutritionName + "   "
                + "Seving Size: " + labelServingSizeInGrams + "  "
                + "Grams: " + labelValueGrams + "   "
                + "Nutrient value: ";
    }
}
