package model;

import business.User;
import org.junit.Test;
import static org.junit.Assert.*;

public class UserTest {
    
    public UserTest() {
    }
    User user1 = new User("Kate@here.com", "pass1");
    User user2 = new User("gale@here.com", "pass2");
    User user3 = new User("Bob@here.com", "pass3");
    User user4a = new User("4a@here.com", "pass4a");
    User user4b = new User("4a@here.com", "pass4a");
    
    /**
     * Test of getUserId method, of class User.
     */
    @Test
    public void testGetUserId() {
        System.out.println("getUserId");
        Integer expResult = null;
        Integer result = user1.getUserId();
        assertEquals(expResult, result);
        Integer id = 234333;
        user2.setUserId(id);
        assertEquals(user2.getUserId(), id);
        System.out.println("user2 id: " + user2.getUserId() + " id: " + id);
    }

    /**
     * Test of setUserId method, of class User.
     */
    @Test
    public void testSetUserId() {
        System.out.println("setUserId");
        Long userId = null;
        assertEquals(userId, user3.getUserId());
        System.out.println("BEFORE:: userId: " + userId + " user3 id: " + user3.getUserId());
    }

    /**
     * Test of getUserEmail method, of class User.
     */
    @Test
    public void testGetUserEmail() {
        System.out.println("getUserEmail");
        String expResult = "Kate@here.com";
        String result = user1.getUserEmail();
        assertEquals(expResult, result);
        assertNotEquals(user1.getUserEmail(), user2.getUserEmail());
        assertEquals(user4a.getUserEmail(), user4b.getUserEmail());
    }

    /**
     * Test of setUserEmail method, of class User.
     */
    @Test
    public void testSetUserEmail() {
        System.out.println("setUserEmail");
        String userEmail = "sally@here.com";
        System.out.println("    userEmail: " + user3.getUserEmail());
        assertNotEquals(userEmail, user3.getUserEmail());
        user3.setUserEmail(userEmail);
        assertEquals(userEmail, user3.getUserEmail());
        System.out.println("    userEmail: " + userEmail);
    }

    /**
     * Test of getUserPassword method, of class User.
     */
    @Test
    public void testGetUserPassword() {
        System.out.println("getUserPassword");
        User instance = new User();
        String expResult = "pass2";
        String result = user2.getUserPassword();
        assertEquals(expResult, result);
        String expResult2 = "pass3";
        user3.setUserPassword(expResult2);
        assertEquals(expResult2, user3.getUserPassword());
    }

    /**
     * Test of setUserPassword method, of class User.
     */
    @Test
    public void testSetUserPassword() {
        System.out.println("setUserPassword");
        String userPassword = "pass1";
        user1.setUserPassword(userPassword);
        assertEquals(userPassword, user1.getUserPassword());
    }

    /**
     * Test of hashCode method, of class User.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        int expResult = 0;
        int result = user4a.hashCode();
        int result2 = user4b.hashCode();
        assertNotEquals(expResult, result);
        assertEquals(result, result2);
        System.out.print("result: " + result + " result2: " + result2 + "\n");
    }

    /**
     * Test of equals method, of class User.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        boolean expResult = false;
        boolean result = user2.equals(obj);
        assertEquals(expResult, result);
        String result1 = user4a.getUserPassword();
        String result2 = user2.getUserPassword();
        boolean isEqual = result1.equals(result2);
        assertEquals(expResult, isEqual);
    }

    /**
     * Test of compareTo method, of class User.
     */
    @Test
    public void testCompareTo() {
        System.out.println("compareTo");
        System.out.println(user1.compareTo(user2));
        assertEquals(user4a.getUserEmail(), user4b.getUserEmail());      
    }

    /**
     * Test of toString method, of class User.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        String expResult = "pass1";
        String result = user1.getUserPassword().toString();
        assertEquals(expResult, result);
    }
    
}
