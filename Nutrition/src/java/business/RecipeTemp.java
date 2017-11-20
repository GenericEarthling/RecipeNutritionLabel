/*
 * Temporary experimental file
 */
package business;

/**
 *
 * @author Tender
 */
public class RecipeTemp {
    
    private String name;
    private int nameId = 1;
    private double amount;
    private String type;

    public RecipeTemp(String name, double amount, String type) {
        this.name = name;
        this.amount = amount;
        this.type = type;
    }



    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    public Long getNameId() {
//        return nameId;
//    }

    public void setNameId(int nameId) {
        this.nameId = nameId;
    }
    
    
}
