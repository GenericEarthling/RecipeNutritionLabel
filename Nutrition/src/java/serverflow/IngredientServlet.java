/*
 * Handles the Ingredient table for the IngredientBean
 */
package serverflow;

import business.GramEquivalent;
import business.Ingredient;
import business.Recipe;
import data.IngredientDB;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Calculate;

/**
 *
 * @author Tender
 */
@WebServlet(name = "IngredientServlet", urlPatterns = {"/IngredientServlet"})
public class IngredientServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, 
            HttpServletResponse response)
            throws ServletException, IOException {
        
        // get the parameters from the request object
        String name = request.getParameter("ingredientName");
        int servingSize = Integer.parseInt(request.getParameter("servingSizeInGrams"));
        double cal = Double.parseDouble(request.getParameter("calories"));
        double fat = Double.parseDouble(request.getParameter("fat"));
        double chol = Double.parseDouble(request.getParameter("Cholesterol"));
        int sod = Integer.parseInt(request.getParameter("sodium"));
        int pot = Integer.parseInt(request.getParameter("potassium"));
        double carb = Double.parseDouble(request.getParameter("carbohydrates"));
        double fiber = Double.parseDouble(request.getParameter("fiber"));
        double protein = Double.parseDouble(request.getParameter("protein"));
        double amt = Double.parseDouble(request.getParameter("amount"));
        // get value of the selection for name = "measurement type"
        String measure = request.getParameter("measurementType");
        if (measure == null) {
        measure = "grams";
        }  
        
        // check for values less than zero   ||   Have the web form do it??
        
        // store data into Ingredient object
        Ingredient i = new Ingredient();
        i.setIngredientName(name);
        i.setServingSizeInGrams(servingSize);
        i.setCalories(cal);
        i.setFat(fat);
        i.setCholesterol(chol);
        i.setPotassium(pot);
        i.setSodium(sod);
        i.setCarbohydrate(carb);
        i.setFiber(fiber);
        i.setProtein(protein);
        i.setIngredientAmount(amt);  // These 2 are for diplay purposes only, 
        i.setMeasurement(measure);   // they are not saved to ingredientDB
        
        // save this ingredient object to a session
        
        // store recipe amount of the ingredient into recipe object
        Recipe r = new Recipe();
        r.setAmountInRecipe(amt);
        r.setMeasurementType(measure);
        
        // after input validation, save data to database
        Ingredient ingred = new Ingredient(name, servingSize, cal, fat, chol, 
                sod, pot, carb, fiber, protein);
        IngredientDB.insert(ingred);
               
        // 1) Find the gram equivalent from the measurementType
        // 2) Get the amount of the ingredient in grams
        double amtOfIngredInGrams = Calculate.amountToGrams(amt, measure);
        
        // 3) find the percent of each nutrient in each gram. 
        // Use result to multiply by total
        double percentOfCal = Calculate.nutrientsPerGram(cal, servingSize);
        double percentOfFat = Calculate.nutrientsPerGram(fat, servingSize);
        double percentOfChol = Calculate.nutrientsPerGram(chol, servingSize);
        double percentOfSod = Calculate.nutrientsPerGram(sod, servingSize);
        double percentOfPot = Calculate.nutrientsPerGram(pot, servingSize);
        double percentOfCarb = Calculate.nutrientsPerGram(carb, servingSize);
        double percentOfFiber = Calculate.nutrientsPerGram(fiber, servingSize);
        double percentOfProtein = Calculate.nutrientsPerGram(protein, servingSize);
        
        // 4) find the total nutrient for each ingredient
        //    for display on the table
        double totalCal = Calculate.totalNutrientValueInRecipe(percentOfCal, amtOfIngredInGrams);
        double totalFat = Calculate.totalNutrientValueInRecipe(percentOfFat, amtOfIngredInGrams);
        double totalChol = Calculate.totalNutrientValueInRecipe(percentOfChol, amtOfIngredInGrams);
        double totalSod = Calculate.totalNutrientValueInRecipe(percentOfSod, amtOfIngredInGrams);
        double totalPot = Calculate.totalNutrientValueInRecipe(percentOfPot, amtOfIngredInGrams);
        double totalCarb = Calculate.totalNutrientValueInRecipe(percentOfCarb, amtOfIngredInGrams);
        double totalFiber = Calculate.totalNutrientValueInRecipe(percentOfFiber, amtOfIngredInGrams);
        double totalProtein = Calculate.totalNutrientValueInRecipe(percentOfProtein, amtOfIngredInGrams);

        // display the totals in the Recipe.jsp Ingredient table
        // save to a session





        // stay on current jsp page
        String url = "/recipe.jsp";
        // forward to the view
        getServletContext()
                .getRequestDispatcher(url)
                .forward(request, response);

    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
