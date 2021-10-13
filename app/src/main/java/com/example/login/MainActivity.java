package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;
import com.squareup.picasso.Target;

public class MainActivity extends AppCompatActivity {

    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initWidget();
        loadImage();
                
    }

    private void initWidget() {
        imageView = findViewById(R.id.iv_perfil);
    }

    private void loadImage() {

        Picasso.get()
                .load("https://w7.pngwing.com/pngs/549/684/png-transparent-goku-trunks-gohan-vegeta-frieza-son-goku.png")
                .placeholder(R.mipmap.ic_launcher)//mientras se descarga imagen
                .into(imageView);
    }


}