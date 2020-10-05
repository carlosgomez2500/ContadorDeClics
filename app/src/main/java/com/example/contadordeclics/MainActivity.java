package com.example.contadordeclics;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.contadordeclics.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    int contador1, contador2, contador3, contador4, contadorAll;
    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        binding.augmentar1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contador1++;
                contadorAll++;
                binding.contador1.setText(String.valueOf(contador1));
                binding.contadorAll.setText(String.valueOf(contador1 + contador2 + contador3 + contador4));
            }
        });
        binding.reset1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contador1 = 0;
                contadorAll = 0;
                binding.contador1.setText(String.valueOf(contador1));
                binding.contadorAll.setText(String.valueOf(contadorAll + contador1 + contador2 + contador3 + contador4));
            }
        });

        binding.augmentar2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contador2++;
                contadorAll++;
                binding.contador2.setText(String.valueOf(contador2));
                binding.contadorAll.setText(String.valueOf(contador1 + contador2 + contador3 + contador4));
            }
        });
        binding.reset2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contador2 = 0;
                contadorAll = 0;
                binding.contador2.setText(String.valueOf(contador2));
                binding.contadorAll.setText(String.valueOf(contadorAll + contador1 + contador2 + contador3 + contador4));
            }
        });

        binding.augmentar3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contador3++;
                contadorAll++;
                binding.contador3.setText(String.valueOf(contador3));
                binding.contadorAll.setText(String.valueOf(contador1 + contador2 + contador3 + contador4));
            }
        });
        binding.reset3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contador3 = 0;
                contadorAll = 0;
                binding.contador3.setText(String.valueOf(contador3));
                binding.contadorAll.setText(String.valueOf(contadorAll + contador1 + contador2 + contador3 + contador4));
            }
        });

        binding.augmentar4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contador4++;
                contadorAll++;
                binding.contador4.setText(String.valueOf(contador4));
                binding.contadorAll.setText(String.valueOf(contador1 + contador2 + contador3 + contador4));
            }
        });
        binding.reset4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contador4 = 0;
                contadorAll = 0;
                binding.contador4.setText(String.valueOf(contador4));
                binding.contadorAll.setText(String.valueOf(contadorAll + contador1 + contador2 + contador3 + contador4));
            }
        });

        binding.resetAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contadorAll = 0;
                contador1 = 0;
                contador2 = 0;
                contador3 = 0;
                contador4 = 0;
                binding.contadorAll.setText(String.valueOf(contadorAll + contador1 + contador2 + contador3 + contador4));
                binding.contador1.setText(String.valueOf(contador1));
                binding.contador2.setText(String.valueOf(contador2));
                binding.contador3.setText(String.valueOf(contador3));
                binding.contador4.setText(String.valueOf(contador4));
            }
        });

    }
}