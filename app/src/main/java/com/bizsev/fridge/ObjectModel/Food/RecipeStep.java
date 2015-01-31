package com.bizsev.fridge.ObjectModel.Food;

import com.bizsev.fridge.ObjectModel.Food.EnumLib.AmountUnits;
import com.bizsev.fridge.ObjectModel.Food.EnumLib.CookingAction;

/**
 * Created by egorb_000 on 30.01.2015.
 */
public class RecipeStep {
    private int recipeID;
    private int stepID;

    private RecipeStep[] otherSteps;

    private FoodProduct[] products;
    private AmountUnits[] productsAmountUnit;
    private double[] productsAmount;

    private Spice[] spice;
    private AmountUnits[] spiceAmountUnit;
    private double[] spiceAmount;

    private CookingAction[] actions;
    private double[] actionsTime;

    private String comment;
}
