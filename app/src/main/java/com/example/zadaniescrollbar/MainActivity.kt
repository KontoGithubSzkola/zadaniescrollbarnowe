package com.example.zadaniescrollbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.SeekBar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val obraz1 = findViewById<ImageView>(R.id.imv)
        val obraz2 = findViewById<ImageView>(R.id.imv2)
        val obraz3 = findViewById<ImageView>(R.id.im4)

        val obraz1_poziom = findViewById<SeekBar>(R.id.poziom)
        val obraz1_pion = findViewById<SeekBar>(R.id.pion)
        val obraz2_poziom = findViewById<SeekBar>(R.id.poziom2)
        val obraz2_pion = findViewById<SeekBar>(R.id.pion2)
        val obraz3_poziom = findViewById<SeekBar>(R.id.poziom3)
        val obraz3_pion = findViewById<SeekBar>(R.id.pion3)
        val reset = findViewById<Button>(R.id.reset)
        val progress_poziom = findViewById<ProgressBar>(R.id.pgbpoziom)
        val progress_pion = findViewById<ProgressBar>(R.id.pgbpion)

        reset.setOnClickListener() {
            obraz1_pion.progress = 100
            obraz2_pion.progress = 100
            obraz3_pion.progress = 100
            obraz1_poziom.progress = 100
            obraz2_poziom.progress = 100
            obraz3_poziom.progress = 100
        }
        fun suma_poziomu(): Int {
            val obraz1_poziom = findViewById<SeekBar>(R.id.poziom)
            val obraz2_poziom = findViewById<SeekBar>(R.id.poziom2)
            val obraz3_poziom = findViewById<SeekBar>(R.id.poziom3)
            val suma = obraz1_poziom.progress + obraz2_poziom.progress + obraz3_poziom.progress
            return suma
        }

        fun suma_pionu(): Int {
            val obraz1_pion = findViewById<SeekBar>(R.id.pion)
            val obraz2_pion = findViewById<SeekBar>(R.id.pion2)
            val obraz3_pion = findViewById<SeekBar>(R.id.pion3)
            val suma = obraz1_pion.progress + obraz2_pion.progress + obraz3_pion.progress
            return suma
        }

        fun changed(progressBar: ProgressBar, suma: Int) {
            progressBar.progress = suma / 3
        }
        obraz1_pion.setOnSeekBarChangeListener(object: SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar,progres: Int, fromUser: Boolean) {
                val scale = progres/100f
                obraz1.scaleY = scale
                changed(progress_pion, suma_pionu())
            }

            override fun onStartTrackingTouch(seekBar: SeekBar) {}
            override fun onStopTrackingTouch(seekBar: SeekBar) {}
        })

        obraz1_poziom.setOnSeekBarChangeListener(object: SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar,progres: Int, fromUser: Boolean) {
                val scale = progres/100f
                obraz1.scaleX = scale
                changed(progress_poziom, suma_poziomu())
            }

            override fun onStartTrackingTouch(seekBar: SeekBar) {}
            override fun onStopTrackingTouch(seekBar: SeekBar) {}
        })
        obraz2_poziom.setOnSeekBarChangeListener(object: SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar,progres: Int, fromUser: Boolean) {
                val scale = progres/100f
                obraz2.scaleX = scale
                changed(progress_poziom, suma_poziomu())
            }

            override fun onStartTrackingTouch(seekBar: SeekBar) {}
            override fun onStopTrackingTouch(seekBar: SeekBar) {}
        })

        obraz2_pion.setOnSeekBarChangeListener(object: SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar,progres: Int, fromUser: Boolean) {
                val scale = progres/100f
                obraz2.scaleY = scale
                changed(progress_pion, suma_pionu())
            }

            override fun onStartTrackingTouch(seekBar: SeekBar) {}
            override fun onStopTrackingTouch(seekBar: SeekBar) {}
        })
    }
}