package com.mamunsyuhada.bukalapak_kw;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public int jumlahBarang = 0;
    public int totalHarga=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void nambahUy(View view) {
        jumlahBarang = jumlahBarang + 1;
        tampilkanBarang(jumlahBarang);

        totalHarga = jumlahBarang * 3600000;
        tampilkanHarga(totalHarga);
    }

    public void kurangUy(View view) {
        jumlahBarang = jumlahBarang - 1;
        tampilkanBarang(jumlahBarang);

        totalHarga = jumlahBarang * 3600000;
        tampilkanHarga(totalHarga);
    }

    private void tampilkanBarang(int jumlahBarang) {
        TextView tvjumlahBarang = findViewById(R.id.tv_JumlahBarang);
        tvjumlahBarang.setText(String.valueOf(jumlahBarang));
    }

    private void tampilkanHarga(int totalHarga) {
        TextView tvtotalBarang = findViewById(R.id.tv_total_value);
        tvtotalBarang.setText(String.valueOf(totalHarga));
    }

    public void orderUy(View view) {
        Toast.makeText(getApplicationContext(), "Ordered, Silahkan membayar  "
                + totalHarga
                , Toast.LENGTH_SHORT)
                .show();
    }
}