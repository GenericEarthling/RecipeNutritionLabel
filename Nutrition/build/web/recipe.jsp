<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<title>W3.CSS Template</title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="styles/w3.css">
<link rel="stylesheet" href="styles/main.css">
<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Raleway">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

<body class="w3-light-grey">

<!-- Navigation Bar -->
<div class="w3-bar w3-white w3-large">
  <a href="#" class="w3-bar-item w3-button w3-red w3-mobile"><i class="fa fa-cutlery w3-margin-right"></i>Yum</a>
  <a href="#new" class="w3-bar-item w3-button w3-mobile">New Recipe</a>
  <a href="#about" class="w3-bar-item w3-button w3-mobile">Open Recipe</a>
  <a href="#contact" class="w3-bar-item w3-button w3-mobile">Contact</a>
  <a href="#new" class="w3-bar-item w3-button w3-right w3-light-grey w3-mobile">Create your own Nutrition Label now!</a>
</div>

<!-- NEW RECIPE / -->
<header class="w3-display-container w3-content" style="max-width:1500px;">
  <img class="w3-image" src="images/food-531476778.jpg" alt="Fresh Vegetables" style="min-width:1000px" width="1500" height="800">
  <div class="w3-display-middle w3-padding w3-col l6 m8">
    <div class="w3-container w3-red">
      <h2><i class="fa fa-cutlery w3-margin-right"></i>Recipe Name</h2>
    </div>    
    <!-- FORM BOX FOR STARTING NEW RECIPE  -->  
    <div class="w3-container w3-white w3-padding-16">
      <form action="/action_page.php" target="_blank">
        <div class="w3-row-padding" style="margin:0 -16px;">
          <div class="w3-margin-bottom">
            <label>Name</label>
            <input class="w3-input w3-border" type="text" placeholder="Enter Name" name="recipeName" required>
          </div>          
        </div>
        <div class="w3-row-padding" style="margin:8px -16px;">
          <div class="w3-margin-bottom">
            <label>Type of recipe</label>
            <input class="w3-input w3-border" type="text" placeholder="breakfast, entree, etc." name="undecided">
          </div>
        </div>
        <button class="w3-button w3-dark-grey" type="submit"><i class="fa fa-search w3-margin-right"></i> Search availability</button>
      </form>
      <!-- END OF FORM BOX FOR STARTING NEW RECIPE  -->   
    </div>
  </div>
</header>
<!-- END OF NEW RECIPE / -->

<!-- INGREDIENTS TABLE / -->
<!-- STEP/DIRECTION TABLE / -->
<!-- NUTRITION LABEL / -->



<!-- ABOUT SECTION -->    
<!--  <div class="w3-row-padding" id="about">
    <div class="w3-col l4 m7">
      <h3>About</h3>
      <h6>This is a class project. Go easy on my review!</h6>
    </div>
  </div>
-->
    
<!-- SIGN UP FOR EMAIL ALERT /LEAVE OUT FOR NOW -->
<!--  <div class="w3-container w3-padding-32 w3-black w3-opacity w3-card-2 w3-hover-opacity-off" style="margin:32px 0;">
    <h2>Get the best offers first!</h2>
    <p>Join our newsletter.</p>
    <label>E-mail</label>
    <input class="w3-input w3-border" type="text" placeholder="Your Email address">
    <button type="button" class="w3-button w3-red w3-margin-top">Subscribe</button>
  </div>
-->

<!-- CONTACT SECTION /DONE -->
<!--
  <div class="w3-container" id="contact">
    <h2>Contact</h2>
    <p>If you have any comments, please let me know.</p>
    <form action="/action_page.php" target="_blank">
      <p><input class="w3-input w3-padding-16 w3-border" type="text" placeholder="Name" required name="Name"></p>
      <p><input class="w3-input w3-padding-16 w3-border" type="text" placeholder="Email" required name="Email"></p>
      <p><input class="w3-input w3-padding-16 w3-border" type="text" placeholder="Message" required name="Message"></p>
      <p><button class="w3-button w3-black w3-padding-large" type="submit">SEND MESSAGE</button></p>
    </form>
  </div>
-->
<!-- End page content -->
</div>

<!-- FOOTER /DONE -->
<footer class="w3-padding-12 w3-black w3-center w3-margin-top">
  <h6>Find Me On</h6>
  <div class="w3-medium w3-padding-12">
    <i class="fa fa-github w3-hover-opacity">/genericearthling</i>
    <i class="fa fa-twitter w3-hover-opacity">/sharontender</i>
    <i class="fa fa-linkedin w3-hover-opacity">/sharontender</i>
  </div>
  <p class="w3-small">Powered by <a href="https://www.w3schools.com/w3css/default.asp" target="_blank" class="w3-hover-text-green">w3.css</a></p>
</footer>

</body>
</html>
