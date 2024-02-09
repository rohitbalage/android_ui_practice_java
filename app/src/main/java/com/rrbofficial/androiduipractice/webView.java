package com.rrbofficial.androiduipractice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class  webView extends AppCompatActivity {

    WebView simpleWebView;
    Button loadWebPage, loadFromStaticHtml;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);
        // initiate buttons and a web view
        loadFromStaticHtml = (Button) findViewById(R.id.loadFromStaticHtml);
        loadWebPage = (Button) findViewById(R.id.loadWebPage);
        simpleWebView = (WebView) findViewById(R.id.simpleWebView);

    }

    public void loadWebPage(View view) {

        simpleWebView.setWebViewClient(new MyWebViewClient());
        String url = "https://rrbofficial.com";
        simpleWebView.getSettings().setJavaScriptEnabled(true);
        simpleWebView.loadUrl(url); // load a web page in a web view

    }

    public void loadStaticWebpage(View view) {
        // define static html text
        String customHtml = "<html><body><h1>Hello, Rohit Balage</h1>" +
                "<h1>Heading 1</h1><h2>Heading 2</h2><h3>Heading 3</h3>" +
                "<p>This is a sample paragraph of static HTML In Web view</p>" +
                "</body></html>";
        simpleWebView.loadData(customHtml, "text/html", "UTF-8"); // load html string data in a web view
    }


    private class MyWebViewClient extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }
    }


}

