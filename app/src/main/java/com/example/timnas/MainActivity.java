package com.example.timnas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private CardView kiboy, dreams, saykots, albert, sanz, branz ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        kiboy = (CardView) findViewById(R.id.kiboy);
        dreams = (CardView) findViewById(R.id.dreams);
        saykots = (CardView) findViewById(R.id.saykots);
        albert = (CardView) findViewById(R.id.albert);
        sanz = (CardView) findViewById(R.id.sanz);
        branz = (CardView) findViewById(R.id.branz);


        kiboy.setOnClickListener((View.OnClickListener) this);
        dreams.setOnClickListener((View.OnClickListener) this);
        saykots.setOnClickListener((View.OnClickListener) this);
        albert.setOnClickListener((View.OnClickListener) this);
        sanz.setOnClickListener((View.OnClickListener) this);
        branz.setOnClickListener((View.OnClickListener) this);
    }

    @Override
    public void onClick(View v){
        Intent i;
        switch (v.getId()){
            case R.id.kiboy: i = new Intent(this,kiboy.class); startActivity(i); break;
            case R.id.dreams: i = new Intent(this,dreams.class); startActivity(i); break;
            case R.id.saykots: i = new Intent(this,saykots.class); startActivity(i); break;
            case R.id.albert: i = new Intent(this,albert.class); startActivity(i); break;
            case R.id.sanz: i = new Intent(this,sanz.class); startActivity(i); break;
            case R.id.branz: i = new Intent(this,branz.class); startActivity(i); break;
        }
    }
}