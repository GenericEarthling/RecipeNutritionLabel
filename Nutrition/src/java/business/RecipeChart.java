/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
    
    // I need to access the nutrient totals
//    public double getIngredientTotals() {
//        double nutrientTotal = 0.0;
//        for (ChartLineItems items : lineItems) {
//            nutrientTotal += item.getTotal();
//        }
//        return nutrientTotal;
//    }
}
