<%-- 
    Document   : index
    Created on : Oct 25, 2017, 7:27:28 PM
    Author     : Tender
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>    
    <title>Nutrition App</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="styles/w3.css">
    <link rel="stylesheet" href="styles/main.css">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Raleway">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
</head>
<body class="w3-light-grey">

    <div lass="w3-container w3-white" style="width: 400px; margin: auto;">
        <form action="nutrient" method="post">
            <div class="w3-margin-bottom">
                
                <label style="display: inline-block;" >Amount in recipe &emsp;</label> 
                <input name="amount" value="${recipe.amount}" >
                
                <select name="measurementType">
                  <option value="grams">grams</option>
                  <option value="liquid oz">liquid oz</option>
                  <option value="dry oz">dry oz</option>
                  <option value="teaspoon">teaspoon</option>
                  <option value="tablespoon">tablespoon</option>
                  <option value="milligram">milligram</option>
                  <option value="liquid cup">liquid cup</option>
                  <option value="dry cup">dry cup</option>
                  <option value="liquid pint">liquid pint</option>
                  <option value="dry pint">dry pint</option>
                </select>  
                
            </div>     <hr class="nut-line nut-line-2" style="">           
            <!-- SUBMIT & RESET BUTTONS -->
            <input class="w3-button w3-red"  type="submit" value="Add">
            <input class="w3-button w3-gray" type="reset" value="Reset">            
        </form>   
    </div>
</body>
</html>