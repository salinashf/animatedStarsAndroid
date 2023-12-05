package com.sofakingforever.animatedstarsview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.sofakingforever.stars.AnimatedStarsView

class MainActivity : AppCompatActivity() {
    lateinit var stars: AnimatedStarsView;
    lateinit var stars_white: AnimatedStarsView;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        stars = findViewById(R.id.stars);
        stars_white = findViewById(R.id.stars_white);
    }

    override fun onStart() {
        super.onStart()
        stars_white.onStart()
        stars.onStart()
    }

    override fun onStop() {
        stars_white.onStop()
        stars.onStop()
        super.onStop()
    }
}