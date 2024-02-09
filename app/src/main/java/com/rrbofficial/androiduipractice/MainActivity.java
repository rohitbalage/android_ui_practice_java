package com.rrbofficial.androiduipractice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gotoMYSQL(View view) {
        Intent it = new Intent(MainActivity.this, mysql_login.class);
        startActivity(it);
    }

    public void gotoThirdPartyLibraries(View view) {
    }

    public void goToGoogleMaps(View view) {
        Intent it = new Intent(MainActivity.this, MapsActivity.class);
        startActivity(it);
    }

    public void goToVolley(View view) {
    }

    public void goToRetrofit(View view) {
    }

    public void goToJsonParsing(View view) {
    }

    public void goToAdapters(View view) {
    }

    public void goToWebView(View view) {
        Intent it = new Intent(MainActivity.this, webView.class);
        startActivity(it);
    }

    public void goToTabs(View view) {
    }

    public void goToExternalStorage(View view) {
    }

    public void goToInternalStorage(View view) {
    }

    public void goToWidgets(View view) {
    }

    public void goToRecycleView(View view) {
    }


    public void goToGoogleAdmob(View view) {
    }

    public void goToGoogleWallet(View view) {
    }

    public void goToLivedata(View view) {
    }
}