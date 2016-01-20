package com.example.brandnewpeterson.projectzero;

import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.StringRes;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.graphics.PorterDuff;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button but0 = (Button) findViewById(R.id.button0);
        but0.setOnClickListener(this);

        Button but1 = (Button) findViewById(R.id.button1);
        but1.setOnClickListener(this);

        Button but2 = (Button) findViewById(R.id.button2);
        but2.setOnClickListener(this);

        Button but3 = (Button) findViewById(R.id.button3);
        but3.setOnClickListener(this);

        Button but4 = (Button) findViewById(R.id.button4);
        but4.setOnClickListener(this);

        Button but5 = (Button) findViewById(R.id.button5);
        but5.setOnClickListener(this);
        but5.getBackground().setColorFilter(0xFFFF00FF, PorterDuff.Mode.MULTIPLY);



        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
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

    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Main Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app deep link URI is correct.
                Uri.parse("android-app://com.example.brandnewpeterson.projectzero/http/host/path")
        );
        AppIndex.AppIndexApi.start(client, viewAction);
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Main Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app deep link URI is correct.
                Uri.parse("android-app://com.example.brandnewpeterson.projectzero/http/host/path")
        );
        AppIndex.AppIndexApi.end(client, viewAction);
        client.disconnect();
    }

    @Override
    public void onClick(View v) {
        String s = "This button will launch my ";
        Toast t = null;
        switch(v.getId()) {
            case R.id.button0:
                t = Toast.makeText(this, s + getResources().getString(R.string.welcome_button0) + " app.", Toast.LENGTH_SHORT);
                break;
            case R.id.button1:
                t = Toast.makeText(this, s + getResources().getString(R.string.welcome_button1) + ".", Toast.LENGTH_SHORT);
                break;
            case R.id.button2:
                t = Toast.makeText(this, s + getResources().getString(R.string.welcome_button2) + " .", Toast.LENGTH_SHORT);
                break;
            case R.id.button3:
                t = Toast.makeText(this, s + getResources().getString(R.string.welcome_button3) + " app.", Toast.LENGTH_SHORT);
                break;
            case R.id.button4:
                t = Toast.makeText(this, s + getResources().getString(R.string.welcome_button4) + " app.", Toast.LENGTH_SHORT);
                break;
            case R.id.button5:
                t = Toast.makeText(this, s + getResources().getString(R.string.welcome_button5) + ".", Toast.LENGTH_SHORT);
                break;

        }

        if (t != null){
            t.show();
        }
    }
}
