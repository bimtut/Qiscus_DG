package tes.kotlin.qiscus2

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class RecyclerViewAdapter(val userList: ArrayList<Model>) : RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>() {
    // daftar title yang akan ditampilkan di card
//    private val titles = arrayOf(
//        "Chapter One",
//        "Chapter Two", "Chapter Three", "Chapter Four",
//        "Chapter Five", "Chapter Six", "Chapter Seven",
//        "Chapter Eight"
//    )
//    // daftar teks yang akan ditampilkan juga
//    private val details = arrayOf(
//        "Item one details", "Item two details",
//        "Item three details", "Item four details",
//        "Item file details", "Item six details",
//        "Item seven details", "Item eight details"
//    )
    // Daftar gambar yang sudah disimpan di folder drawable
    private val images = intArrayOf(
        R.drawable.thumbnail_1,
        R.drawable.thumbnail_2, R.drawable.thumbnail_3,
        R.drawable.thumbnail_4, R.drawable.thumbnail_5
    )

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): ViewHolder {
        val v = LayoutInflater.from(p0?.context).inflate(R.layout.adapter_item_layout, p0, false)
        return ViewHolder(v);
    }
    override fun getItemCount(): Int {
        return userList.size
    }
    override fun onBindViewHolder(p0: ViewHolder, p1: Int) {

        p0.name?.text = userList[p1].name
        p0.count?.text = userList[p1].count.toString()
        p0.image?.setImageResource(userList[p1].image) // = userList[p1].count.toString() //INI PENTING BUAT NAMPILIN GAMBAR TAPI GIMANA CARANYA?

    }
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val name = itemView.findViewById<TextView>(R.id.tvName)
        val count = itemView.findViewById<TextView>(R.id.tvCount)
        val image = itemView.findViewById<ImageView>(R.id.item_image) //ini nih biar kebaca dengan bener gimana ya?
    }
}