package com.kidusmt.android.animationpractice;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;


/**
 * Created by KidusMT on 7/15/2017.
 */

public class ThreeSharedElementAnimationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        getWindow().requestFeature(Window.FEATURE_CONTENT_TRANSITIONS);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.three_shared_element_transition);
        initPage();
    }

    private void initPage() {
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Three SharedElement");
    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return super.onSupportNavigateUp();
    }
}
