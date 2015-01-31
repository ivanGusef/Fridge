package com.bizsev.fridge.ObjectModel.User;
import com.bizsev.fridge.ObjectModel.Food.*;

import java.util.Date;
import java.util.HashSet;

/**
 * Created by egorb_000 on 31.01.2015.
 */
public class User {
    private int userID;

    private double reviewerRating;
    private double cookRating;

    private Date lastVisitDate;
    private Date registrationDate;

    private UserPersonalData pData;

    private HashSet<LocalRecipe> localRecipes;
    private HashSet<Recipe> bookmarks;

}
