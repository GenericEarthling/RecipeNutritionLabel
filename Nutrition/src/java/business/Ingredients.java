/*
Ingredient class: This class holds ingredient and gets the nutrient values 

http://www.codejava.net/java-core/collections/java-map-collection-tutorial-and-examples

replace(K key, V value) method replaces the entry for the specified key only 
if it is currently mapping to some value.
public ArrayList(Collection<? extends E> c);
 */
package business;

import java.io.Serializable;
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
public class Ingredients implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long ingredientId;
    
    @Column(name = "Amount")
    private double amountInRecipe;
    @Column(name = "Measure Type")
    private String measurementType;
    @OneToMany(mappedBy="ingredient")        // one ingredient to many Recipes?
    @Column(name = "Ingredient")
    private String ingredientName;           
    private double labelServingSizeInGrams;
    private int labelValueMilligrams;
    private double labelValueGrams;
    @Column(name = "Calories")
    private double calories;
    @Column(name = "Fat")
    private double fat;
    @Column(name = "Cholesterol")
    private double cholesterol;
    @Column(name = "Sodium")
    private double sodium;
    @Column(name = "Potassium")
    private double potassium;
    @Column(name = "Carbohydrates")
    private double carbohydrate;
    @Column(name = "Fiber")
    private double fiber;
    @Column(name = "Protein")
    private double protein;
    
    // default constructor
    public Ingredients() {
        this.amountInRecipe = 0;
        this.measurementType = "";
        this.ingredientName = "";
        this.labelServingSizeInGrams = 0;
        this.labelValueMilligrams = 0;
        this.labelValueGrams = 0;
        this.calories = 0;
        this.fat = 0;
        this.cholesterol = 0;
        this.sodium = 0;
        this.potassium = 0;
        this.carbohydrate = 0;
        this.fiber = 0;
        this.protein = 0;
    }

    // Constructor  
    public Ingredients(double amountInRecipe, String measurementType, 
            String ingredientName, double labelServingSizeInGrams, 
            int labelValueMilligrams, double labelValueGrams, double calories, 
            double fat, double cholesterol, double sodium, double potassium, 
            double carbohydrate, double fiber, double protein) {
        this.amountInRecipe = amountInRecipe;
        this.measurementType = measurementType;
        this.ingredientName = ingredientName;
        this.labelServingSizeInGrams = labelServingSizeInGrams;
        this.labelValueMilligrams = labelValueMilligrams;
        this.labelValueGrams = labelValueGrams;
        this.calories = calories;
        this.fat = fat;
        this.cholesterol = cholesterol;
        this.sodium = sodium;
        this.potassium = potassium;
        this.carbohydrate = carbohydrate;
        this.fiber = fiber;
        this.protein = protein;
    }
    
    public Long getIngredientId() {
        return ingredientId;
    }

    public void setIngredientId(Long ingredientId) {
        this.ingredientId = ingredientId;
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

    public String getIngredientName() {
        return ingredientName;
    }

    public void setIngredientName(String ingredientName) {
        this.ingredientName = ingredientName;
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
        int hash = 0;
        hash += (ingredientId != null ? ingredientId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // ALERT !! - this method won't work in the case the ingredientId fields are not set
        if (!(object instanceof Ingredients)) {
            return false;
        }
        Ingredients other = (Ingredients) object;
        if ((this.ingredientId == null && other.ingredientId != null) || (this.ingredientId != null && !this.ingredientId.equals(other.ingredientId))) {
            return false;
        }
        return true;
    }

    // override toString
    @Override
    public String toString() {
        return "Ingredient "
                + "amount: " + amountInRecipe + "  "
                + "measurement: " + measurementType + "  "
                + "name: " + ingredientName + "  "
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
