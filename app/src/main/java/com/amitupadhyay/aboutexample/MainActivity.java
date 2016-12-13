package com.amitupadhyay.aboutexample;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.amitupadhyay.aboutexample.ui.AboutActivity;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button clickMe = (Button) findViewById(R.id.clickMe);
        clickMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Build.VERSION.SDK_INT < 21) {
                    Toast.makeText(MainActivity.this, "About can't be displayed because api is less than 21", Toast.LENGTH_SHORT).show();
                }
                else if (Build.VERSION.SDK_INT >= 21) {
                    Toast.makeText(MainActivity.this, "Lollipop or greater device", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(MainActivity.this, AboutActivity.class));
                }
            }
        });
    }
}
