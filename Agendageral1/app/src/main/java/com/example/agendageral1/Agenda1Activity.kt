package com.example.agendageral1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.agendageral1.databinding.ActivityAgenda1Binding

class Agenda1Activity : AppCompatActivity() {

    private lateinit var binding: ActivityAgenda1Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityAgenda1Binding.inflate(layoutInflater)



        setContentView(binding.root)
    }
}