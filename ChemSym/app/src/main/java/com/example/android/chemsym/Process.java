package com.example.android.chemsym;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Process extends AppCompatActivity {

    private WebView mywebView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_process);
        mywebView = (WebView)findViewById(R.id.webV);
        WebSettings webSettings = mywebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        mywebView.loadUrl("https://reverse.photos/#images");



    }

    public void onBackPressed(){
        if(mywebView.canGoBack()){
            mywebView.goBack();
        }
        else {

            super.onBackPressed();
        }
    }


}
