/*
------------  I THINK THIS CLASS IS NOT NEEDED ----------------
SignIn class
initial user entry point
controls on-click events for index.html
 */
package model;

import java.io.Serializable;
import java.util.Objects;

public class SignIn implements Serializable {
    
    private String userEmail;
    private String userPassword;
    private String userStatus;
    
    // default constructor
    public SignIn() {
        this.userEmail = "";
        this.userPassword = "";
    }
    // constructor
    public SignIn(final String userEmail, final String userPassword) {
        this.userEmail = userEmail;
        this.userPassword = userPassword;
    }
    
    // getters and setters
    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(String userStatus) {
        this.userStatus = userStatus;
    }
    
    @Override
    public String toString() {
        return "User email: " + this.userEmail + "User Password: " + this.userPassword;
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 61 * hash + Objects.hashCode(this.userEmail);
        hash = 61 * hash + Objects.hashCode(this.userPassword);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final SignIn other = (SignIn) obj;
        if (!Objects.equals(this.userEmail, other.userEmail)) {
            return false;
        }
        if (!Objects.equals(this.userPassword, other.userPassword)) {
            return false;
        }
        return true;
    }
        
    public int compareTo(SignIn signIn) {
        return this.userEmail.compareTo(signIn.userEmail);
    }


    
}
