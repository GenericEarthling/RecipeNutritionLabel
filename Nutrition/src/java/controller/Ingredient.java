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

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Ingredient extends Recipe implements Serializable {
    // variables
    private String ingredientName;
    private double amountInRecipe;
    private String measurementType;
    // this list holds all the enum nutrients. don't know what to do ............
//    ArrayList<String> nutrients = new ArrayList();  // from Nutrient enum
    Map<String, Integer> mapNutrients;
        
    // default constructor
    public Ingredient() {        
        ingredientName = "";
        amountInRecipe = 0;
        measurementType = "";
        this.mapNutrients = new HashMap<>();
    }
    
    // main constructor
    // I don't know how to set the map/arrayList here.......................
    public Ingredient(String ingredientName, double amountInRecipe, 
            String measurementType) {
        this.mapNutrients = new HashMap<>();
        this.ingredientName = ingredientName;
        this.amountInRecipe = amountInRecipe;
        this.measurementType = measurementType;
    }    
    
    // getters and setters
    public String getIngredientName() {
        return ingredientName;
    }
    public void setIngredientName(String ingredientName) {
        this.ingredientName = ingredientName;
    }
    public double getAmountInRecipe() {
        return amountInRecipe;
    }
    public void setAmountInRecipe(Double amountInRecipe) {
        this.amountInRecipe = amountInRecipe;
    }
    public String getMeasurementType() {
        return measurementType;
    }
    public void setMeasurementType(String measurementType) {
        this.measurementType = measurementType;
    }
    public Map<String, Integer> getMapNutrients() {
        return mapNutrients;
    }
    public void setMapNutrients(Map<String, Integer> mapNutrients) {
        this.mapNutrients = mapNutrients;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.ingredientName);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Ingredient other = (Ingredient) obj;
        if (!Objects.equals(this.ingredientName, other.ingredientName)) {
            return false;
        }
        return true;
    }
    
    // override toString
    @Override
    public String toString() {
        return "Ingredient "
                + "name: " + ingredientName + "  "
                + "amount: " + amountInRecipe + "  "
                + "measurement: " + measurementType;
    }
}
