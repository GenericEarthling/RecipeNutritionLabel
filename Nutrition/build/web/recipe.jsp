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
<nav class="w3-bar w3-black">
  <a href="#" class="w3-bar-item w3-button w3-hover-blue">HOME</a>
  <a href="#" class="w3-bar-item w3-button w3-hover-blue">START OVER</a>
<!--  <a href="#" class="w3-bar-item w3-button w3-hover-blue w3-right">PRINT</a>-->
</nav>
    
<!-- CONTAINER FOR BOTH TABLES  -->
<div class="w3-container w3-padding-24" style="margin: auto; width: 800px">
    
    <!-- CONTAINER FOR RECIPE  -->    
    <div class="w3-container w3-blue">
        <h1>${recipeName}</h1>
    </div>
        
    <!-- Trigger/Open The Modal -->
    <div class="w3-margin-top w3-margin-bottom">
        <button id="modal-1-btn" class="w3-button w3-red">Add Ingredient</button>
    </div>
    
    <!-- MODAL FORM FOR INGREDIENT INPUT -->
    <div id="modal-1" class="modal w3-animate-top">
    <!-- Modal content -->
    <div class="modal-content">
        <form action="ingredient" method="post" >
            <!-- Modal Cancel button -->
            <div class="">            
                <!--<span class="close">cancel</span>-->
            </div>
            
            <div class="w3-margin-top">
                <h2 class="nut-facts" style="font-family:Impact, Charcoal;"><b>Nutrition Facts</b></h2>
            </div>
            
            <div class="">
                <label style="display: inline-block;" >Ingredient </label>
                <input class="w3-border" style="float: right;" type="text" 
                   placeholder="0" name="ingredientName" value="${Ingredient.ingredientName}"> 
            </div> <hr class="nut-line nut-line-1" >
            
            <div class="">
                <label style="display: inline-block;" >Serving Size from Label (in grams)</label> 
                <input class="w3-border"  style="float: right;" type="number" min="1" max="100" size="5"
                       placeholder="0" name="servingSizeInGrams" value="ingredient.servingSizeInGrams">
            </div> <hr class="nut-line nut-line-3" >
                       
            <div class="">
                <label style="display: inline-block;" >Calories	&emsp;</label> 
                <input class="w3-border" type="number" min="1" max="100" size="5"
                       placeholder="0" name="calories" value="ingredient.calories">
            </div>   <hr class="nut-line nut-line-2" >
            
            <div class="">
                <label style="display: inline-block;" >Fat &emsp;</label> 
                <input class="w3-border" type="number" min="1" max="100" size="5"
                       placeholder="0" name="fat" value="ingredient.fat">
            </div> <hr class="nut-line nut-line-1" style=""> 
            
            <div class="">
                <label style="display: inline-block;" >Cholesterol &emsp;</label> 
                <input class="w3-border" type="number" min="1" max="100" size="5"
                       placeholder="0" name="cholesterol" value="ingredient.cholesterol">
            </div>  <hr class="nut-line nut-line-1" style="">          

            <div class="">
                <label style="display: inline-block;" >Sodium  &emsp;</label> 
                <input class="w3-border" type="number" min="1" max="100" size="5"
                       placeholder="0" name="sodium" value="ingredient.sodium">
            </div>    <hr class="nut-line nut-line-1" style="">        

            <div class="">
                <label style="display: inline-block;" >Potassium  &emsp;</label> 
                <input class="w3-border" type="number" min="1" max="100" size="5"
                       placeholder="0" name="potassium" value="ingredient.potassium">
            </div>     <hr class="nut-line nut-line-1" style="">       

            <div class="">
                <label style="display: inline-block;" >Carbohydrates  &emsp;</label> 
                <input class="w3-border" type="number" min="1" max="100" size="5"
                       placeholder="0" name="carbohydrates" value="ingredient.carbohydrates">
            </div>      <hr class="nut-line nut-line-1" style="">      

            <div class="">
                <label style="display: inline-block;" >Fiber  &emsp;</label> 
                <input class="w3-border" type="number" min="1" max="100" size="5"
                       placeholder="0" name="fiber" value="ingredient.fiber">
            </div>   <hr class="nut-line nut-line-1" style="">         

            <div class="">
                <label style="display: inline-block;" >Protein  &emsp;</label> 
                <input class="w3-border" type="number" min="1" max="100" size="5"
                       placeholder="0" name="protein" value="ingredient.protein">
            </div>   <hr class="nut-line nut-line-2" style="">         

            <div class="w3-margin-bottom">
                <label style="display: inline-block;" >Amount in recipe &emsp;</label> 
                <input class="w3-border" type="number" min="1" max="100" size="5"
                       placeholder="0" name="amount" value="recipe.amount">
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
            <input class="w3-button w3-red"  type="submit" value="Add">
            <input id="closeModal" class="w3-button w3-gray"  type="submit" value="Cancel">
            
        </form>
    </div>
    </div>   <!-- END OF MODAL FORM   -->
    
    <!-- INGREDIENT TABLE -->
    <table class="w3-table-all">
        <tr>
            <th></th>
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
            <td>edit delete</td>
            <td>3</td>
            <td>cups</td>
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
            <td>edit delete</td>
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
        <tr>
            <td>edit delete</td>
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

    <!-- Trigger/Open The DIRECTIONS Modal -->
    <div class="w3-margin-top w3-margin-bottom">
        <button id="modal-2-btn" class="w3-button w3-red">Add Directions</button>
    </div>
    
    <!-- MODAL FORM FOR DIRECTION INPUT -->
    <div id="modal-2" class="modal w3-animate-top">
    <!-- Modal content -->
    <div class="modal-content">
        <form>
            <!-- cancel button -->
            <div class="">            
                <!--<span class="close">cancel</span>-->
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
    </div>   <!-- END OF MODAL-2 FORM   -->    
    
    
    <!-- DIRECTIONS TABLE -->
    <table class="w3-table-all w3-left-align">
        <tr>
            <th></th>
            <th>Directions</th>
        </tr>
        <tr>
            <td>edit delete</td>
            <td></td>
        </tr>
        <tr>
            <td>edit delete</td>
            <td></td>
        </tr>
        <tr>
            <td>edit delete</td>
            <td></td>
        </tr>

    </table>  <!-- END DIRECTIONS TABLE -->


    <div class="w3-container w3-grey w3-padding-16 w3-margin-top">
        <h2>Nutrition Label</h2>
        <label> servings &emsp;</label>
        <input class="w3-border" type="number" min="-32" max="500" size="5"
                       placeholder="0" name="servingSize" value="">
        <label>Total weight after cooking (in oz) &emsp;</label>
        <input class="w3-border" type="number" min="-32" max="500" size="5"
                       placeholder="0" name="servingSize" value="">        
        <button class="w3-button w3-red">Get Nutrition Label</button>
    </div>
</div>
<script>
// INGREDIENT Modal
var modal_1 = document.getElementById('modal-1');
var modal_2 = document.getElementById('modal-2'); 

// Get the button that opens the modal
var modal_1_btn = document.getElementById('modal-1-btn');
var modal_2_btn = document.getElementById("modal-2-btn");

// Get the <span> element that closes the modal
//var cancel = document.getElementsByClassName("close")[0];

// When the user clicks on the button, open the modal 
modal_1_btn.onclick = function() {
    modal_1.style.display = "block";
}
modal_2_btn.onclick = function() {
    modal_2.style.display = "block";
}
// When the user clicks on <span> (x), close the modal
//cancel.onclick = function() {
//    modal.style.display = "none";
//}
</script>

</body>
</html>