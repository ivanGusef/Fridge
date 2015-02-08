package com.ivangusef.aptxi;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;

/**
 * May the Force be with you, always.
 * Created on 29.01.2015.
 */
public interface AxAdapter<TData> {

    /**
     * Puts model's data on view.
     */
    void post(@Nullable final TData data, @NonNull View view);

    /**
     * Takes data from view and makes from it model's instances
     */
    @Nullable
    TData get(@Nullable TData data, @NonNull final View view);
}
