package com.miappchp.nevergonna

import android.content.Intent
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import java.lang.IllegalArgumentException
import android.os.Bundle as Bundle1

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle1?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnPlaySingle = findViewById<Button>(R.id.btn_svideo)
        val btnMenu = findViewById<Button>(R.id.btn_menu)
    }


    override fun onClick(view: View){
        val intent = when(view.id){
            R.id.btn_svideo -> Intent(this, YoutubeLayerActivity::class.java)
            R.id.btn_menu -> Intent(this, Menu::class.java)
            else -> throw IllegalArgumentException("Invalid button")
        }
        startActivity(intent)
    }


}