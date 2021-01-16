package com.example.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView  numbers = findViewById(R.id.numbers);
        numbers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(),"Numbers Clicked",Toast.LENGTH_SHORT).show();
                Intent  i = new Intent(MainActivity.this,NumbersActivity.class);
                startActivity(i);
            }
        });


        TextView  family =  findViewById(R.id.family);
        family.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(),"family clicked", Toast.LENGTH_SHORT).show();
                Intent  i = new Intent(MainActivity.this,FamilyActivity.class);
                startActivity(i);
            }
        });

        TextView phrase = findViewById(R.id.phrases);
        phrase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(),"phrase clicked", Toast.LENGTH_SHORT).show();
                Intent  i = new Intent(MainActivity.this,PhrasesActivity.class);
                startActivity(i);
            }
        });


        TextView colors = findViewById(R.id.colors);
        colors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(),"Colors clicked", Toast.LENGTH_SHORT).show();
                Intent  i = new Intent(MainActivity.this,ColorsActivity.class);
                startActivity(i);
            }
        });
    }




//    public  void  numbersCategory(View view){
//        Intent number = new Intent(this,NumbersActivity.class);
//        startActivity(number);
//    }
}
