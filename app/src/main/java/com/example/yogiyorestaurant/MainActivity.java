package com.example.yogiyorestaurant;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    String _namaResto[], _Rating[], _banyakRating[], _waktuKirim[], _jarak[], _ongkir[],
    _descMenu[];

    int image[] = {R.drawable.agri, R.drawable.ayamgoreng,R.drawable.bahanmakanan,
            R.drawable.fastfood, R.drawable.indofood, R.drawable.nasigoreng,
            R.drawable.sayurpadang, R.drawable.sehat, R.drawable.hotdog, R.drawable.sushiburger};

    int imgRating[] = {R.drawable.star ,R.drawable.star ,R.drawable.star ,
            R.drawable.star , R.drawable.star, R.drawable.star,
            R.drawable.star, R.drawable.star, R.drawable.star, R.drawable.star};

    int imgClock[] = {R.drawable.clock, R.drawable.clock, R.drawable.clock,
            R.drawable.clock, R.drawable.clock, R.drawable.clock,
            R.drawable.clock, R.drawable.clock, R.drawable.clock, R.drawable.clock};

    int imgCircle[] = {R.drawable.circle, R.drawable.circle , R.drawable.circle,
            R.drawable.circle, R.drawable.circle, R.drawable.circle,
            R.drawable.circle, R.drawable.circle, R.drawable.circle, R.drawable.circle};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.rv_1);

        _namaResto = getResources().getStringArray(R.array.namaResto);
        _Rating = getResources().getStringArray(R.array.rating);
        _banyakRating = getResources().getStringArray(R.array.banyakRating);
        _waktuKirim = getResources().getStringArray(R.array.waktuKirim);
        _jarak = getResources().getStringArray(R.array.jarak);
        _ongkir = getResources().getStringArray(R.array.hargaOngkir);
        _descMenu = getResources().getStringArray(R.array.descMenu);

        MyAdapter myAdapter = new MyAdapter(this, _namaResto, _Rating, _banyakRating, _waktuKirim,
                _jarak, _ongkir, _descMenu, image, imgRating, imgClock, imgCircle);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}