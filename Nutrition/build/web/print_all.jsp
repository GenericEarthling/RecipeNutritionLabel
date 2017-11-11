<%-- 
    Document   : print_all
    Created on : Nov 11, 2017, 5:34:02 PM
    Author     : Tender
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
<nav class="w3-bar w3-black">
  <a href="#" class="w3-bar-item w3-button w3-hover-blue">HOME</a>
  <a href="#" class="w3-bar-item w3-button w3-hover-blue">START OVER</a>
  <a href="#" class="w3-bar-item w3-button w3-hover-blue w3-right">PRINT</a>
</nav>
<div class="w3-container w3-padding-24" style="margin: auto; width: 800px">
<!--  NUTRITION LABEL  -->
<div class="w3-card-4 w3-border w3-margin-bottom w3-padding" style="width: 320px; margin: auto;">

    <header class="w3-container w3-blue">
        <h3 class="nut-facts"><b>${recipe.name}</b></h3>
    </header>

    <div class="w3-margin-top">
        <h2 class="nut-facts" style="font-family:Impact, Charcoal;color: black;"><b>Nutrition Facts</b></h2>
    </div>   <hr class="nut-line nut-line-1" style="">
    
        <label style="display: inline-block;" >Number of servings in Recipe</label>
        <span class="display-total" >0</span>
        <hr class="nut-line nut-line-1"  style="">
    
        <label style="display: inline-block;" >Single Serving Weight (in grams)</label> 
        <span class="display-total" >0</span>
        <hr class="nut-line nut-line-3" >

        <label style="display: inline-block;" >Calories	&emsp;</label> 
        <span class="display-total" >0</span>
        <hr class="nut-line nut-line-2" style="">
    
        <label style="display: inline-block;" >Fat &emsp;</label> 
        <span class="display-total" >0</span>
        <hr class="nut-line nut-line-1" style=""> 
    
        <label style="display: inline-block;" >Cholesterol &emsp;</label> 
        <span class="display-total" >0</span>
        <hr class="nut-line nut-line-1" style="">
    
        <label style="display: inline-block;" >Sodium  &emsp;</label> 
        <span class="display-total" >0</span>
        <hr class="nut-line nut-line-1" style="">       
    
        <label style="display: inline-block;" >Potassium  &emsp;</label> 
        <span class="display-total" >0</span>
        <hr class="nut-line nut-line-1" style="">       

        <label style="display: inline-block;" >Carbohydrates  &emsp;</label> 
        <span class="display-total" >510</span>
        <hr class="nut-line nut-line-1" style="">      

        <label style="display: inline-block;" >Fiber  &emsp;</label> 
        <!--<span class="display-total" >0</span>-->
        <input class="w3-border-0 w3-right display-total"   
                   placeholder="0" name="fiber" value="${recipe.totals}">
        <hr class="nut-line nut-line-1" style="">         

        <label style="display: inline-block;" >Protein  &emsp;</label> 
        <span class="display-total" >0</span>
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
        <tr>
            <td class="w3-right-align" >3</td>
            <td class="w3-left-align" >cups</td>
            <td>Sugar by Pubblix</td>
            <td>300</td>
            <td>100</td>
            <td>255</td>
            <td>233</td>
            <td>80</td>
            <td>25</td>
            <td>9</td>
        </tr>
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
            <th></th>
            <th>Directions</th>
        </tr>
        <tr>
            <td></td>
            <td>mix dry ingredients. mix liquid ingredients and stir it into dry ingredients. Bake in oven.</td>
        </tr>
    </table>   
</div> <!--  END DIRECTIONS TABLE  -->

<!--  OVEN TEMP AND TIME  -->
<div class="w3-margin-top w3-margin-bottom">
    <label style="display: inline-block;" >Cooking/Setting Temperature:   &emsp;</label> 
    <span class="" >-32</span><br>
    <label style="display: inline-block;" >Cooking/Setting Time:   &emsp;</label> 
    <span class="" >3 hours</span>    
</div> <!--  END OVEN TEMP AND TIME  -->

</body>
</html>
