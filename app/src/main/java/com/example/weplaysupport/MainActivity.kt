package com.example.weplaysupport

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val layoutManager = LinearLayoutManager(this)
        layoutManager.orientation = LinearLayoutManager.VERTICAL

        val adaper = TeamsAdapter(this, Suppiler.teamMembers)
        val recylcerView = findViewById<RecyclerView>(R.id.recylcerView)
        recylcerView.layoutManager = layoutManager
        recylcerView.adapter = adaper
    }
}