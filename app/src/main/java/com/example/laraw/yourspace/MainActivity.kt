package com.example.laraw.yourspace

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener{
            val intent = Intent(this,SignInPage::class.java)
            startActivity(intent)
        }
    }



}
