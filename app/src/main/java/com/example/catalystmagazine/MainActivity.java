package com.example.catalystmagazine;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {
        private WebView mywebview = (WebView) findViewById(R.id.wview);
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            WebSettings webSettings = mywebview.getSettings();
            webSettings.setJavaScriptEnabled(true);
            mywebview.loadUrl("https://fliphtml5.com/dxysr/orpb");
            mywebview.setWebViewClient(new WebViewClient());

        }

        @Override
        public void onBackPressed() {
            if(mywebview.canGoBack()){
                mywebview.goBack();
            }
            else{
                super.onBackPressed();
            }

        }
    }
