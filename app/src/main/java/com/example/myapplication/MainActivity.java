package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickMapEvent(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:-6.848679800211502, 108.52067046137421"));
        startActivity(intent);
    }

    public void cellphone(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:087897893314"));
        startActivity(intent);
    }

    public void email(View view) {
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"111202013005@mhs.dinus.ac.id"});
        intent.putExtra(Intent.EXTRA_SUBJECT, "Email dari Aplikasi Android");

        try {
            startActivity(Intent.createChooser(intent, "Ingin Mengirim Email"));
        } catch (android.content.ActivityNotFoundException ex) {
        }
    }
}