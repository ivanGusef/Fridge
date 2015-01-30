package ObjectModel;

import java.util.HashMap;

import ObjectModel.EnumLib.AmountUnits;
import ObjectModel.EnumLib.CookingAction;

/**
 * Created by egorb_000 on 30.01.2015.
 */
public class RecipeStep {
    private HashMap<FoodProduct, AmountUnits> products;
    private CookingAction action;
}
