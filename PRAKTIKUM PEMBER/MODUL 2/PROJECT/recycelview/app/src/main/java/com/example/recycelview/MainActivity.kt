package com.example.recycelview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var newRecyclerView: RecyclerView
    private lateinit var newArrayList: ArrayList<news>
    lateinit var imageId : Array<Int>
    lateinit var heading : Array<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imageId = arrayOf(
            R.drawable.a,
            R.drawable.b,
            R.drawable.c,
            R.drawable.d,
            R.drawable.e,
            R.drawable.f,
            R.drawable.g,
            R.drawable.h,
            R.drawable.i,
            R.drawable.j,
            R.drawable.c,
            R.drawable.d
        )

        heading = arrayOf(
            "Biden aims to expand vaccines for adults and children",
            "Just go my first shot, helping the world to be a safer placfe",
            "Local trains to be suspended in begal from tomorrow in view of Covid-19",
            "MHA asks states, UTs to ensure there are no fires in hospital",
            "Biden aims to expand vaccines for adults and children",
            "Just go my first shot, helping the world to be a safer placfe",
            "Local trains to be suspended in begal from tomorrow in view of Covid-19",
            "MHA asks states, UTs to ensure there are no fires in hospital",
            "Biden aims to expand vaccines for adults and children",
            "Just go my first shot, helping the world to be a safer placfe",
            "Local trains to be suspended in begal from tomorrow in view of Covid-19",
            "MHA asks states, UTs to ensure there are no fires in hospital"

        )

        newRecyclerView = findViewById(R.id.recyclerview)
        newRecyclerView.layoutManager = LinearLayoutManager(this)
        newRecyclerView.setHasFixedSize(true)

        newArrayList = arrayListOf<news>()
        getUserdata()
    }

    private fun getUserdata() {
        for(i in imageId.indices){
            val news = news(imageId[i],heading[i])
            newArrayList.add(news)
        }

        newRecyclerView.adapter = adaptor(newArrayList)
    }

}