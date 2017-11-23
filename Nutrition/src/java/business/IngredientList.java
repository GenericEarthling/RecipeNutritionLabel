/*
 * This class is used to display the ingredient list in the recipe.jsp table
   linked to RecipeLineItems
    RecipeLineItems are then used to display the final totals in the RecipeChart
 */
package business;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.*;

/**
 *
 * @author Tender
 */
public class IngredientList implements Serializable {
    
    private List<RecipeLineItems> items;
    
    public IngredientList() {
        items = new ArrayList<>();
    }
    
    public void setItem(List<RecipeLineItems> listItems) {
        items = listItems;
    }
    
    public List<RecipeLineItems> getItems() {
        return items;
    }
    
    public int getCount() {
        return items.size();
    }
    
    public void addItem(RecipeLineItems item) {
        items.add(item);
    }
    
    // this accesses RecipeLineItems id. If it matches "item", then delete line
    public void removeItem(RecipeLineItems item) {
        int id = item.getRecipeLineItemId();      // should this be   item.getIngredient().getIngredientId();
        // loop through list and find the match to remove it
        for ( int i = 0; i < items.size(); i++ ) {
            RecipeLineItems lineItem = items.get(i);
            if (lineItem.equals(id)) {      // should this be    lineItem.getIngredient().getIngredientId().equals(id)
                items.remove(i);
                return;
            }
        }
    }
}
