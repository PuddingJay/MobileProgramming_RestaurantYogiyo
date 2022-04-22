package com.example.yogiyorestaurant;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
    Context context;
    String dataNama[], dataRating[], dataBanyakRating[], dataWaktuKirim[], dataJarak[],
    dataOngkir[], dataDescMenu[], dataPengiriman[] ,dataDirating[], dataPemesanan[], dataHarga[]
            , dataEstimasiSampai[], dataTxtJarak[], dataFavorit[], dataEstimasiWaktu[];
    int dataImage[];
    int dataImgRating[], dataImgClock[], dataImgCircle[], dataImgheart[], dataImgShare[];

    public MyAdapter(Context ct, String namaHotel[], String rating[], String banyakRating[],
                     String waktuKirim[], String jarak[], String ongkir[], String descMenu[],
                     int image[], int imageRating[], int imageClock[], int imageCircle[]){
        context = ct;
        dataNama = namaHotel;
        dataRating = rating;
        dataBanyakRating = banyakRating;
        dataWaktuKirim = waktuKirim;
        dataJarak = jarak;
        dataOngkir = ongkir;
        dataDescMenu = descMenu;
        dataImage = image;
        dataImgRating = imageRating;
        dataImgClock = imageClock;
        dataImgCircle = imageCircle;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.item, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, final int position) {
        holder.txtNama.setText(dataNama[position]);
        holder.txtRating.setText(dataRating[position]);
        holder.txtBanyakRating.setText(dataBanyakRating[position]);
        holder.txtWaktuKirim.setText(dataWaktuKirim[position]);
        holder.txtJarak.setText(dataJarak[position]);
        holder.txtOngkir.setText(dataOngkir[position]);
        holder.txtDescMenu.setText(dataDescMenu[position]);
        holder.myImage.setImageResource(dataImage[position]);
        holder.myImgRating.setImageResource(dataImgRating[position]);
        holder.myImgClock.setImageResource(dataImgClock[position]);
        holder.myImgCircle.setImageResource(dataImgCircle[position]);

        holder.mainLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, yogiyoclicked.class);
                intent.putExtra("txtnama", dataNama[position]);
                intent.putExtra("txtRating", dataRating[position]);
                intent.putExtra("txtBanyakRating", dataBanyakRating[position]);
                intent.putExtra("txtWaktuKirim", dataWaktuKirim[position]);
                intent.putExtra("txtJarak", dataJarak[position]);
                intent.putExtra("txtOngkir",dataOngkir[position]);
                intent.putExtra("txtDescMenu",dataDescMenu[position]);
                intent.putExtra("myImage",dataImage[position]);
                intent.putExtra("myImgRating",dataImgRating[position]);
                intent.putExtra("myImgClock",dataImgClock[position]);
                intent.putExtra("myImgCircle",dataImgCircle[position]);
                intent.putExtra("txtPemesanan", dataPemesanan[position]);
                intent.putExtra("txtPengiriman", dataPengiriman[position]);
                intent.putExtra("txtDiRating", dataDirating[position]);
                intent.putExtra("txtHarga", dataHarga[position]);
                intent.putExtra("txtEstimasiSampai", dataEstimasiSampai[position]);
                intent.putExtra("txtEstimasiWaktu", dataEstimasiWaktu[position]);
                intent.putExtra("txtJarak2", dataTxtJarak[position]);
                intent.putExtra("txtFavorit", dataFavorit[position]);
                intent.putExtra("myImgHeart", dataImgheart[position]);
                intent.putExtra("myImgShare", dataImgShare[position]);

                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return dataImage.length;
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        TextView txtNama, txtRating, txtBanyakRating, txtWaktuKirim, txtJarak, txtOngkir,
        txtDescMenu;
        ImageView myImage, myImgRating, myImgClock, myImgCircle;
        ConstraintLayout mainLayout;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            txtNama = itemView.findViewById(R.id.tv_namaResto);
            txtRating = itemView.findViewById(R.id.tv_rating);
            txtBanyakRating = itemView.findViewById(R.id.tv_banyakRating);
            txtWaktuKirim = itemView.findViewById(R.id.tv_waktu);
            txtJarak = itemView.findViewById(R.id.tv_jarak);
            txtOngkir = itemView.findViewById(R.id.tv_ongkir);
            txtDescMenu = itemView.findViewById(R.id.tv_descMenu);
            myImage = itemView.findViewById(R.id.iv_food);
            myImgRating = itemView.findViewById(R.id.iv_star);
            myImgClock = itemView.findViewById(R.id.iv_jam);
            myImgCircle = itemView.findViewById(R.id.iv_dot);
            mainLayout = itemView.findViewById(R.id.mainLayout);

        }
    }
}
