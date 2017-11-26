/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import commandline.IngredBean;
import commandline.IngredList;
import java.util.*;
import model.Calculate;

/**
 *
 * @author Tender
 */
public class Testing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                 
        IngredBean i2 = new IngredBean("Walnuts", 28, 190, 18, 0, 1, 125, 4, 2, 4);
        i2.setIngredientAmount(2);
        i2.setMeasurementType("dry cup");
        double amtInGrams = Calculate.amountToGrams(i2.getIngredientAmount(), i2.getMeasurementType() );
        i2.setIngredientAmtInGrams(amtInGrams); // need this before we can calculate sum totals
        double sumCalories = Calculate.getNutrientSum(i2.getCalories(), i2.getServingSizeInGrams(), amtInGrams);
        

       IngredBean i3 = new IngredBean();
        i3.setIngredientName("Walnuts");
        i3.setCalories(190);
        i3.setFat(18);
        i3.setCholesterol(0);
        i3.setSodium(1);
        i3.setPotassium(125);
        i3.setCarbohydrate(4);
        i3.setFiber(2);
        i3.setProtein(4);
        i3.setServingSizeInGrams(28);
        i3.setIngredientAmount(2);
        i3.setMeasurementType("teaspoon");
        double i3amtInGrams = Calculate.amountToGrams(i3.getIngredientAmount(), i3.getMeasurementType() );
        i3.setIngredientAmtInGrams(i3amtInGrams);

        
        IngredBean i = new IngredBean();
        i.setIngredientName("Trisquit");
        i.setCalories(120);
        i.setFat(4);
        i.setCholesterol(0);
        i.setPotassium(150);
        i.setSodium(115);
        i.setCarbohydrate(20);
        i.setFiber(5);
        i.setProtein(5); 
        i.setServingSizeInGrams(28);
        i.setIngredientAmount(10);
        i.setMeasurementType("dry cup");
        
        Recipe snacks = new Recipe();
        snacks.setDirections("Alternate eating between Trisquit and Walnuts.");
        snacks.setCookTime("5 minutes");
        snacks.setTemperature(76);
        
        // add Items to a list
        IngredList items = new IngredList();
        
        items.addItem(i2);
        items.addItem(i3);
        System.out.println(items);
        
        System.out.println("3121.42 ::: Sum Calories: " + sumCalories);

        
        //////////////// display ingredient list ///////////////////////////
        // get IngredBeanList

        
        
//        System.out.println("ingredient i2 toString:\n" + i2.toString());

    }
    
}
