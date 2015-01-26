package com.bizsev.fridge.util;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.Log;

/**
 * May the Force be with you, always.
 * Created on 26.01.2015.
 */
public final class FLog {

    private static final String MAIN_LOGGER = "MainLogger";

    public static void v(@Nullable final String msg) {
        Log.v(MAIN_LOGGER, msg);
    }

    public static void d(@Nullable final String msg) {
        Log.d(MAIN_LOGGER, msg);
    }

    public static void i(@Nullable final String msg) {
        Log.i(MAIN_LOGGER, msg);
    }

    public static void w(@NonNull final Throwable throwable) {
        Log.w(MAIN_LOGGER, throwable.getMessage(), throwable);
    }

    public static void w(@Nullable final String msg) {
        Log.w(MAIN_LOGGER, msg);
    }

    public static void w(@Nullable final String msg, @NonNull final Throwable throwable) {
        Log.w(MAIN_LOGGER, msg, throwable);
    }

    public static void e(@NonNull final Throwable throwable) {
        Log.e(MAIN_LOGGER, throwable.getMessage(), throwable);
    }

    public static void e(@Nullable final String msg) {
        Log.e(MAIN_LOGGER, msg);
    }

    public static void e(@Nullable final String msg, @NonNull final Throwable throwable) {
        Log.e(MAIN_LOGGER, msg, throwable);
    }

    public static void vWithTag(@NonNull final String tag, @Nullable final String msg) {
        Log.v(tag, msg);
    }

    public static void dWithTag(@NonNull final String tag, @Nullable final String msg) {
        Log.d(tag, msg);
    }

    public static void iWithTag(@NonNull final String tag, @Nullable final String msg) {
        Log.i(tag, msg);
    }

    public static void wWithTag(@NonNull final String tag, @NonNull final Throwable throwable) {
        Log.w(tag, throwable.getMessage(), throwable);
    }

    public static void wWithTag(@NonNull final String tag, @Nullable final String msg) {
        Log.w(tag, msg);
    }

    public static void wWithTag(@NonNull final String tag, @Nullable final String msg, @NonNull final Throwable throwable) {
        Log.w(tag, msg, throwable);
    }

    public static void eWithTag(@NonNull final String tag, @NonNull final Throwable throwable) {
        Log.e(tag, throwable.getMessage(), throwable);
    }

    public static void eWithTag(@NonNull final String tag, @Nullable final String msg) {
        Log.e(tag, msg);
    }

    public static void eWithTag(@NonNull final String tag, @Nullable final String msg, @NonNull final Throwable throwable) {
        Log.e(tag, msg, throwable);
    }

    private FLog() {}
}
