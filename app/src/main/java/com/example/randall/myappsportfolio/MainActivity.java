package com.example.randall.myappsportfolio;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /*** Buttons Toasts ***/
    public void sendMessage(View view) {
        Context myAppContext = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;
        CharSequence toastMsg;
        Toast toast;
        switch (view.getId()){
            case R.id.btnSpotify:
                toastMsg = "This button will launch my Spotify Streamer App";
                toast = Toast.makeText(myAppContext, toastMsg, duration);
                toast.show();
                break;
            case R.id.btnScores:
                toastMsg = "This button will launch my Scores App";
                toast = Toast.makeText(myAppContext, toastMsg, duration);
                toast.show();
                break;
            case R.id.btnLibrary:
                toastMsg = "This button will launch my Library App";
                toast = Toast.makeText(myAppContext, toastMsg, duration);
                toast.show();
                break;
            case R.id.btnBigger:
                toastMsg = "This button will launch a Bigger App";
                toast = Toast.makeText(myAppContext, toastMsg, duration);
                toast.show();
                break;
            case R.id.btnReader:
                toastMsg = "This button will launch my XYZ Reader App";
                toast = Toast.makeText(myAppContext, toastMsg, duration);
                toast.show();
                break;
            case R.id.btnCapstone:
                toastMsg = "This button will launch my Capstone App";
                toast = Toast.makeText(myAppContext, toastMsg, duration);
                toast.show();
                break;

        }
    }

}
