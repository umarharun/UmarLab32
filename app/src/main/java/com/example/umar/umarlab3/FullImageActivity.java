package com.example.umar.umarlab3;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

/**
 * Created by Dell on 10/6/2017.
 */

public class FullImageActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState){

        super.onCreate(savedInstanceState);
        setContentView(R.layout.full_image);

        Intent i = getIntent();

        int position=i.getExtras().getInt("id");
        ImageAdapter imageAdapter= new ImageAdapter(this);

        ImageView imageView=(ImageView) findViewById(R.id.full_image_view);
        imageView.setImageResource(imageAdapter.mThumbIds[position]);
    }
}
