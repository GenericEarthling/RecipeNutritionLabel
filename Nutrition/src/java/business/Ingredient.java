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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Tender
 */
@Entity
@Table(name = "ingredients")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Ingredients.findAll", query = "SELECT i FROM Ingredients i")
    , @NamedQuery(name = "Ingredients.findByIngredientName", query = "SELECT i FROM Ingredients i WHERE i.ingredientName = :ingredientName")})
public class Ingredient implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long ingredientId;
    
    @OneToMany(mappedBy="ingredient")        // one ingredient to many Recipes
    private String ingredientName;
    private double servingSizeInGrams;
    private double calories;
    private double fat;
    private double cholesterol;
    private double sodium;
    private double potassium;
    private double carbohydrate;
    private double fiber;
    private double protein;
    
    // these are not saved to the IngredientDB. They are for display session only.
    private double ingredientAmount;
    private String measurement; 
    
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
    public Ingredient(String ingredientName, double servingSizeInGrams, 
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
    public Ingredient(double ingredientAmount, String measurement,
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
        this.ingredientAmount = ingredientAmount;
        this.measurement = measurement;
    }
    

    public double getIngredientAmount() {
        return ingredientAmount;
    }

    public void setIngredientAmount(double ingredientAmount) {
        this.ingredientAmount = ingredientAmount;
    }

    public String getMeasurement() {
        return measurement;
    }

    public void setMeasurement(String measurement) {
        this.measurement = measurement;
    }
    
    public Long getIngredientId() {
        return ingredientId;
    }

    public void setIngredientId(Long ingredientId) {
        this.ingredientId = ingredientId;
    }

    public String getIngredientName() {
        return ingredientName;
    }

    public void setIngredientName(String ingredientName) {
        this.ingredientName = ingredientName;
    }

    public double getServingSizeInGrams() {
        return servingSizeInGrams;
    }

    public void setServingSizeInGrams(double ServingSizeInGrams) {
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

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + Objects.hashCode(this.ingredientId);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // ALERT !! - this method won't work in the case the ingredientId fields are not set
        if (!(object instanceof Ingredient)) {
            return false;
        }
        Ingredient other = (Ingredient) object;
        if ((this.ingredientId == null && other.ingredientId != null) || (this.ingredientId != null && !this.ingredientId.equals(other.ingredientId))) {
            return false;
        }
        return true;
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
