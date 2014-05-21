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
