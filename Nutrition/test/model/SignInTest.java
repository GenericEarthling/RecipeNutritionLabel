
package model;

import org.junit.Test;
import static org.junit.Assert.*;

public class SignInTest {
    
    public SignInTest() {
    }
    
    SignIn instance = new SignIn("signInTest@here.com", "somePassword");    

    /**
     * Test of getUserEmail method, of class SignIn.
     */
    @Test
    public void testGetUserEmail() {
        System.out.println("getUserEmail");
        String expResult = "signInTest@here.com";
        String result = instance.getUserEmail();
        assertEquals(expResult, result);
    }

    /**
     * Test of setUserEmail method, of class SignIn.
     */
    @Test
    public void testSetUserEmail() {
        System.out.println("setUserEmail");
        SignIn instance2 = new SignIn("signInTest@here.com", "somePassword");    
        String userEmail = "test@here.com";
        instance2.setUserEmail(userEmail);
        assertNotEquals(instance2.getUserEmail(), instance.getUserEmail());
    }

    /**
     * Test of getUserPassword method, of class SignIn.
     */
    @Test
    public void testGetUserPassword() {
        System.out.println("getUserPassword");
        String wrongResult = "Password";
        String result = instance.getUserPassword();
        assertNotEquals(wrongResult, result);
    }

    /**
     * Test of setUserPassword method, of class SignIn.
     */
    @Test
    public void testSetUserPassword() {
        System.out.println("setUserPassword");
        String userPassword = "signInPassword";
        instance.setUserPassword(userPassword);
        assertEquals(userPassword, instance.getUserPassword());
    }

    /**
     * Test of toString method, of class SignIn.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        String expResult = "this";
        String result = instance.toString();
        assertNotEquals(expResult, result);
    }

    /**
     * Test of hashCode method, of class SignIn.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
    }

    /**
     * Test of equals method, of class SignIn.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        SignIn instance2 = new SignIn("other@hre.com", "wrongPass");
        boolean expResult = true;
        boolean result = instance.equals(instance2);
        // should be true because the instances are different
        assertNotEquals(expResult, result);  
    }
    
    /**
     * Test of compareTo method, of class SignIn.
     */
    @Test
    public void testCompareTo() {
        System.out.println("compareTo");
        SignIn instance2 = new SignIn("other@hre.com", "wrongPass");
        int expResult = 3;
        int result = instance.compareTo(instance2);
        assertNotEquals(expResult, result);
    }
    
}
