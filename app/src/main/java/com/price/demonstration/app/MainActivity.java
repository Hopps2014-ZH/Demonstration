package com.price.demonstration.app;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.os.Build;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Declarations
        setContentView(R.layout.activity_main);
        final TextView baby = (TextView)findViewById(R.id.a_baby);
        final Button button = (Button)findViewById(R.id.not_a_baby);

        //Initialization
        baby.setText(R.string.baby1);
        button.setText(R.string.bText);

        //Button OnTouchListeners start here
        button.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                baby.setText(R.string.baby2);
                return true;
            }
        });
    }
}
//So, to commit changes and other kinky stuff like that, go to the GitHub app and look
//at the "changes" area. You can commit the changes there. Commit every now and then. If you're adding a new feature,
//please create a new branch, to avoid fucking up the master project. When you think your feature is done,
//and have tested it, you can merge it into the master project in the GitHub application. Cool huh?