package com.kidusmt.android.animationpractice;

import android.app.ActivityOptions;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public ImageView one, two, three;
    public TextView tv_one, tv_two, tv_three;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv_one = (TextView)findViewById(R.id.tv_rowan);
        tv_two = (TextView)findViewById(R.id.tv_kidus);
        tv_three = (TextView)findViewById(R.id.tv_jobs);
        one = (ImageView)findViewById(R.id.image_one);
        two = (ImageView)findViewById(R.id.image_two);
        three = (ImageView)findViewById(R.id.image_three);

        one.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                SharedElementTransition(1);
            }
        });

        two.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                SharedElementTransition(2);
            }
        });

        three.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                SharedElementTransition(3);
            }
        });
    }

    public void SharedElementTransition(int position){

        switch (position){
            case 1:
                Pair[] pair = new Pair[2];
                pair[0] = new Pair<View, String>(one,"rowan_shared");
                pair[1] = new Pair<View, String>(tv_one,"tv_rowan_shared");
                ActivityOptions options1 = ActivityOptions.makeSceneTransitionAnimation(this,pair);
                Intent i = new Intent(MainActivity.this,OneShareElementAnimationActivity.class);
                startActivity(i,options1.toBundle());
                break;
            case 2:
                Pair[] pair2 = new Pair[2];
                pair2[0] = new Pair<View, String>(two, "kidus_shared");
                pair2[1] = new Pair<View, String>(tv_two, "tv_kidus_shared");
                ActivityOptions options2 = ActivityOptions.makeSceneTransitionAnimation(this,pair2);
                Intent i2 = new Intent(MainActivity.this,TwoSharedElementAnimationTransition.class);
                startActivity(i2,options2.toBundle());
                break;
            case 3:
                Pair[] pair3 = new Pair[2];
                pair3[0] = new Pair<View, String>(three, "jobs_shared");
                pair3[1] = new Pair<View, String>(tv_three,"tv_jobs_shared");
                ActivityOptions options3 = ActivityOptions.makeSceneTransitionAnimation(this,pair3);
                Intent i3 = new Intent(MainActivity.this,ThreeSharedElementAnimationActivity.class);
                startActivity(i3,options3.toBundle());
                break;
            default:

        }

    }
}
