package com.rk.web_view_ass;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    WebView myweb;
    EditText myurl;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myweb = findViewById(R.id.web);
        myurl = findViewById(R.id.et_url);
        WebSettings webSet = myweb.getSettings();
        webSet.setJavaScriptEnabled(true);
        myweb.setWebViewClient(new WebViewClient());
    }
    public void youtube(View v)
    {
        myweb.loadUrl("https://youtube.com");
    }
    public void kiit(View v)
    {
        myweb.loadUrl("https://kiit.ac.in/");
    }
    public void google(View v)
    {
        myweb.loadUrl("https://google.co.in");
    }
    public void instagram(View v)
    {
        myweb.loadUrl("https://instagram.com");
    }
    public void open_url(View v)
    {
        String s = myurl.getText().toString();
        myweb.loadUrl("https://" + s);
    }
}
