package com.example.uas_akb_10119042;
//10119042-Muhammad Rifqu Abdillah-IF-1

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ProfileActivity extends AppCompatActivity {
    private TextView tvNama, tvNim, tvKelas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        tvNama = findViewById(R.id.txt_nama);
        tvNim = findViewById(R.id.txt_nim);
        tvKelas = findViewById(R.id.txt_kelas);
    }
}