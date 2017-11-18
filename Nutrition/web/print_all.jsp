<%-- 
    Document   : print_all
    Created on : Nov 11, 2017, 5:34:02 PM
    Author     : Tender
--%>

<%@ page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
<title>Recipe</title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="styles/w3.css">
<link rel="stylesheet" href="styles/main.css">
<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Raleway">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

</head>
<body class="w3-light-grey">

<div class="w3-container w3-padding-24" style="margin: auto; width: 800px">
<!--  NUTRITION LABEL  -->
<div class="w3-card-4 w3-border w3-margin-bottom w3-padding" style="width: 320px; margin: auto;">

    <header class="w3-container w3-blue">
        <h3 class="nut-facts"><b>${recipe.name}Recipe Name</b></h3>
    </header>

    <div class="w3-margin-top">
        <h2 class="nut-facts" style="font-family:Impact, Charcoal;color: black;"><b>Nutrition Facts</b></h2>
    </div>   <hr class="nut-line nut-line-1" style="">
    
        <label style="display: inline-block;" >Number of servings in Recipe</label>
        <span class="display-total" >3</span>
        <hr class="nut-line nut-line-1"  style="">
    
        <label style="display: inline-block;" >Single Serving Weight (in grams)</label> 
        <span class="display-total" >3</span>
        <hr class="nut-line nut-line-3" >

        <label style="display: inline-block;" >Calories	&emsp;</label> 
        <span class="display-total" >${recipeChart.totalCalories}3</span>
        <hr class="nut-line nut-line-2" style="">
    
        <label style="display: inline-block;" >Fat &emsp;</label> 
        <span class="display-total" >${recipeChart.totalfat}3</span>
        <hr class="nut-line nut-line-1" style=""> 
    
        <label style="display: inline-block;" >Cholesterol &emsp;</label> 
        <span class="display-total" >${recipeChart.totalcholesterol}3</span>
        <hr class="nut-line nut-line-1" style="">
    
        <label style="display: inline-block;" >Sodium  &emsp;</label> 
        <span class="display-total" >${recipeChart.totalsodium}3</span>
        <hr class="nut-line nut-line-1" style="">       
    
        <label style="display: inline-block;" >Potassium  &emsp;</label> 
        <span class="display-total" >${recipeChart.totalpotassium}3</span>
        <hr class="nut-line nut-line-1" style="">       

        <label style="display: inline-block;" >Carbohydrates  &emsp;</label> 
        <span class="display-total" >${recipeChart.totalcarbohydrates}3</span>
        <hr class="nut-line nut-line-1" style="">      

        <label style="display: inline-block;" >Fiber  &emsp;</label> 
        <span class="display-total" >${recipeChart.totalfiber}3</span>        
        <hr class="nut-line nut-line-1" style="">         

        <label style="display: inline-block;" >Protein  &emsp;</label> 
        <span class="display-total" >${recipeChart.totalprotein}3</span>
        <hr class="nut-line nut-line-2" style="">         
</div><!--  END NUTRITION LABEL  -->

<!--  INGREDIENT & DIRECTIONS TABLES  -->
<div class="w3-margin-top">       
    <!-- INGREDIENT TABLE -->
    <table class="w3-table-all w3-margin-bottom w3-right-align">
        <tr>
            <th>Amount</th>
            <th></th>
            <th style="width: 150px;">Ingredient</th>
            <th>Calories</th>
            <th>Cholesterol</th>
            <th>Sodium</th>
            <th>Potassium</th>
            <th>Carbohydrates</th>
            <th>Fiber</th>
            <th>Protein</th>
        </tr>
        
        <c:forEach var="item" items="${recipeChart.chartLineItems}">
        <tr>
            <td>${item.recipe.amountInRecipe}3</td>
            <td>${item.recipe.measurementType}3</td>
            <td>${item.ingredient.getCalorieSum()} 3</td>
            <td>${item.ingredient.getFatSum()}3</td>
            <td>${item.ingredient.getCholesterolSum()}3</td>
            <td>${item.ingredient.getSodiumSum()}3</td>
            <td>${item.ingredient.getPotassiumSum()}3</td>
            <td>${item.ingredient.getCarbohydrateSum()}3</td>
            <td>${item.ingredient.getFiberSum()}3</td>
            <td>${item.ingredient.getProteinSum()}3</td>
        </tr>
        </c:forEach>
        <tr>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
        </tr>
    </table>    
</div> <!--  END INGREDIENT TABLE  --> 

<!--  DIRECTIONS TABLE  -->
<div>    
    <table class="w3-table-all w3-left-align">
        <tr>
            <th>Directions</th>
        </tr>
        <tr>
            <td>${chartLineItems.recipe.directions} OR ${recipe.directions}</td>
        </tr>
        <tr>            
        </tr>
    </table>   
</div> <!--  END DIRECTIONS TABLE  -->

<!--  OVEN TEMP AND TIME  -->
<div class="w3-margin-top w3-margin-bottom">
    <label style="display: inline-block;" >Recipe Name:   &emsp;</label> 
    <span class="" >${recipe.name}</span><br>
    <label style="display: inline-block;" >Cooking/Setting Temperature:   &emsp;</label> 
    <span class="" >${recipe.temperature}</span><br>
    <label style="display: inline-block;" >Cooking/Setting Time:   &emsp;</label> 
    <span class="" >${recipe.time}</span>    
</div> <!--  END OVEN TEMP AND TIME  -->

</body>
</html>
