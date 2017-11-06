package model;

import org.junit.Test;
import static org.junit.Assert.*;

public class SignUpTest {
    
    public SignUpTest() {
    }
    SignUp user1 = new SignUp("one@here.com", "pass1");
    SignUp user2 = new SignUp("two@here.com", "pass2");
    SignUp user3 = new SignUp("three@here.com", "pass3");
    
    /**
     * Test of getUserEmail method, of class SignUp.
     */
    @Test
    public void testGetUserEmail() {
        System.out.println("getUserEmail");
        String expResult = "two@here.com";
        user1.setUserEmail(expResult);
        String result = user1.getUserEmail();
        assertEquals(expResult, result);
    }

    /**
     * Test of setUserEmail method, of class SignUp.
     */
    @Test
    public void testSetUserEmail() {
        System.out.println("setUserEmail");
        String userEmail = "";
        user2.setUserEmail(userEmail);
        assertEquals(userEmail, user2.getUserEmail());
    }

    /**
     * Test of getUserPassword method, of class SignUp.
     */
    @Test
    public void testGetUserPassword() {
        System.out.println("getUserPassword");
        String expResult = "password";
        String result = user3.getUserPassword();
        assertNotEquals(expResult, result);
        user3.setUserPassword(expResult);
        assertEquals(expResult, user3.getUserPassword());
    }

    /**
     * Test of setUserPassword method, of class SignUp.
     */
    @Test
    public void testSetUserPassword() {
        System.out.println("setUserPassword");
        String userPassword = "twenty";
        user2.setUserPassword(userPassword);
        assertEquals(userPassword, user2.getUserPassword());
    }

    /**
     * Test of getUserName method, of class SignUp.
     */
    @Test
    public void testGetUserName() {
        System.out.println("getUserName");
        String expResult = null;
        String result = user1.getUserName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setUserName method, of class SignUp.
     */
    @Test
    public void testSetUserName() {
        System.out.println("setUserName");
        String userName = "bob";
        user3.setUserName(userName);
        assertEquals(userName, user3.getUserName());
    }

    /**
     * Test of hashCode method, of class SignUp.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        int expResult = 0;
        int result = user2.hashCode();
        assertNotEquals(expResult, result);
    }

    /**
     * Test of equals method, of class SignUp.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        boolean expResult = false;
        boolean result = user1.equals(obj);
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class SignUp.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        String expResult = "";
        String result = user3.toString();
        assertNotEquals(expResult, result);
        System.out.print(result);
    }    
}
