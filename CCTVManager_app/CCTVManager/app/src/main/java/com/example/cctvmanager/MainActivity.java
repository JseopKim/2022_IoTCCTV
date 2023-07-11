package com.example.cctvmanager;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.FrameLayout;


public class MainActivity extends AppCompatActivity {
    FrameLayout fm;
    Button button1;
    Button button2;
    Button button3;
    WebView wv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1=(Button) findViewById(R.id.button1);
        button2=(Button) findViewById(R.id.button2);
        button3=(Button) findViewById(R.id.button3);
        fm = (FrameLayout) findViewById(R.id.frame);
        wv = (WebView) findViewById(R.id.wv);

        wv.getSettings().setJavaScriptEnabled(true);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                wv.loadUrl("http://192.168.97.85:8080/stream");
//                Intent mIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://192.168.97.85:8080/stream"));
//                startActivity(mIntent);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                wv.loadUrl("http://192.168.97.85:5000");
//                Intent mIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://192.168.97.85:5000"));
//                startActivity(mIntent);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}