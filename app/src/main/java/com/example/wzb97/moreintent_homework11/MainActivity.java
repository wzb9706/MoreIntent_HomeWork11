package com.example.wzb97.moreintent_homework11;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn=(Button)findViewById(R.id.a1toa2);
        Button btn2=(Button)findViewById(R.id.a1toa3);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,Activity2.class);
                startActivityForResult(i,2);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,Activity3.class);
                startActivityForResult(i,3);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(resultCode==2){
            Toast.makeText(MainActivity.this,"From Activity2:"+data.getStringExtra("Message"),Toast.LENGTH_LONG).show();
        }
        if(resultCode==3){
            Toast.makeText(MainActivity.this,"From Activity3:"+data.getStringExtra("Message"),Toast.LENGTH_LONG).show();
        }
    }
}
