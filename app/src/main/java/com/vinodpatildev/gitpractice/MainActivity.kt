package com.vinodpatildev.gitpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        print("Second commit change.")
        print("Fourth commit : changes done by cp_geek")
        print("Changes by cp_geek")

        print("commit by master")
        print("changes done by pavan")
	  print("changes done by Swapni.")
	  print("onother changes done by swapnil.")
    }
}