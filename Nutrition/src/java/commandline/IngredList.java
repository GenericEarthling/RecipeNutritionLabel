/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commandline;

import java.util.ArrayList;
import java.util.List;
import model.Calculate;
import commandline.IngredBean.*;

/**
 *
 * @author Tender
 */
public class IngredList {
    
    private List<IngredBean> items;
    public double amountInGrams;    
    
    public IngredList() {
        items = new ArrayList<>();
    }
    
    public void setItem(List<IngredBean> listItems) {
        items = listItems;
    }
    
    public List<IngredBean> getItems() {
        return items;
    }
    
    public int getCount() {
        return items.size();
    }
    
    public void addItem(IngredBean item) {
        items.add(item);
    } 
  
    @Override
    public String toString() {
        return "IngredList items\n" + items ;
    }
    
    
}
