/*
 * Used in Recipe class
 */
package business;

/**
 *
 * @author Tender
 */
public class Steps {
    
    private int step;
    private String description;

    public Steps() {
        step = 0;
        description = "";
    }

    public Steps(int step, String description) {
        this.step = step;
        this.description = description;
    }

    public int getStep() {
        return step;
    }

    public void setStep(int step) {
        this.step = step;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Steps{" + "step=" + step + ", description=" + description + '}';
    }
        
}
