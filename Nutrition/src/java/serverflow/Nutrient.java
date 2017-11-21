/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serverflow;

import business.Recipe;
import data.RecipeDB;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Tender
 */
public class Nutrient extends HttpServlet {

    // set default url
    private static final String DEFAULT_URL = "/index.jsp";
    
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
            throws ServletException, IOException {
        doPost(request, response);
    }

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
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, 
            HttpServletResponse response)
            throws ServletException, IOException {
        
        String url = "/index.jsp";
        // get current name="action_event" from jsp
        String actionEvent = request.getParameter("action_event");
        if (actionEvent.equals("add")) {
            // get parameters
            String name = request.getParameter("name");
            double amountInRecipe = Double.parseDouble( request.getParameter("amountInRecipe") );
            String measurementType = request.getParameter("measurementType");
            
            // Store data into Recipe object 
            Recipe recipe = new Recipe(name, amountInRecipe, measurementType);
            
            /*    
            
            MUST VALIDATE PARAMETERS FOR EMPTY OR NULL VALUES  !!!!
            insert 0 if no value is entered
            
            */
            
            
            // validate parameters and set the message to the user
            // whether success or failure
            String message="";
            try {
                if ( RecipeDB.RecipeNameExists(recipe.getName()) ) {
                    message = "This recipe already exists. Please enter another name.";
                    url = DEFAULT_URL;
                }
                else {
                    message = "The ingredient is added";
                    url = DEFAULT_URL;
                    RecipeDB.insert(recipe);
                }
            } catch (NullPointerException e) {
                System.out.println(e);
            }
            request.setAttribute("recipe", recipe);
            request.setAttribute("message", message);
        }
        getServletContext()
                .getRequestDispatcher(url)
                .forward(request, response);
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
