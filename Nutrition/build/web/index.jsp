<%-- 
    Document   : index
    Created on : Oct 25, 2017, 7:27:28 PM
    Author     : Tender
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<title>Recipe</title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="styles/w3.css">
<link rel="stylesheet" href="styles/main.css">
<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Raleway">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

<body class="w3-light-grey">
    <!-- FORM BOX FOR SIGNING IN OR SIGNING UP OR GUEST  -->  
    <div class="w3-container w3-white w3-padding-16">
        <form action="SignInServlet" method="post">
            <p><i>${message}</i></p> 
        <div class="w3-row-padding" style="margin:0 -16px;">
          <div class="w3-margin-bottom">
            <label>E-mail address</label>
            <input class="w3-input w3-border" type="email" 
                   placeholder="Enter email" name="email" value="${user.userEmail}" required>
          </div>          
        </div>
        <div class="w3-row-padding" style="margin:8px -16px;">
          <div class="w3-margin-bottom">
            <label>Password</label>
            <input class="w3-input w3-border" type="text" 
                   placeholder="0" name="password" value="${user.userPassword}">
          </div>
        </div>
        <div class="w3-row-padding" style="margin:8px -16px;">
          <div class="w3-margin-bottom">
              <label>Choose one: </label><br>
            <input type="radio" name="user_status" value="Member" > Member 
            <input type="radio" name="user_status" value="New Member" > Sign Up 
            <input type="radio" name="user_status" value="Guest" checked> Guest <br>
          </div>  
        </div>    
        <input class="w3-button w3-dark-grey"  type="submit" value="Continue" 
               class="margin_left">
      </form>
      <!-- END OF FORM BOX FOR SIGN-IN  -->   
    </div>
</body>
</html>