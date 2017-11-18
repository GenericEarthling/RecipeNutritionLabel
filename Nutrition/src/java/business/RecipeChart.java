/*
 * This class holds the data to be displayed in the Total Nutrion Print view
 */
package business;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import static javax.persistence.FetchType.EAGER;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author Tender
 */
@Entity
public class RecipeChart implements Serializable {
    
    @ManyToOne
    private User user;
    
    @OneToMany(fetch=EAGER, cascade=CascadeType.PERSIST)
    private Collection<ChartLineItems> lineItems;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long chartNumber;    
    private boolean isProcessed;
    double calorieTotal;
    double totalFat;
    double totalCholesterol;
    double totalSodium;
    double totalPotassium;
    double totalCarbohydrate;
    double totalFiber;
    double totalProtein;
            
    // constructor
    public RecipeChart() {
    }
    
    public boolean isIsProcessed() {
        return isProcessed;
    }
    
    public void setIsProcessed(boolean isProcessed) {
        this.isProcessed = isProcessed;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Collection<ChartLineItems> getLineItems() {
        return lineItems;
    }

    public void setLineItems(Collection<ChartLineItems> lineItems) {
        this.lineItems = lineItems;
    }

    public Long getChartNumber() {
        return chartNumber;
    }

    public void setChartNumber(Long chartNumber) {
        this.chartNumber = chartNumber;
    }
    
    // increment the nutrient totals
    public double getCalorieTotals() {
        calorieTotal = 0.0;
        for (ChartLineItems lineItem : lineItems) {
                calorieTotal += lineItem.getCalorieSum();
        }
        return calorieTotal;
    }
    public double getFatTotals() {
        totalFat = 0.0;
        for (ChartLineItems lineItem : lineItems) {
                totalFat += lineItem.getFatSum();
        }
        return totalFat;
    }
    public double getCholesterolTotals() {
        totalCholesterol = 0.0;
        for (ChartLineItems lineItem : lineItems) {
                totalCholesterol += lineItem.getCholesterolSum();
        }
        return totalCholesterol;
    }
    public double getSodiumTotals() {
        totalSodium = 0.0;
        for (ChartLineItems lineItem : lineItems) {
                totalSodium += lineItem.getSodiumSum();
        }
        return totalSodium;
    }
    public double getPotassiumTotals() {
        totalPotassium = 0.0;
        for (ChartLineItems lineItem : lineItems) {
                totalPotassium += lineItem.getPotassiumSum();
        }
        return totalPotassium;
    }
    public double getCarbohydrateTotals() {
        totalCarbohydrate = 0.0;
        for (ChartLineItems lineItem : lineItems) {
                totalCarbohydrate += lineItem.getCarbohydrateSum();
        }
        return totalCarbohydrate;
    }
    public double getFiberTotals() {
        totalFiber = 0.0;
        for (ChartLineItems lineItem : lineItems) {
                totalFiber += lineItem.getFiberSum();
        }
        return totalFiber;
    }
    public double getProteinTotals() {
        totalProtein = 0.0;
        for (ChartLineItems lineItem : lineItems) {
                totalProtein += lineItem.getProteinSum();
        }
        return totalProtein;
    }

}
