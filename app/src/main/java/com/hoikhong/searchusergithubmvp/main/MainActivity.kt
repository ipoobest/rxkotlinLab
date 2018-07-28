package com.hoikhong.searchusergithubmvp.main

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.hoikhong.searchusergithubmvp.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(findViewById(R.id.my_toolbar))
        innit()

        if (savedInstanceState == null)
            supportFragmentManager.beginTransaction()
                    .add(R.id.contentContainer, MainFragment.newInstance())
                    .commit()
    }

    private fun innit() {
        setSupportActionBar(findViewById(R.id.my_toolbar))
    }

}
