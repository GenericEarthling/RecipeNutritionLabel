/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import java.util.*;
import data.IngredientDB;

/**
 *
 * @author Tender
 */
public class Testing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Ingredient i = new Ingredient();
        i = IngredientDB.selectIngredient("Walnuts");
        System.out.println(i);
        
//        // create some basic ingredients for the database
//        Ingredient ingredient1 = new Ingredient();
//        ingredient1.setIngredientName("Steel Cut Oatmeal");
//        ingredient1.setCalories(150);
//        ingredient1.setFat(3);
//        ingredient1.setCholesterol(0);
//        ingredient1.setSodium(0);
//        ingredient1.setPotassium(0);
//        ingredient1.setCarbohydrate(27);
//        ingredient1.setFiber(4);
//        ingredient1.setProtein(5);
//        ingredient1.setServingSizeInGrams(40);
//        
//        Ingredient i2 = new Ingredient();
//        i2.setIngredientName("Walnuts");
//        i2.setCalories(190);
//        i2.setFat(18);
//        i2.setCholesterol(0);
//        i2.setSodium(1);
//        i2.setPotassium(125);
//        i2.setCarbohydrate(4);
//        i2.setFiber(2);
//        i2.setProtein(4);
//        i2.setServingSizeInGrams(28);
//        
//        Ingredient i = new Ingredient();
//        i.setIngredientName("Trisquit");
//        i.setServingSizeInGrams(28);
//        i.setCalories(120);
//        i.setFat(4);
//        i.setCholesterol(0);
//        i.setPotassium(150);
//        i.setSodium(115);
//        i.setCarbohydrate(20);
//        i.setFiber(5);
//        i.setProtein(5);
//                 
//        System.out.println("i: " + i);
//        
//        ChartLineItems cli = new ChartLineItems();
//        System.out.println("cli: " + cli.getAmtOfIngredInGrams());
//        
//        IngredientDB.insert(i);
//        IngredientDB.insert(i2);
//        IngredientDB.insert(ingredient1);
    }
    
}
