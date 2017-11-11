<%-- 
    Document   : print
    Created on : Oct 25, 2017, 7:31:57 PM
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
<div class="w3-container w3-centered">
<div class="w3-card-4 w3-border w3-margin w3-padding" style="width: 320px">

    <header class="w3-container w3-blue">
        <h3 class="nut-facts"><b>${recipe.name}</b></h3>
    </header>

    <div class="w3-margin-top">
        <h2 class="nut-facts" style="font-family:Impact, Charcoal;color: black;"><b>Nutrition Facts</b></h2>
    </div>   <hr class="nut-line nut-line-1" style="">

    <div class="">
        <label style="display: inline-block;" >Number of servings in Recipe</label>
        <span class="display-total" >0</span>
    </div> <hr class="nut-line nut-line-1"  style="">

    <div class="">
        <label style="display: inline-block;" >Single Serving Weight (in grams)</label> 
        <span class="display-total" >0</span>
    </div> <hr class="nut-line nut-line-3" >

    <div class="">
        <label style="display: inline-block;" >Calories	&emsp;</label> 
        <span class="display-total" >0</span>
    </div>   <hr class="nut-line nut-line-2" style="">

    <div class="">
        <label style="display: inline-block;" >Fat &emsp;</label> 
        <span class="display-total" >0</span>
    </div>    <hr class="nut-line nut-line-1" style=""> 

    <div class="">
        <label style="display: inline-block;" >Cholesterol &emsp;</label> 
        <span class="display-total" >0</span>
    </div>    <hr class="nut-line nut-line-1" style="">          

    <div class="">
        <label style="display: inline-block;" >Sodium  &emsp;</label> 
        <span class="display-total" >0</span>
    </div>    <hr class="nut-line nut-line-1" style="">        

    <div class="">
        <label style="display: inline-block;" >Potassium  &emsp;</label> 
        <span class="display-total" >0</span>
    </div>    <hr class="nut-line nut-line-1" style="">       

    <div class="">
        <label style="display: inline-block;" >Carbohydrates  &emsp;</label> 
        <span class="display-total" >0</span>
    </div>    <hr class="nut-line nut-line-1" style="">      

    <div class="">
        <label style="display: inline-block;" >Fiber  &emsp;</label> 
        <span class="display-total" >0</span>
    </div>   <hr class="nut-line nut-line-1" style="">         

    <div class="">
        <label style="display: inline-block;" >Protein  &emsp;</label> 
        <span class="display-total" >0</span>
    </div>   <hr class="nut-line nut-line-2" style="">           


</div>
</div>       
</body>
</html>
