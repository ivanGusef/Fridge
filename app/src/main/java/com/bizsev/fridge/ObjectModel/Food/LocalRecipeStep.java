package com.bizsev.fridge.ObjectModel.Food;
import com.bizsev.fridge.ObjectModel.Food.EnumLib.*;

/**
 * Created by egorb_000 on 31.01.2015.
 */
public class LocalRecipeStep {
    private int localRecipeID;
    private int stepID;

    private LocalRecipeStep[] otherSteps;

    private String[] products;
    private String[] productsAmountUnit;
    private double[] productsAmount;

    private String[] spice;
    private String[] spiceAmountUnit;
    private double[] spiceAmount;

    private String[] actions;
    private double[] actionsTime;

    private String comment;
}
