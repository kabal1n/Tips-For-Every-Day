package com.example.tipsforeveryday

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        val tips = listOf(
            Tip("Day 1", "Запасное колесо", R.drawable.image1, "Все производители снабжают авто запасным колесом. Зачастую это так называемая докатка — аварийное колесо, которое не предназначено для длительного использования и езды на высоких скоростях. Тем не менее добраться до ближайшего шиномонтажа можно без проблем."),
            Tip("Day 2", "Tip Title 2", R.drawable.ic_launcher_foreground, "Tip Description 2")
            // Добавьте больше элементов по мере необходимости
        )

        recyclerView.adapter = TipAdapter(tips)
    }
}
