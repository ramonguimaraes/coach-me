package com.ramon.coach_me

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun clic(view :View){
        var sort = Random.nextInt(0, 4);

        var frase = when(sort){
            1->getString(R.string.frase1)
            2->getString(R.string.frase2)
            3->getString(R.string.frase3)
            4->getString(R.string.frase4)
            else -> getString(R.string.frase4)
        }
        txtFrase.text = frase
        Log.i("Sorteio", "Frase: $frase")
    }


}
