/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
    
    private List<ChartLineItems> item;
    
    public IngredientList() {
        item = new ArrayList<>();
    }
    
    public void setItem(List<ChartLineItems> listItem) {
        item = listItem;
    }
    
    public List<ChartLineItems> getItem() {
        return item;
    }
    
    public int getCount() {
        return item.size();
    }
    
    public void addItem(ChartLineItems items) {
        item.add(items);
    }
    
    // this accesses ChartLineItems id. If it matches "items", then delete line
    public void removeItem(ChartLineItems items) {
        int id = items.getLineItemId();
        // loop through list and find the match to remove it
        for ( int i = 0; i < item.size(); i++ ) {
            ChartLineItems lineItem = item.get(i);
            if (lineItem.equals(id)) {
                item.remove(i);
                return;
            }
        }
    }
}
