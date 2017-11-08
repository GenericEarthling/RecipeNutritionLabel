/*
Recipe class
This class holds ingredient collection and step collection  

http://www.codejava.net/java-core/collections/java-map-collection-tutorial-and-examples

replace(K key, V value) method replaces the entry for the specified key only if it is currently mapping to some value.
public ArrayList(Collection<? extends E> c);
*/
package business;

import java.io.Serializable;
import java.util.Collection;
import java.util.Objects;
import javax.persistence.*;              // look this up in javadocs!!

public class Recipe implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)    
    private Long RecipeId;
    private String name;
    private int ovenTemp;
    private int cookTime;
    private int step;                     // I think these need to be in an arraylist
    private String description;           // I think these need to be in an arraylist
    @OneToMany(mappedBy="recipe")         // Is "recipe" right??
    private Collection<Steps> steps;
    
    @OneToMany(mappedBy="recipe")         // Is "recipe" right??
    private Collection<Ingredients> ingredient;        // ArrayList too??
    
    
    // TreeMap can be alphabetic(ingredient/recipe) or numeric(steps) order
    // LinkedHashMap for sorting by insertion order
//    Map<Integer, String> steps = new TreeMap<>();
    
    // constructors
    public Recipe() {
        name = "";
        ovenTemp = 0;
        cookTime = 0;
        step = 0;
        description = "";
    }    
    // not sure if the ingredient should be different since there
    // are many ingredients  ..........................................
    public Recipe(String name, int ovenTemp, int cookTime, int step, String description, DeleteThisClass ingredient) {
        this.name = name;
        this.ovenTemp = ovenTemp;
        this.cookTime = cookTime;
        this.step = step;
        this.description = description;
//        this.ingredient = ingredient;             // this is a Collection
    }
    
    // getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getOvenTemp() {
        return ovenTemp;
    }

    public void setOvenTemp(int ovenTemp) {
        this.ovenTemp = ovenTemp;
    }

    public int getCookTime() {
        return cookTime;
    }

    public void setCookTime(int cookTime) {
        this.cookTime = cookTime;
    }

    public int getStep() {
        return step;
    }

    public void setStep(int step) {
        this.step = step;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
                + "Oven Temp: " + ovenTemp + "   "
                + "Ingredient: " + ingredient + "   "
                + "Step: " + step + "   "
                + "Description: " + description;
    }

}
