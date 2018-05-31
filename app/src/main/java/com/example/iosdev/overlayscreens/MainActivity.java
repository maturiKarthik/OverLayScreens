package com.example.iosdev.overlayscreens;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;

import static com.example.iosdev.overlayscreens.R.id.overlay;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
      RelativeLayout overlay1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Toolbar Code ..
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setTitle("Camera Overlay");


        /**
         * Here Is The Code For OverLay
         * Simply Use FrameLayout For Over Lay .. features
         */

        Button ovButtton = (Button)findViewById(R.id.ovbutton);
        LinearLayout topPanel = (LinearLayout)findViewById(R.id.topPanel);
        overlay1 = (RelativeLayout)findViewById(overlay);






        ovButtton.setOnClickListener(this);
        overlay1.setOnClickListener(this);


    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.


        switch(item.getItemId()){
            case R.id.action_settings:
                Toast t = Toast.makeText(this,"You Clicked on Settings",Toast.LENGTH_LONG);
                t.show();
                break;
            case R.id.home:
                Toast t1 = Toast.makeText(this,"You Clicked on Home",Toast.LENGTH_LONG);
                t1.show();
                break;
        }



        return true;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.ovbutton:
                // TODO Auto-generated method stub
                Intent i=new Intent(MediaStore.ACTION_VIDEO_CAPTURE);
                startActivity(i);
                break;

            case R.id.overlay:
                // Relative Layout ..
                overlay1.setVisibility(View.INVISIBLE);
                break;
        }
    }
}
