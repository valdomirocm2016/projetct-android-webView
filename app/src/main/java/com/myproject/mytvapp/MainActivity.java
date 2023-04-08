package com.myproject.mytvapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        try {

            WebView myWebView = (WebView) findViewById(R.id.webview);
            myWebView.loadUrl("https://borjao.emerson.tec.br/");

            WebSettings webSettings=myWebView.getSettings();
            webSettings.setJavaScriptEnabled(true);
        }catch(Exception e){
            System.out.print("Excecao no webView");
            e.printStackTrace();

        }
    }
}
