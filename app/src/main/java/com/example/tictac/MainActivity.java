package com.example.tictac;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import static androidx.core.view.ViewCompat.animate;

public class MainActivity extends AppCompatActivity {
    boolean red= false;
    ImageView v11,v2,v3,v4,v5,v6,v7,v8,v9;







    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        (findViewById(R.id.c1)).setTag(1);
        (findViewById(R.id.c2)).setTag(2);
        (findViewById(R.id.c3)).setTag(3);
        (findViewById(R.id.c4)).setTag(4);
        (findViewById(R.id.c5)).setTag(5);
        (findViewById(R.id.c6)).setTag(6);
        (findViewById(R.id.c7)).setTag(7);
        (findViewById(R.id.c8)).setTag(8);
        (findViewById(R.id.c9)).setTag(9);
        v11=(ImageView)findViewById(R.id.c1);
         v2=(ImageView)findViewById(R.id.c2);
        v3=(ImageView)findViewById(R.id.c3);
         v4=(ImageView)findViewById(R.id.c4);
         v5=(ImageView)findViewById(R.id.c5);
         v6=(ImageView)findViewById(R.id.c6);
         v7=(ImageView)findViewById(R.id.c7);
         v8=(ImageView)findViewById(R.id.c8);
         v9=(ImageView)findViewById(R.id.c9);

    }
    public boolean checkWin(){
        int c1=(Integer)(findViewById(R.id.c1)).getTag();
        int c2=(Integer)(findViewById(R.id.c2)).getTag();
        int c3=(Integer)(findViewById(R.id.c3)).getTag();
        int c4=(Integer)(findViewById(R.id.c4)).getTag();
        int c5=(Integer)(findViewById(R.id.c5)).getTag();
        int c6=(Integer)(findViewById(R.id.c6)).getTag();
        int c7=(Integer)(findViewById(R.id.c7)).getTag();
        int c8=(Integer)(findViewById(R.id.c8)).getTag();
        int c9=(Integer)(findViewById(R.id.c9)).getTag();

        if(c1==c2 && c2==c3)
            return true;
        else if(c1==c4 && c4==c7)
            return true;
        else if(c1==c8 && c8==c6)
            return true;
        else if(c2==c8 && c8==c5)
            return true;
        else if(c3==c9 && c9==c6)
            return true;
        else if(c3==c8 && c8==c7)
            return true;
        else if(c4==c8 && c8==c9)
            return true;
        else if(c7==c5 && c5==c6)
            return true;
        else
            return false;

    }


    public void click(View view){
        ImageView v1=(ImageView)view;

        if(red) {
            v1.setImageResource(R.drawable.circle);
            v1.setTag(Integer.valueOf(R.drawable.circle));
            red = false;
            view.setEnabled(false);
            boolean t=checkWin();
            if(t)
            {
                Toast.makeText(this,"O wins",Toast.LENGTH_LONG).show();
                v11.setEnabled(false);
                v2.setEnabled(false);
                v3.setEnabled(false);
                v4.setEnabled(false);
                v5.setEnabled(false);
                v6.setEnabled(false);
                v7.setEnabled(false);
                v8.setEnabled(false);
                v9.setEnabled(false);



            }
        }
        else {
            v1.setImageResource(R.drawable.cross);
            v1.setTag(Integer.valueOf(R.drawable.cross));
            red = true;
            view.setEnabled(false);
            view.setEnabled(false);
            boolean t=checkWin();
            if(t){
                Toast.makeText(this,"X wins",Toast.LENGTH_LONG).show();
                v11.setEnabled(false);
                v2.setEnabled(false);
                v3.setEnabled(false);
                v4.setEnabled(false);
                v5.setEnabled(false);
                v6.setEnabled(false);
                v7.setEnabled(false);
                v8.setEnabled(false);
                v9.setEnabled(false);
            }

        }

    }






    public void reset1(View view){
        Intent intent = getIntent();
        finish();
        startActivity(intent);
}}
