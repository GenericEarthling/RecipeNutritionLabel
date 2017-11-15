/* 
The numbers in parenthesis are the gram equivelent
ex: one liquid oz = 30 grams    or   one dry oz = 28 grams, etc

access by:
import static business.*;
Grams = GramEquivalent.TEASPOON * ingredientAmtInRecipe (2 teaspoons)
 10 =  5 * 2
*/
package business;

public enum GramEquivalent {
    LIQUID_OUNCE(30),
    DRY_OUNCE(28),
    GRAM(1),
    MILLIGRAM(1000),
    TEASPOON(5),
    TABLESPOON(15),
    LIQUID_CUP(240),
    DRY_CUP(230),
    LIQUID_PINT(480),
    DRY_PINT(460);
    
    private int grams;
    private GramEquivalent(int grams) {
        this.grams = grams;
    }
    private int grams() {
        return grams;
    }
}
