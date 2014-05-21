package com.price.demonstration.app;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.os.Build;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView baby = (TextView)findViewById(R.id.a_baby);
        Button button = (Button)findViewById(R.id.not_a_baby);
        baby.setText("This is a baby.");
        button.setText("An arbitrary button");
    }
}
