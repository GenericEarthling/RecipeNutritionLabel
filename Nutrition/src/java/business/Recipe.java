/*
Recipe class
This class holds ingredients collection and step collection 
User was added for future use

Collection tutorial:
http://www.codejava.net/java-core/collections/java-map-collection-tutorial-and-examples
* replace(K key, V value) method replaces the entry for the specified key only if it is currently mapping to some value.
* public ArrayList(Collection<? extends E> c);
* TreeMap can be alphabetic(ingredients/recipe) or numeric(steps) order
* LinkedHashMap for sorting by insertion order
* Map<Integer, String> steps = new TreeMap<>();
*/
package business;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import model.Calculate;


public class Recipe implements Serializable {
    //    private User user;
   
    private int RecipeId;
    private String name;
    private int temperature;
    private String cookTime;
    private String directions;
    
    // one ingredients to many recipes
    private List<Ingredient> ingredients;        
    private double amountInRecipe;
    private String measurementType;

    public Recipe() {
        name = "";
        temperature = 0;
        cookTime = "";
        directions = "";
    }

    public Recipe(String name, int temperature, String cookTime, String directions, double amountInRecipe, String measurementType) {
        this.name = name;
        this.temperature = temperature;
        this.cookTime = cookTime;
        this.directions = directions;
        this.amountInRecipe = amountInRecipe;
        this.measurementType = measurementType;
    }

    public Recipe(List<Ingredient> ingredient, 
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
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + Objects.hashCode(this.RecipeId);
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
        final Recipe other = (Recipe) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
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
