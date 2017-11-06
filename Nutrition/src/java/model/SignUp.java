/*
 SignUp page for new members
 */
package model;

import java.io.Serializable;
import java.util.Objects;

public class SignUp implements Serializable {
    private String userEmail;
    private String userName;
    private String userPassword;

    public SignUp() {
        userEmail = "";
        userPassword = "";
    }

    public SignUp(String userEmail, String userPassword) {
        this.userEmail = userEmail;
        this.userPassword = userPassword;
    }

    public SignUp(String userEmail, String userName, String userPassword) {
        this.userEmail = userEmail;
        this.userName = userName;
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

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.userEmail);
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
        final SignUp other = (SignUp) obj;
        if (!Objects.equals(this.userEmail, other.userEmail)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "SignUp{" + "userEmail=" + userEmail + ", userPassword=" + userPassword + '}';
    }
    
    
}
