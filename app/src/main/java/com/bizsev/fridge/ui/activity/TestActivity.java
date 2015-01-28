package com.bizsev.fridge.ui.activity;

import com.bizsev.fridge.util.FLog;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;

/**
 * May the Force be with you, always.
 * Created on 28.01.2015.
 */
public final class TestActivity extends BaseActivity {

    private int mId;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final View contentView = new FrameLayout(this);
        contentView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                final Intent intent = new Intent(TestActivity.this, TestActivity.class);
                intent.putExtra("id", mId + 1);
                startActivity(intent);
            }
        });
        setContentView(contentView);

        mId = getIntent().getIntExtra("id", 0);
        if (mId == 0) {
            mId = 1;
        }
        setTitle("Activity " + mId);
        FLog.i(mId + ": onCreate");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        FLog.i(mId + ": onRestart");
    }

    @Override
    protected void onStart() {
        super.onStart();
        FLog.i(mId + ": onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        FLog.i(mId + ": onResume");
    }

    @Override
    protected void onPause() {
        FLog.i(mId + ": onPause");
        super.onPause();
    }

    @Override
    protected void onStop() {
        FLog.i(mId + ": onStop");
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        FLog.i(mId + ": onDestroy");
        super.onDestroy();
    }

    @Override
    protected void findViews() {

    }
}
