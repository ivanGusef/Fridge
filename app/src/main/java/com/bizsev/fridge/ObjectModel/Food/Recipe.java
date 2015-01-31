package com.bizsev.fridge.ObjectModel.Food;

import android.media.Image;

import java.util.Date;
import java.util.List;

/**
 * Created by egorb_000 on 31.01.2015.
 */
public class Recipe {
    private int recipeID;
    private int userID; // author

    private int numThumbsUp;
    private int numThumbsDown;
    private Date lastBookmarkedDate;

    private String name;
    private String comment;
    private Image img;

    private List<RecipeStep> steps;
}
