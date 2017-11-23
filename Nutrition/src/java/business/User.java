///*
//User class
//for future use: userPassword is included for this class.
// */
//package business;
//
//import java.io.Serializable;
//import java.util.Objects;
//import javax.persistence.*;
//import javax.xml.bind.annotation.XmlRootElement;
//
///**
// *
// * @author Tender
// */
//@Entity
//@Table(name = "user")
//public class User implements Serializable {
//    @Id
//    @Basic(optional = false)
//    @Column(name = "Email")    
//    private String userEmail;
//    
//    @Column(name = "Name")
//    private String userName;
//   
//    @Column(name = "Password")
//    private String userPassword;
//    
//    // constructors
//    public User() {
//        userName = "";
//        userEmail = "";
//        userPassword = "";
//    }
//
//    public User(String userName, String userEmail) {
//        this.userName = userName;
//        this.userEmail = userEmail;
//    }
//
//    public User(String userName, String userEmail, String userPassword) {
//        this.userName = userName;
//        this.userEmail = userEmail;
//        this.userPassword = userPassword;
//    }
//    
//    // getters and setters
//    public String getUserName() {
//        return userName;
//    }
//
//    public void setUserName(String userName) {
//        this.userName = userName;
//    }
//
//    public String getUserEmail() {
//        return userEmail;
//    }
//
//    public void setUserEmail(String userEmail) {
//        this.userEmail = userEmail;
//    }    
//    
//    public String getUserPassword() {
//        return userPassword;
//    }
//
//    public void setUserPassword(String userPassword) {
//        this.userPassword = userPassword;
//    }
//
//    @Override
//    public int hashCode() {
//        int hash = 5;
//        hash = 47 * hash + Objects.hashCode(this.userEmail);
//        return hash;
//    }   
//
//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj) {
//            return true;
//        }
//        if (obj == null) {
//            return false;
//        }
//        if (getClass() != obj.getClass()) {
//            return false;
//        }
//        final User other = (User) obj;
//        if (!Objects.equals(this.userName, other.userName)) {
//            return false;
//        }
//        if (!Objects.equals(this.userEmail, other.userEmail)) {
//            return false;
//        }
//        if (!Objects.equals(this.userPassword, other.userPassword)) {
//            return false;
//        }
//        return true;
//    }
//
//    public int compareTo(User user) {
//        return this.userEmail.compareTo(user.userEmail);
//    }    
//
//    @Override
//    public String toString() {
//        return "User Bean";
//    }    
//}
