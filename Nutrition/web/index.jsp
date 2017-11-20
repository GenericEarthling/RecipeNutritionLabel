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
        <p><i>${message}</i></p>
        <form action="Nutrient" method="post">
            <input type="hidden" name="action_event" value="add">
            <div class="w3-margin-bottom">

                <label>Recipe Name &emsp;</label> 
                <input type="text" name="name" value="${recipe.name}" ><br>
                
                <label>Amount in recipe &emsp;</label> 
                <input type="number" name="amountInRecipe" value="${recipe.amountInRecipe}" >
                
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
                
        <div>
            <h2> Values entered</h2>
            <label>Recipe Name: </label>
            <span>${recipe.name}</span><br>
            <label>Ingredient amount in recipe: </label>
            <span>${recipe.amountInRecipe}</span><br>
            <label>Measurement type: </label>
            <span>${recipe.measurementType}</span><br>
        </div>
    </div>
</body>
</html>