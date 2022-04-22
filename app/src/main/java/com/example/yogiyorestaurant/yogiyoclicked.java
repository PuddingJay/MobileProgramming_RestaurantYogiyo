package com.example.yogiyorestaurant;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class yogiyoclicked extends AppCompatActivity {

    ImageView imgFood, imgShare, imgHeart, imgStar;
    TextView namaRestoran, rating, dirating, favorit, pemesanan, biayaPemesanan, ongkir, biayaOngkir
            ,estimasiSampai, estimasiWaktu, jarak, jarakTempat;

    String restoName, rate, rated, fav, pesan, biayaPesan, delivery, deliveryPrice, estimatedelivered,
            estimateTime, distance, distancePlace;
    int imageFood, imageShare, imageHeart, imageStar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yogiyoclicked);
        imgFood = findViewById(R.id.iv2_food);
        imgShare = findViewById(R.id.iv2_share);
        imgHeart = findViewById(R.id.iv2_love);
        imgStar = findViewById(R.id.iv2_star);
        namaRestoran = findViewById(R.id.tv2_namaResto);
        rating = findViewById(R.id.tv2_banyakRating);
        dirating = findViewById(R.id.tv2_diRating);
        favorit = findViewById(R.id.tv2_banyakFavorite);
        pemesanan = findViewById(R.id.tv2_biayaPesanan);
        biayaPemesanan = findViewById(R.id.tv2_harga);
        ongkir = findViewById(R.id.tv2_ongkir);
        biayaOngkir = findViewById(R.id.tv2_biayaOngkir);
        estimasiSampai = findViewById(R.id.tv2_estimasiKirim);
        estimasiWaktu = findViewById(R.id.tv2_waktuKirim);
        jarak = findViewById(R.id.tv2_jarak);
        jarakTempat = findViewById(R.id.tv2_jarakKirim);

        getData();
        SetData();
    }
    private void getData() {
        if (getIntent().hasExtra("txtnama") && getIntent().hasExtra("txtRating") && getIntent().hasExtra("txtBanyakRating")) {
            restoName = getIntent().getStringExtra("txtnama");
            rate = getIntent().getStringExtra("txtRating");
            rated = getIntent().getStringExtra("txtBanyakRating");
            fav = getIntent().getStringExtra("txtFavorit");
            pesan = getIntent().getStringExtra("txtPemesanan");
            biayaPesan = getIntent().getStringExtra("txtHarga");
            delivery = getIntent().getStringExtra("txtPengiriman");
            deliveryPrice = getIntent().getStringExtra("txtnama");
            estimatedelivered = getIntent().getStringExtra("txtEstimasiSampai");
            estimateTime = getIntent().getStringExtra("txtEstimasiWaktu");
            distance = getIntent().getStringExtra("txtJarak");
            distancePlace = getIntent().getStringExtra("txtJarak2");
            imageFood = getIntent().getIntExtra("txtnama", 1);
            imageShare = getIntent().getIntExtra("txtnama", 1);
            imageHeart = getIntent().getIntExtra("txtnama", 1);
            imageStar = getIntent().getIntExtra("txtnama", 1);
        } else {
            Toast.makeText(this, "No data.", Toast.LENGTH_SHORT).show();

        }
    }
    private void SetData() {
        namaRestoran.setText(restoName);
        rating.setText(rate);
        dirating.setText(rated);
        favorit.setText(fav);
        pemesanan.setText(pesan);
        biayaPemesanan.setText(biayaPesan);
        ongkir.setText(delivery);
        biayaOngkir.setText(deliveryPrice);
        estimasiSampai.setText(estimatedelivered);
        estimasiWaktu.setText(estimateTime);
        jarak.setText(distance);
        jarakTempat.setText(distancePlace);
        imgFood.setImageResource(imageFood);
        imgShare.setImageResource(imageShare);
        imgHeart.setImageResource(imageHeart);
        imgStar.setImageResource(imageStar);
    }
}