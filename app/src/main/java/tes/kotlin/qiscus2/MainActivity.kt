package tes.kotlin.qiscus2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)

        val dataList = ArrayList<Model>()
        dataList.add(Model("Phone", 1))
        dataList.add(Model("Watch", 2))
        dataList.add(Model("Note", 3))
        dataList.add(Model("Pin", 4))
//        pass the values to RvAdapter
        val rvAdapter = RecyclerViewAdapter(dataList)
//        set the recyclerView to the adapter
        recyclerView.adapter = rvAdapter;

    }
}
