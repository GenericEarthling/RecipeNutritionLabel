/*
 * This class holds the line items for the RecipeChart
 * It also gets each nutrient value for each ingredient
 */
package business;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 *
 * @author Tender
 */
public class ChartLineItems {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long lineItemId;
    
    @OneToOne
    private Ingredient ingredient;
    private int amount;
    private String directions;
    
    
}
