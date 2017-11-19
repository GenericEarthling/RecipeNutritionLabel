/*
 * distributes procedures
 */
package serverflow;

import business.ChartLineItems;
import business.Ingredient;
import business.IngredientList;
import business.RecipeChart;
import data.IngredientDB;
import java.io.IOException;
import java.io.PrintWriter;
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
@WebServlet(name = "MainControl", urlPatterns = {"/MainControl"})
public class MainControl extends HttpServlet {

    // set default url
    private static final String DEFAULT_URL = "/Web Pages/recipe.jsp";
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
        getServletContext()
                .getRequestDispatcher(url)
                .forward(request, response);
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
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet MainControl</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet MainControl at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
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
        return "Short description";
    }// </editor-fold>

    private String addIngredient(HttpServletRequest request, HttpServletResponse response) {
        // Create a session or add another attribute to the current one
        HttpSession session = request.getSession();
        IngredientList list = (IngredientList) session.getAttribute("list");
        if (list == null){
            list = new IngredientList();
        }
        // this is a Long in the ingredient bean   ???
        String ingredientId = request.getParameter("IngredientId");
        Ingredient ingredient = IngredientDB.selectIngredient(ingredientId);
        if (ingredient != null) {
            ChartLineItems lineItems = new ChartLineItems();
            lineItems.setIngredient(ingredient);
            list.addItem(lineItems);
        }
        session.setAttribute("list", list);
        return DEFAULT_URL;
    }
    
    // if time permits ...
    private String updateIngredient(HttpServletRequest request, HttpServletResponse response) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    // removed an ingredient list from the table (recipe.jsp)
    private String removeIngredient(HttpServletRequest request, HttpServletResponse response) {
        HttpSession session = request.getSession();
        IngredientList list = (IngredientList) session.getAttribute("list");
        String id = request.getParameter("ingredientId");
        Ingredient ingredient = IngredientDB.selectIngredient(id);
        if (ingredient != null && list != null) {
            ChartLineItems lineItems = new ChartLineItems();
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
        
        return "/recipe.jsp";
    }
}
