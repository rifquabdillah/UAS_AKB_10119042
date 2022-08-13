package com.example.uas_akb_10119042;
// M Rifqu Abdillah IF-1 10119042
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.uas_akb_10119042.MainActivity;
import com.example.uas_akb_10119042.R;

public class MenuActivity extends AppCompatActivity {
    private Button btn_daftar, btn_profil, btn_info;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        btn_daftar = findViewById(R.id.btn_daftar);
        btn_profil = findViewById(R.id.btn_profil);
        btn_info = findViewById(R.id.btn_info);
        btn_daftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });

        btn_profil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent inn = new Intent(getApplicationContext(), ProfileActivity.class);
                startActivity(inn);
            }
        });

        btn_info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(in)
                ;
            }
        });

    }
}