/*
 * This class holds the data to be displayed in the Total Nutrion Label view
 * Also calculates running total of nutrient values

 * Used a collection, should it be an ArrayList? Chaned it to List

 * Found this online for setting 2 decimal places:
            DecimalFormat df = new DecimalFormat("#.##");
            or
            value = value.setScale(2, RoundingMode.CEILING) 
 * the 2nd one returns "double cannot be dereferenced" So there is in int in there somewhere.
 */
package business;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author Tender
 */
//@Entity
public class RecipeChart implements Serializable {
    
    //@ManyToOne
//    private User user;
    
    //@OneToMany(fetch=EAGER, cascade=CascadeType.PERSIST)
    private List<RecipeLineItems> lineItems;
    private int recipeChartId;    
    private boolean isProcessed;
            
    // constructor
    public RecipeChart() {
    }
    
    public boolean isIsProcessed() {
        return isProcessed;
    }
    
    public void setIsProcessed(boolean isProcessed) {
        this.isProcessed = isProcessed;
    }

//    public User getUser() {
//        return user;
//    }
//
//    public void setUser(User user) {
//        this.user = user;
//    }

    public List<RecipeLineItems> getLineItems() {
        return lineItems;
    }

    public void setLineItems(List<RecipeLineItems> lineItems) {
        this.lineItems = lineItems;
    }

    public int getRecipeChartId() {
        return recipeChartId;
    }

    public void setRecipeChartId(int recipeChartId) {
        this.recipeChartId = recipeChartId;
    }
    
    // increment the nutrient totals
    public double getCalorieTotals() {
        double totalCalorie = 0.0;
        for (RecipeLineItems lineItem : lineItems) {
                totalCalorie += lineItem.getCalorieSum();
        }
        return totalCalorie;
    }
    public double getFatTotals() {
        double totalFat = 0.0;
        for (RecipeLineItems lineItem : lineItems) {
                totalFat += lineItem.getFatSum();
        }
        return totalFat;
    }
    public double getCholesterolTotals() {
        double totalCholesterol = 0.0;
        for (RecipeLineItems lineItem : lineItems) {
                totalCholesterol += lineItem.getCholesterolSum();
        }
        return totalCholesterol;
    }
    public double getSodiumTotals() {
        double totalSodium = 0.0;
        for (RecipeLineItems lineItem : lineItems) {
                totalSodium += lineItem.getSodiumSum();
        }
        return totalSodium;
    }
    public double getPotassiumTotals() {
        double totalPotassium = 0.0;
        for (RecipeLineItems lineItem : lineItems) {
                totalPotassium += lineItem.getPotassiumSum();
        }
        return totalPotassium;
    }
    public double getCarbohydrateTotals() {
        double totalCarbohydrate = 0.0;
        for (RecipeLineItems lineItem : lineItems) {
                totalCarbohydrate += lineItem.getCarbohydrateSum();
        }
        return totalCarbohydrate;
    }
    public double getFiberTotals() {
        double totalFiber = 0.0;
        for (RecipeLineItems lineItem : lineItems) {
                totalFiber += lineItem.getFiberSum();
        }
        return totalFiber;
    }
    public double getProteinTotals() {
        double totalProtein = 0.0;
        for (RecipeLineItems lineItem : lineItems) {
            totalProtein += lineItem.getProteinSum();
        }
        return totalProtein;
    }

}
