package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var newRecyclerView: RecyclerView
    private lateinit var newArrayList: ArrayList<News>
    lateinit var  imageId:Array<Int>
    lateinit var heading:Array<String>

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
            R.drawable.i,
            R.drawable.j,
            R.drawable.k,
            R.drawable.l,
            R.drawable.m

            )
        heading = arrayOf(
            "Minister flags off bus services on new routes",
            "Use of country-made bombs in Coimbatore Forest Division under investigation",
            "Governor has sent anti-NEET bill to Centre for President nod:Tamil Nadu CM M K Stalin ",
            "8.37 lakh students to write Class XII Board Exams tomorrow",
            "Ramzan prayers held across Coimbatore district",
            "Durgapur-bound SpiceJet flight returns to Chennai after engine glitch",
            "Kerala high court takes suo motu cognisance of shawarma food poisoning incident",
            "Children under five to get free travel on buses in TN",
            "New police wing to be formed in TN to help traders",
            "TN constitutes committee to revise bus fare",
            "45,672 students write Class 12 exam in Vellore, Ranipet, Tirupathur districts",
            "IPL reboot: Can CSK end losing streak against familiar foes RCB?",

        )
        newRecyclerView = findViewById(R.id.recyclerView)
        newRecyclerView.layoutManager = LinearLayoutManager(this)
        newRecyclerView.setHasFixedSize(true)
        newArrayList = arrayListOf<News>()
        getUserdata()
    }

    private fun getUserdata() {
        for(i in imageId.indices){
            val news = News(imageId[i], heading [i])
            newArrayList.add(news)
        }
        newRecyclerView.adapter = MyAdapter(newArrayList)
    }
}