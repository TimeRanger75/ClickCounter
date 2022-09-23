package com.example.clickcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button fel,le;
    private TextView Text;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();


        fel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int szam=Integer.valueOf(Text.getText().toString());
                szam+=1;
                if (szam>0) {
                    Text.setTextColor(Color.parseColor("#00FF00"));
                }

                else if (szam<0) {
                    Text.setTextColor(Color.parseColor("#FF0000"));
                }

                else if(szam==0) {
                    Text.setTextColor(Color.parseColor("#0000FF"));
                }
                Text.setText(String.valueOf(szam));
            }
        });

        le.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int szam=Integer.valueOf(Text.getText().toString());
                szam-=1;
                if (szam>0) {
                    Text.setTextColor(Color.parseColor("#00FF00"));
                }

                else if (szam<0) {
                    Text.setTextColor(Color.parseColor("#FF0000"));
                }

                else if(szam==0) {
                    Text.setTextColor(Color.parseColor("#0000FF"));
                }
                Text.setText(String.valueOf(szam));
            }
        });

        Text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Text.setTextColor(Color.parseColor("#0000FF"));
                Text.setText("0");
            }
        });

    }


    private void init(){
        fel=findViewById(R.id.Fel);
        le=findViewById(R.id.Le);
        Text=findViewById(R.id.textView);
    }
}