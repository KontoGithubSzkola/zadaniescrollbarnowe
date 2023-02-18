package com.example.zadaniescrollbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ProgressBar
import android.widget.SeekBar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun suma_poziomu(): Int{
        val obraz1_poziom = findViewById<SeekBar>(R.id.poziom)
        val obraz2_poziom = findViewById<SeekBar>(R.id.poziom2)
        val obraz3_poziom = findViewById<SeekBar>(R.id.poziom3)
        val suma = obraz1_poziom.progress + obraz2_poziom.progress + obraz3_poziom.progress
        return suma
    }

    fun suma_pionu(): Int{
        val obraz1_pion = findViewById<SeekBar>(R.id.pion)
        val obraz2_pion = findViewById<SeekBar>(R.id.pion2)
        val obraz3_pion = findViewById<SeekBar>(R.id.pion3)
        val suma = obraz1_pion.progress + obraz2_pion.progress + obraz3_pion.progress
        return suma
    }

    fun changed(progressBar: ProgressBar, suma: Int){
        progressBar.progress = suma/3
    }
}