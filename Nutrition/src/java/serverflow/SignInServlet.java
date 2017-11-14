/*
post action for signing in, signing up, or guest
specifies which url web page to load for:
    signing up: /index.jsp
    signing in: /recipe.jsp
        pass email value
    guest: /recipe.jsp
        pass email value set to "Guest"
 */
package serverflow;

import business.*;
import static business.User.*;
import data.UserDB;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//import model.SignIn;

/**
 *
 * @author Tender
 */
//@WebServlet("/test")  <form action="test" method="post"> This is the way it is in chap 5
@WebServlet(name = "SignInServlet", urlPatterns = {"/index"})  //-----------not sure about this
public class SignInServlet extends HttpServlet {

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
        String url = "/index.jsp";
        
        // get the parameter from the radio selection -- ' name="status" '
        // <input type="radio" name="status" value="member" > Member
        String userStatus = request.getParameter("status");
        
        // process parameter for radio selection
        if (userStatus == null ) {
            userStatus = "guest";
        }
        if (userStatus == "member") {
            // set to guest for now ----------once DB is working change this
            userStatus = "guest";
        }
        if (userStatus == "newMember") {
            // set to guest for now ----------once DB is working change this
            userStatus = "guest";
        }
        
        // get action. if null, set to join as a default action
        // <form action="
        String action = request.getParameter("action");
        if (action == null) {
            action = "guest";
        }
        
        // perform action and set url to  to appropriate page -----------not sure about this
        if (action.equals("join")) {
            url = "/index.jsp";
        }
        else if (action.equals("add")) {
            // get parameters from the request object
            String userName = request.getParameter("name");
            String userEmail = request.getParameter("email");
            
            // store data in user object
            User user = new User();
            user.setUserName(userName);
            user.setUserEmail(userEmail);
            
            // validate the parameters. if email exists, prompt for new one
            // else add the user to the User Database
            String message;
            if (UserDB.emailExists( user.getUserEmail() )) {
                message = "This email already exists.<br>" +
                        "Please enter another email address.";
                url = "/index.jsp";
            }
            else {
                message = "";
                url = "/recipe.jsp";
                UserDB.insert(user);
            }
            request.setAttribute("user", user);
            request.setAttribute("message", message);
        }
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
