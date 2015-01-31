package com.bizsev.fridge.ObjectModel.Food;

import android.media.Image;

import java.util.List;

/**
 * Created by egorb_000 on 31.01.2015.
 */
public class LocalRecipe {
    private int localRecipeID;
    private int userID; // author
    private int reviewID;
    private int globalID;

    private String name;
    private String comment;
    private Image img;

    private List<LocalRecipeStep> steps;
}
