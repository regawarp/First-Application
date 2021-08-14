package com.regawa.firstapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var etAngka1: EditText = findViewById(R.id.et_angka1)
        var etAngka2: EditText = findViewById(R.id.et_angka2)
        var btnHitung: Button = findViewById(R.id.btn_hitung)
        var tvHasil: TextView = findViewById(R.id.tv_hasil)

        btnHitung.setOnClickListener {
            var angka1 = Integer.parseInt(etAngka1.text.toString())
            var angka2 = Integer.parseInt(etAngka2.text.toString())
            var hasil = angka1 + angka2
            tvHasil.text = "Hasilnya adalah $hasil"
        }
    }
}