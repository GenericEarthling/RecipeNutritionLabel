/*
MainControl class

This needs to move to the individual servlets for Form onlick events
*/
package model;

import business.Ingredient;
import business.Recipe;

public class MainControl {
    // Variables
    private String userEmail;
    private String userPassword;
    private String userChoice;
    private Ingredient newIngredient;
    private Ingredient savedIngredient;
    private Recipe newRecipe;
    private Recipe savedRecipe;
    private String recipeName;
//    private boolean isMember;
//    private boolean isGuest;
//    private boolean isNew;
//    private int choice;
//    private Array String recipeList;
   
    /*     RECIPE ADD-LOAD-SEARCH-SAVE     */
    // search database for recipe 
    public void searchForRecipe() {  
        // TODO
    }
    // load retrieved recipe from DB
    public Recipe loadRecipe() {
        // TODO
        return savedRecipe;
    }
    // add recipe to to session
    public void addRecipeToSession(Recipe newRecipe) {
        // TODO: save recipe to session object
    }
    // save recipe session to the DB
    public void saveRecipeToDB (Recipe newRecipe) {
        // TODO
    }
    
    /*     INGREDIENT ADD-DELETE-LOAD-SEARCH-SAVE-EDIT     */
    // search DB for ingredient object
    public void searchForIngredient() {
        // TODO
    }
    // load retrieved ingredient from DB
    public Ingredient loadIngredient() {
        // TODO
        return savedIngredient;
    }
    // save Ingredient to DB
    public void saveIngredientToDB(Ingredient newIngredient) {
        // TODO
    }
    // add ingredient to recipe session object
    public void addIngredientToRecipe(Ingredient ingredient) {
        // TODO
    }
    // edit ingredient in recipe session object
    public Ingredient editIngredientInRecipe(Ingredient ingredient) {
        // TODO
        return ingredient;
    }
    // delete ingredeint from recipe session object
    public void deleteIngredientFromRecipe(Ingredient ingredient) {
        // TODO
    }
    
    /*     STEP DESCRIPTION ADD-EDIT-DELETE     */
    // add the step and description to recipe session object
    public void addStep(int step, String description) {
        // TODO
    }
    // edit a step in the recipe session object
    public String editStep(int step, String description) {
        // TODO
        return "";
    }
    // delete a step in the recipe session object
    public void deleteStep(int step, String description) {
        // TODO
    }    
    
    /*        VALIDATION METHODS        */
    // validate input from user for step number
    private int validateNumberInput(int number) {
        return number;
    }
    // validate test for recipe name, ingredient name
    private String validateSmallString(String string) {
        // TODO: < 50 characters
        return string;
    }
    // validate test for step description
    private String validateLargeString(String string) {
        // validates against sql injections
        // validates for string input with length < 500 chars
        return string;
    }
    private boolean emailIsValid(String userEmail) {
        // TODO
        return true;
    }
    private boolean passwordIsValid(String userPassword) {
        // TODO
        return true;
    }
    
    // print
    public void printRecipe(Recipe recipe) {
        	// PRINTING FOR ON-CLICK EVENT - RECIPE.HTML 
	// print recipe, nutrition label, and steps	
//	if printSelection == nutrition lable
//		loadGui(print.html)
//		printLabel()
//	else if printSelection == ingredients and directions
//		loadGui(print.html)
//		printRecipe()
//	else if printSelection == all
//		loadGui(print.html)
//		printAll()
    }
    
    public void logOut() {
//        if status = logOut
//            RecipeDB.saveRecipeToDB()
//            foreach (Ingredient in ingredient) {
//                IngredientDB.saveIngredientsToDB()
//            }
//        logOut()	
    }
}