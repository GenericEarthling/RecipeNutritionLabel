/*
 * this servlet distributes procedures

 *   ************  Main Control Servlet Status  ****************
    NOT DONE                                DONE
    add ingredient (trying to figure out how to bring up an already saved ingred from db)
    delete ingredient
    remove ingredient
    show label (



 */
package serverflow;

import business.RecipeLineItems;
import business.Ingredient;
import business.IngredientList;
import business.RecipeChart;
import data.IngredientDB;
import data.RecipeDB;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Tender
 */
//@WebServlet(name = "MainControl", urlPatterns = {"/MainControl"})
public class MainControl extends HttpServlet {

    // set default url
    private static final String DEFAULT_URL = "/recipe.jsp";
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
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(MainControl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
                String requestURI = request.getRequestURI();
        String url="";
        if (requestURI.endsWith("/addIngredient")) {
            url = addIngredient(request, response);
        } else if (requestURI.endsWith("/updateIngredient")) {
            url = updateIngredient(request, response);
        } else if (requestURI.endsWith("/removeIngredient")) {
            url = removeIngredient(request, response);
        } else if (requestURI.endsWith("/showLabel")) {
            url = showLabel(request, response);
        }
        System.out.println("MainControl Servlet doPost. url: " + url);
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
        doPost(request, response);
    }



    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "MainControl servlet";
    }// </editor-fold>

    private String addIngredient(HttpServletRequest request, HttpServletResponse response) throws SQLException {

        // Create a session or add another attribute to the current one
        HttpSession session = request.getSession();
        IngredientList list = (IngredientList) session.getAttribute("list");
        if (list == null){
            list = new IngredientList();
        }

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
                
        // store data into Ingredient object or load it from database (?)
        String url = "";
        String message = "";
        Ingredient i = new Ingredient(name, servingSize, cal, fat, chol, sod, pot, carb, fiber, protein);
        try {
            if ( IngredientDB.ingredientExists(i.getIngredientName()) ) {
                String id = request.getParameter("IngredientId");
                Ingredient ingredientId = IngredientDB.selectIngredient(id);
                if (ingredientId != null) {
                    RecipeLineItems lineItems = new RecipeLineItems();
                    lineItems.setIngredient(ingredientId);
                    list.addItem(lineItems);
                }                
                message = "This ingredient already exists in Database. " ;
                url = DEFAULT_URL;
            }
            else {
                message = "The ingredient was added";
                url = DEFAULT_URL;
                IngredientDB.insert(i);
            }
        } catch (NullPointerException e) {
            System.out.println(e);
            log("Add ingredient, Catch block: ", e);
        }    
        
        // check to see if ingredient is in DB, if so, get the ingredient 
        // object and save it as a lineItem in the RecipeLineItems object
        // for display on recipe.js page


       
        // save the  ingredientLIST to a session after getting totals
        session.setAttribute("list", list);
        request.setAttribute("ingredient", i);
        request.setAttribute("message", message);
        return DEFAULT_URL;        
    }
    
    // if time permits ...
    private String updateIngredient(HttpServletRequest request, HttpServletResponse response) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    // removed an ingredient list from the table (recipe.jsp)
    private String removeIngredient(HttpServletRequest request, HttpServletResponse response) throws SQLException {
        HttpSession session = request.getSession();
        IngredientList list = (IngredientList) session.getAttribute("list");
        String id = request.getParameter("ingredientId");
        Ingredient ingredient = IngredientDB.selectIngredient(id);
        if (ingredient != null && list != null) {
            RecipeLineItems lineItems = new RecipeLineItems();
            lineItems.setIngredient(ingredient);
            list.removeItem(lineItems);
        }
        return DEFAULT_URL;
    }

    private String showLabel(HttpServletRequest request, HttpServletResponse response) {
        HttpSession session = request.getSession();
        IngredientList list = (IngredientList) session.getAttribute("list");
        
        RecipeChart chart = new RecipeChart();
        chart.setLineItems(chart.getLineItems());
        
        session.setAttribute("chart", chart);
        
        return "/print_all.jsp";
    }
}
