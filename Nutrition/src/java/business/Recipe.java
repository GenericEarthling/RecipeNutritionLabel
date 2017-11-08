/*
Recipe class
This class holds ingredient collection and step collection  

Collection tutorial:
http://www.codejava.net/java-core/collections/java-map-collection-tutorial-and-examples
* replace(K key, V value) method replaces the entry for the specified key only if it is currently mapping to some value.
* public ArrayList(Collection<? extends E> c);
* TreeMap can be alphabetic(ingredient/recipe) or numeric(steps) order
* LinkedHashMap for sorting by insertion order
* Map<Integer, String> steps = new TreeMap<>();
*/
package business;

import java.io.Serializable;
import java.util.Collection;
import java.util.Objects;
import javax.persistence.*;                        // look this up in javadocs!!

public class Recipe implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)    
    private Long RecipeId;
    @Column(name = "Name")
    private String name;
    @Column(name = "Temp")
    private int temperature;
    @Column(name = "Time")
    private int time;
    @Column(name = "Directions")
    private String[] directions;
    
    @OneToMany(mappedBy="recipe")                 // Is "recipe" right??     FOREIGN KEY???
    private Collection<Ingredient> ingredient;        
    @Column(name = "Amount")
    private double amountInRecipe;
    @Column(name = "Measure Type")
    private String measurementType;

    public Recipe() {
        name = "";
        temperature = 0;
        time = 0;
    }

    public Recipe(int ovenTemp, int cookTime) {
        this.temperature = ovenTemp;
        this.time = cookTime;
    }

    public Recipe(String name) {
        this.name = name;
    }

    public Recipe(String[] directions) {
        this.directions = directions;
    }

    public Recipe(Collection<Ingredient> ingredient, double amountInRecipe, String measurementType) {
        this.ingredient = ingredient;
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

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public Collection<Ingredient> getIngredient() {
        return ingredient;
    }

    public void setIngredient(Collection<Ingredient> ingredient) {
        this.ingredient = ingredient;
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

    public String[] getDirections() {
        return directions;
    }

    public void setDirections(String[] directions) {
        this.directions = directions;
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
                + "Cooking Time: " + time + "   "
                + "Oven Temp: " + temperature + "   "
                + "Ingredient: " + ingredient + "   "
                + "Direction: " + directions[0];
    }
}
