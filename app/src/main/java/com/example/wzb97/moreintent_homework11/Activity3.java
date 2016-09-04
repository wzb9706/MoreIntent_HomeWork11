package com.example.wzb97.moreintent_homework11;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by wzb97 on 2016/9/4.
 */
public class Activity3 extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity3);
        Button btn=(Button)findViewById(R.id.a3toa1);
        Button btn3=(Button)findViewById(R.id.button2);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Activity3.this,MainActivity.class);
                i.putExtra("Message","Somthing");
                setResult(3,i);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

}
