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
import java.util.Collection;
import java.util.Objects;
import javax.persistence.*;                        // look this up in javadocs!!
import static javax.persistence.FetchType.EAGER;

@Entity
@Table(name = "recipe")
public class Recipe implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)    
    private Long RecipeId;
    @ManyToOne
    private User user;
    private String name;
    private int temperature;
    private int time;
    private String directions;
    
    // one ingredients to many recipes
    @OneToMany(fetch=EAGER, cascade=CascadeType.PERSIST)
    private Collection<Ingredient> ingredients;        
    private double amountInRecipe;
    private String measurementType;

    public Recipe() {
        name = "";
        temperature = 0;
        time = 0;
        directions = "";
    }

    public Recipe(double amountInRecipe) {
        this.amountInRecipe = amountInRecipe;
    }

    public Recipe(int ovenTemp, int cookTime) {
        this.temperature = ovenTemp;
        this.time = cookTime;
    }

    public Recipe(String name) {
        this.name = name;
    }

    public Recipe(Collection<Ingredient> ingredient, 
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

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public Collection<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(Collection<Ingredient> ingredients) {
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

    public String getDirections() {
        return directions;
    }

    public void setDirections(String directions) {
        this.directions = directions;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Long getRecipeId() {
        return RecipeId;
    }

    public void setRecipeId(Long RecipeId) {
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
                + "Cooking Time: " + time + "   "
                + "Oven Temp: " + temperature + "   "
                + "Ingredient: " + ingredients + "   "
                + "Direction: " + directions;
    }
}
