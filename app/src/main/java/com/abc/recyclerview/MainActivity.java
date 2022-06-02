package com.abc.recyclerview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Source> imageList = new ArrayList<>();
        imageList.add(new Source("Imagen 1", R.drawable.imagen1));
        imageList.add(new Source("Imagen 2", R.drawable.imagen2));
        imageList.add(new Source("Imagen 3", R.drawable.imagen3));
        imageList.add(new Source("Imagen 4", R.drawable.imagen4));

        RecyclerView container = findViewById(R.id.container);

        container.setItemViewCacheSize(20);
        container.setDrawingCacheEnabled(true);
        container.setHasFixedSize(true);
        LinearLayoutManager layout = new LinearLayoutManager(getApplicationContext());
        layout.setOrientation(LinearLayoutManager.VERTICAL);
        container.setAdapter(new Adapter(imageList));
        container.setLayoutManager(layout);
    }
}
