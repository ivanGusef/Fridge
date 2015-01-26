package com.bizsev.fridge.ui.activity;

import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.ViewGroup;

/**
 * May the Force be with you, always.
 * Created on 26.01.2015.
 */

public abstract class BaseActivity extends ActionBarActivity {

    @Override
    public void setContentView(final int layoutResID) {
        super.setContentView(layoutResID);
        findViews();
    }

    @Override
    public void setContentView(final View view) {
        super.setContentView(view);
        findViews();
    }

    @Override
    public void setContentView(final View view, final ViewGroup.LayoutParams params) {
        super.setContentView(view, params);
        findViews();
    }

    protected abstract void findViews();
}
