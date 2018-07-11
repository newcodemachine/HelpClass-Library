package com.example.android.help;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.android.mylibrary.HelpClass;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        HelpClass helpClass = new HelpClass();
        String c = helpClass.join("Hello","Friends Chai Pi lo");
        int d = helpClass.size(c);

        TextView textView1 = (TextView)findViewById(R.id.TextView1);
        TextView textView2 = (TextView)findViewById(R.id.TextView2);

        textView1.setText(c);
        textView2.setText("Length is "+d);
    }
}
