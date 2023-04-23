package com.cibertec.session05app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import android.widget.Spinner
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //val spLanguages : Spinner = findViewById(R.id.spLanguages)
        val spLanguages : AutoCompleteTextView = findViewById(R.id.spLanguages2)
        var tvTittle : TextView = findViewById(R.id.tvTittle);
        val oListaLanguages : List<String> = listOf("Kotlin","TypeScript","JavaScript","Java","Python","C#","C","C++","Ruby")
        val adapter = ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, oListaLanguages);
        spLanguages.setAdapter(adapter)

        spLanguages.onItemClickListener = AdapterView.OnItemClickListener{ adapterView, view, position, l ->

            val selected = oListaLanguages[position]
            //Cambia titulo
            tvTittle.text = oListaLanguages[position].toString()
            println(selected)

        }
    }
}