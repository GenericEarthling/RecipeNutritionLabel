DROP DATABASE IF EXISTS recipe;

CREATE DATABASE recipe;

USE recipe;

CREATE TABLE Ingredient (
IngredientId INT NOT NULL AUTO_INCREMENT,
IngredientName VARCHAR(50),
ServingSize INT,
Calories DOUBLE,
Fat DOUBLE,
Cholesterol DOUBLE,
Sodium DOUBLE,
Potassium DOUBLE,
Carbohydrates DOUBLE,
Fiber DOUBLE, 
Protein DOUBLE,

PRIMARY KEY (IngredientId)
);

CREATE TABLE Recipe (
RecipeId INT NOT NULL AUTO_INCREMENT,
IngredientId INT NOT NULL DEFAULT '0',
RecipeName VARCHAR(50),
IngredientAmountInRecipe DOUBLE,
MeasurementType VARCHAR(50),
Directions VARCHAR(500),
Temperature INT,
CookTime VARCHAR(60),

PRIMARY KEY (RecipeId),
FOREIGN KEY (IngredientId) REFERENCES Ingredient (IngredientId)
);


CREATE TABLE IngredientList (
IngredientListId INT NOT NULL AUTO_INCREMENT,
IngredientId INT NOT NULL DEFAULT '0',
SubTotalCalories DOUBLE,
SubTotalFat DOUBLE,
SubTotalCholesterol DOUBLE,
SubTotalSodium DOUBLE,
SubTotalPotassium DOUBLE,
SubTotalCarbohydrates DOUBLE,
SubTotalFiber DOUBLE, 
SubTotalProtein DOUBLE,

PRIMARY KEY (IngredientListId),
FOREIGN KEY (IngredientId) REFERENCES Ingredient (IngredientId)
);

CREATE TABLE ChartLineItem (
ChartLineItemId INT NOT NULL AUTO_INCREMENT,
RecipeId INT NOT NULL DEFAULT '0',
IngredientListId INT NOT NULL DEFAULT '0',

PRIMARY KEY (ChartLineItemId),
FOREIGN KEY (RecipeId) REFERENCES Recipe (RecipeId),
FOREIGN KEY (IngredientListId) REFERENCES IngredientList (IngredientListId)
);

CREATE TABLE RecipeChart (
RecipeChartId INT NOT NULL AUTO_INCREMENT,
RecipeId INT NOT NULL DEFAULT '0',
ChartLineItemId INT NOT NULL DEFAULT '0',
IngredientListId INT NOT NULL DEFAULT '0',
TotalCalories DOUBLE,
TotalFat DOUBLE,
TotalCholesterol DOUBLE,
TotalSodium DOUBLE,
TotalPotassium DOUBLE,
TotalCarbohydrates DOUBLE,
TotalFiber DOUBLE, 
TotalProtein DOUBLE,

PRIMARY KEY (RecipeChartId),
FOREIGN KEY (ChartLineItemId) REFERENCES ChartLineItem (ChartLineItemId),
FOREIGN KEY (RecipeId) REFERENCES Recipe (RecipeId),
FOREIGN KEY (IngredientListId) REFERENCES IngredientList (IngredientListId)
);

CREATE TABLE RecipeTemp (
RecipeTempId INT NOT NULL AUTO_INCREMENT,
IngredientId INT NOT NULL DEFAULT '0',
RecipeTempName VARCHAR(50),
Amount DOUBLE,
MeasurementType VARCHAR(50),
Directions VARCHAR(500),
Temperature INT,
CookTime VARCHAR(60),

PRIMARY KEY (RecipeTempId),
FOREIGN KEY (IngredientId) REFERENCES Ingredient (IngredientId)
);
