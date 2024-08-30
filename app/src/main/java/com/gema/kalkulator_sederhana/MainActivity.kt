package com.gema.kalkulator_sederhana

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private lateinit var angka1 : EditText
    private lateinit var angka2 : EditText
    private lateinit var kali : Button
    private lateinit var bagi : Button
    private lateinit var kurang : Button
    private lateinit var tambah : Button
    private lateinit var textView3 : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        angka1= findViewById(R.id.angka1)
        angka2= findViewById(R.id.angka2)
        kali= findViewById(R.id.kali)
        bagi= findViewById(R.id.bagi)
        kurang= findViewById(R.id.kurang)
        tambah= findViewById(R.id.tambah)
        textView3= findViewById(R.id.textView3)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        tambah.setOnClickListener(){
            val ang1 = angka1.text.toString().toInt()
            val ang2 = angka2.text.toString().toInt()

            val hasil = ang1 + ang2

            textView3.setText("hasil tambah :"+hasil)
        }

        kurang.setOnClickListener(){
            val ang1 = angka1.text.toString().toInt()
            val ang2 = angka2.text.toString().toInt()

            val hasil = ang1 - ang2

            textView3.setText("hasil kurang :"+hasil)
        }

        kali.setOnClickListener(){
            val ang1 = angka1.text.toString().toInt()
            val ang2 = angka2.text.toString().toInt()

            val hasil = ang1 * ang2

            textView3.setText("hasil kali :"+hasil)
        }

        bagi.setOnClickListener(){
            val ang1 = angka1.text.toString().toInt()
            val ang2 = angka2.text.toString().toInt()

            val hasil = ang1 / ang2

            textView3.setText("hasil bagi :"+hasil)
        }
    }
}