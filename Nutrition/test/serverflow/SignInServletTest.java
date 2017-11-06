
package serverflow;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.junit.Test;
import static org.junit.Assert.*;

@WebServlet("/test")
public class SignInServletTest {
    
    public SignInServletTest() {
    }

    /**
     * Test of doGet method, of class SignInServlet.
     */
    @Test
    public void testDoGet() throws Exception {
        System.out.println("doGet");
        HttpServletRequest request = null;
        HttpServletResponse response = null;
        SignInServlet instance = new SignInServlet();
        instance.doGet(request, response);
    }

    /**
     * Test of doPost method, of class SignInServlet.
     */
    @Test
    public void testDoPost() throws Exception {
        System.out.println("doPost");
        HttpServletRequest request = null;
        HttpServletResponse response = null;
        SignInServlet instance = new SignInServlet();
        instance.doPost(request, response);       
    }

    /**
     * Test of getServletInfo method, of class SignInServlet.
     */
    @Test
    public void testGetServletInfo() {
        System.out.println("getServletInfo");
        SignInServlet instance = new SignInServlet();
        String expResult = "";
        String result = instance.getServletInfo();
        assertEquals(expResult, result);
    }
    
}
