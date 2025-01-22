package com.example.contact

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.contact.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {


    lateinit var binding: ActivityMainBinding

    lateinit var nameAdapter: DesignAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)



        val users = listOf<User>(
            User("Minmoy","0979997767","")
        )

        nameAdapter = DesignAdapter(users)

        binding.rv.adapter= nameAdapter
    }

}