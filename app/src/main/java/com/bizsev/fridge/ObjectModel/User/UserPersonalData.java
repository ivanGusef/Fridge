package com.bizsev.fridge.ObjectModel.User;
import com.bizsev.fridge.ObjectModel.Food.EnumLib.FoodProductType;
import java.util.HashSet;

/**
 * Created by egorb_000 on 31.01.2015.
 */
public class UserPersonalData {
    private int userID;

    private String name;
    private String email;
    private String password;

    private boolean isReviewingOn;
    private HashSet<FoodProductType> foodPrefer;
}
