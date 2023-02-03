package com.hyonglow.affirmations

import com.hyonglow.affirmations.adapter.ItemAdapter
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.hyonglow.affirmations.data.Datasource

class MainActivity : AppCompatActivity() {
    lateinit var tvSample: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val myDataset = Datasource().loadAffirmations()

        val recyclerView = findViewById<RecyclerView>(R.id.rvAffirmationList)
        recyclerView.adapter = ItemAdapter(this, myDataset)
//        recyclerView.setHasFixedSize(true)
    }
}