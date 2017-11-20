<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
<style>
    textarea {
        font-size: 12px;
        columns: 60;
        rows: 4;        
    }
    .input-small {
        width: auto;
        
    }
</style>
<body class="w3-light-grey">
<!--<nav class="w3-bar w3-black">
  <a href="#" class="w3-bar-item w3-button w3-hover-blue">HOME</a>
  <a href="#" class="w3-bar-item w3-button w3-hover-blue">START OVER</a>
</nav>-->
    
<!-- CONTAINER FOR ALL  -->
<div class="w3-container w3-padding-24" style="margin: auto; width: 800px">
    
    <!-- CONTAINER FOR RECIPE  -->    
    <div class="w3-container w3-gray w3-block">
        <h1>Create Your Recipe Label</h1>
    </div>
        
    <!-- Trigger/Open The Modal -->
    <div class="w3-container w3-blue w3-padding-16 w3-margin-top w3-margin-bottom">
        <h2><b>Step 1:</b> Enter Ingredients</h2>        
        <button id="modal-1-btn" class="w3-button w3-red">Add Ingredient</button>
    </div>
    
    <!-- MODAL FORM FOR INGREDIENT INPUT -->
    <div id="modal-1" class="modal w3-animate-top">
    <!-- Modal content -->
    <div class="modal-content">
        <form action="<c:url value='/MainControl/addIngredient' />" method="post" >
            <!-- for servlet to process post method  -->
            <input type="hidden" name="ingredientId" value="${ingredient.ingredientId}">
            <!-- Modal Cancel button -->
            <div class="">            
                <span class="close">cancel</span>
            </div>
            
            <div class="w3-margin-top">
                <h2 class="nut-facts" style="font-family:Impact, Charcoal;"><b>Nutrition Facts</b></h2>
            </div>
            
            <div class="">
                <label style="display: inline-block;" >Ingredient </label>
                <input class="w3-border" style="float: right;" type="text" name="ingredientName" value="${ingredient.ingredientName}" > 
            </div> <hr class="nut-line nut-line-1" >
            
            <div class="">
                <label style="display: inline-block;" >Serving Size from Label (in grams)</label> 
                <input class="w3-border"  style="float: right;" type="number" name="servingSizeInGrams" value="ingredient.servingSizeInGrams" >
            </div> <hr class="nut-line nut-line-3" >
                       
            <div class="">
                <label style="display: inline-block;" >Calories	&emsp;</label> 
                <input class="w3-border" type="number" type="number" name="calories" value="${ingredient.calories}" >
            </div>   <hr class="nut-line nut-line-2" >
            
            <div class="">
                <label style="display: inline-block;" >Fat &emsp;</label> 
                <input class="w3-border" type="number" name="fat" value="${ingredient.fat}" >
            </div> <hr class="nut-line nut-line-1" style=""> 
            
            <div class="">
                <label style="display: inline-block;" >Cholesterol &emsp;</label> 
                <input class="w3-border" type="number" name="cholesterol" value="${ingredient.cholesterol}" >
            </div>  <hr class="nut-line nut-line-1" style="">          

            <div class="">
                <label style="display: inline-block;" >Sodium  &emsp;</label> 
                <input class="w3-border" type="number" name="sodium" value="${ingredient.sodium}" >
            </div>    <hr class="nut-line nut-line-1" style="">        

            <div class="">
                <label style="display: inline-block;" >Potassium  &emsp;</label> 
                <input class="w3-border" type="number" name="potassium" value="${ingredient.potassium}" >
            </div>     <hr class="nut-line nut-line-1" style="">       

            <div class="">
                <label style="display: inline-block;" >Carbohydrates  &emsp;</label> 
                <input class="w3-border" type="number" name="carbohydrates" value="${ingredient.carbohydrates}" >
            </div>      <hr class="nut-line nut-line-1" style="">      

            <div class="">
                <label style="display: inline-block;" >Fiber  &emsp;</label> 
                <input class="w3-border" type="number" name="fiber" value="${ingredient.fiber}" >
            </div>   <hr class="nut-line nut-line-1" style="">         

            <div class="">
                <label style="display: inline-block;" >Protein  &emsp;</label> 
                <input class="w3-border" type="number" name="protein" value="${ingredient.protein}" >
            </div>   <hr class="nut-line nut-line-2" style="">         

            <div class="w3-margin-bottom">
                <label style="display: inline-block;" >Amount in recipe &emsp;</label> 
                <input class="w3-border" type="number" name="amount" value="${recipe.amount}" >
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
    </div>   <!-- END OF MODAL FORM   -->
    
    <!-- INGREDIENT TABLE -->
<c:choose>    
    <c:when test="${emptyList != null}">
        <p>Your ingredient list is empty.</p>
    </c:when>
        <c:otherwise>        
        <table class="w3-table-all">
        <tr>
            <th></th>
            <th>Amount</th>
            <th></th>
            <th style="width:150px;">Ingredient</th>
            <th>Calories</th>
            <th>Fat</th>
            <th>Cholesterol</th>
            <th>Sodium</th>
            <th>Potassium</th>
            <th>Carbohydrates</th>
            <th>Fiber</th>
            <th>Protein</th>
        </tr>

        <c:forEach var="item" items="${list.items}">
            <tr>
                <td><!-- REMOVE INGREDIENT BUTTON -->
                    <form action="<c:url value='/main/removeIngredient'/>" method="post">
                    <input type="hidden" name="ingredientId" value="<c:out value='${item.ingredient.ingredientId}'/>">
                    <input type="submit" value="Delete">
                    </form>
                    <!-- This form will need to open the modal and populate the values -->
                    <!--<form action="POINTY-BRACKET-LEFTc:url value='/main/updateIngredient'/POINTY-BRACKET-RIGHT" method="post">
                    <input type="hidden" name="ingredientId" value="POINTY-BRACKET-LEFTc:out value='DOLLAR-SIGN{item.ingredient.ingredientId}'/POINTY-BRACKET-RIGHT">
                    <input type="submit" value="Edit">
                    </form>-->
                </td>
<!-- it seems like these need to access the the ChartLineItems.getCalorieSum() 
I think this is grabbing the input values from the modal
Maybe the values should be saved to a variable in eiter
ChartLineItems file or the mainControl servlet -->
                <td>${item.value.ingredientAmount}</td> 
                <td>${item.value.measurement}</td>
                <td>${item.value.ingredientName}</td>
                <td>${item.value.calories}</td>
                <td>${item.value.fat}</td>
                <td>${item.value.sodium}</td>
                <td>${item.value.potassium}</td>
                <td>${item.value.carbohydrates}</td>
                <td>${item.value.fiber}</td>
                <td>${item.value.protein}</td>
            </tr>            
        </c:forEach>
        
        </table>
    </c:otherwise>
</c:choose>
    
   
    <!-- NUTRITION LABEL BUTTON -->
    <div class="w3-container w3-blue w3-padding-16 w3-margin-top w3-margin-bottom">
        <h2><b>Step 2:</b> Prepare Nutrition Label</h2>
        <form action="<c:url value='/main/showLabel'/>" method="post">
            
            <div class="w3-cell-row">
                Recipe Name &emsp; <input class="w3-input w3-border" type="text" name="name" value="${recipe.name}">                       
            </div>
            
            <div class="w3-cell-row">
                Preparation Directions &emsp; <br><textarea class="w3-input w3-border" type="text" name="directions" value="${recipe.directions}"></textarea>                       
            </div>
            
            <div class="w3-cell-row w3-block w3-margin-top">    
                <div class="w3-container w3-cell">
                    <label> Number of servings &emsp;</label>
                    <input class="w3-input w3-border" type="number" min="1" name="servings" value="${recipe.servings}" required>
                </div>
                <div class="w3-container">
                    <label>Weight after cooking (in oz) &emsp;</label>
                    <input class="w3-input w3-border" type="number" name="weight" value="${recipe.weight}">  
                </div>    
            </div>

            <div class="w3-cell-row w3-block w3-margin-top">    
                <div class="w3-container w3-cell">
                    <label> Cook/Setting Temperature  &emsp;</label>
                    <input class="w3-input w3-border" type="number" name="weight" value="${recipe.temperature}">
                </div>    
                <div class="w3-container w3-cell">
                    <label> Cook/Setting Time &emsp;</label>
                    <input class="w3-input w3-border" type="number" name="weight" value="${recipe.time}">                
                </div>
            </div>
          
            <input class="w3-button w3-red w3-margin-top" name="" value="Get Nutrition Label">         
        </form>
    </div>
<!-- END NUTRITION LABEL BUTTON -->

<!-- COOKIE INFORMATION TABLE -->
<div>
    <h1>Cookies</h1>
    <h4>Cookies used for this web application:</h4>
    <ul>
        <li>Are sent to the server through the browser.</li>
        <li>They only access this particular session.</li>
        <li>They will remain in your browser until you close your browser.</li>
    </ul>
    <table class="w3-table-all w3-left-align" >
        <tr>
            <th>Name</th>
            <th>Value</th>
        </tr>
        <c:forEach var="c" items="${cookie}">
            <tr>
                <td>${c.value.name}</td>
                <td>${c.value.value}</td>
            </tr>
        </c:forEach>
    </table>    
</div>
<!-- END COOKIE INFORMATION TABLE -->
</div> <!-- END CONTAINER FOR ALL  -->

<script>
// INGREDIENT Modal
var modal_1 = document.getElementById('modal-1');

// Get the button that opens the modal
var modal_1_btn = document.getElementById('modal-1-btn');

// Get the <span> element that closes the modal
var cancel = document.getElementsByClassName("close")[0];

// When the user clicks on the button, open the modal 
modal_1_btn.onclick = function() {
    modal_1.style.display = "block";
}
// When the user clicks on <span> (x), close the modal
cancel.onclick = function() {
    modal_1.style.display = "none";
}
</script>

</body>
</html>

<!-- Trigger/Open The DIRECTIONS Modal 
    <div class="w3-margin-top w3-margin-bottom">
        <button id="modal-2-btn" class="w3-button w3-red">Add Directions</button>
    </div>
    
<!-- MODAL FORM FOR DIRECTION INPUT 
    <div id="modal-2" class="modal w3-animate-top">
    <div class="modal-content">
        <form>
<!-- cancel button 
            <div class="">            
                <span class="close">cancel</span>
            </div>
            
            <div class="w3-margin-top">
                <h2 style="font-family:Impact, Charcoal;"><b>Directions</b></h2>
            </div>
            
            <div class="">
                <textarea class="" cols="40" rows="8" name="directions" > </textarea>
            </div>   <hr class="nut-line nut-line-2" style="">                  
                         
            <input class="w3-button w3-red"  type="submit" value="Add">
            <input id="closeModal2" class="w3-button w3-gray"  type="submit" value="Cancel">            
        </form>
    </div>
    </div>   -->
<!-- END OF MODAL-2 FORM   -->   