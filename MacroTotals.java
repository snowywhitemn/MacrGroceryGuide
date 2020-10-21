package edu.metrostate.ics.macrogroceryguide.model;

/**
 *
 */
public class MacroTotals {
    /**
     * Macro Percentages:
     * Protein 30%
     * Carbs 50%
     * Fats 20%
     */
    
    private double fatGrams;
    private double proteinGrams;
    private double carbGrams;
    private double tdee;
    
    private final double FAT_PERCENT = 0.2; 
    private final double PROTEIN_PERCENT = 0.3;
    private final double CARB_PERCENT = 0.5; 
    
    private final int FOUR_CAL_PER_GRAM = 4; 
    private final int NINE_CAL_PER_GRAM = 9; 

    public MacroTotals(double tdee){
        
        this.tdee = tdee;
        this.fatGrams = calcFatGrams();
        this.proteinGrams = calcProteinGrams();
        this.carbGrams = calcCarbGrams();

    }

    /**
     * Calculates the amount in grams of fat the user should have daily based on their TDEE
     * (total daily energy expenditure)
     * @precondition TDEE has been calculated
     * @return fatGrams
     */
    private double calcFatGrams() {
        return ((tdee * FAT_PERCENT) / NINE_CAL_PER_GRAM);
    }

    /**
     * Calculates the amount in grams of protein the user should have daily based on their TDEE
     * @return proteinGrams
     */
    private double calcProteinGrams() {
        return ((tdee * PROTEIN_PERCENT) / FOUR_CAL_PER_GRAM);
    }

    /**
     * Calculated the amount in grams of carbs the user should have daily based on their TDEE
     * @return
     */
    private double calcCarbGrams() {
        return ((tdee * CARB_PERCENT) / FOUR_CAL_PER_GRAM);
    }
}
