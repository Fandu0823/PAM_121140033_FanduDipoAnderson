package com.example.tugaspam

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity(), View.OnClickListener {

    //deklarasi variable btnintent2
    private lateinit var btnIntentDua : Button
    private lateinit var intentPesan : EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //menginisialisasi id dari button btn2
        btnIntentDua = findViewById(R.id.btn2)
        intentPesan= findViewById(R.id.textPesan)

        //Membuat onclickListener utk fungsi onClick
        btnIntentDua.setOnClickListener(this)
    }

    //fungsi onclick
    override fun onClick(v: View) {
        when(v.id){
            R.id.btn2 -> run {
                //convert text pesan ke string
                val stringPesan = intentPesan.text.toString()

                val intentDua = Intent(this@MainActivity,MainActivity2::class.java)
                intentDua.putExtra("Pesan",stringPesan);
                startActivity(intentDua)

            }
        }
    }
}