package com.androidlearning.cg.mydemoapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

	//1st Toast
        Toast.makeText(this, "Hello World", Toast.LENGTH_LONG).show()
    }

}
