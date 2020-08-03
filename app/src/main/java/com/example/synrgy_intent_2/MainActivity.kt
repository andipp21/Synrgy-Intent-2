package com.example.synrgy_intent_2

import android.R
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.synrgy_intent_2.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        supportFragmentManager.beginTransaction()
            .replace(fragmentContainer.id, NewFragment())
            .commit()

        btnActivity.setOnClickListener {
            val fm = supportFragmentManager.findFragmentById(fragmentContainer.id) as NewFragment
            fm.showToastFragment()
        }
    }

    fun showToastActivty (){
        Toast.makeText(applicationContext, "Ini Toast method dari activity", Toast.LENGTH_SHORT).show()
    }
}