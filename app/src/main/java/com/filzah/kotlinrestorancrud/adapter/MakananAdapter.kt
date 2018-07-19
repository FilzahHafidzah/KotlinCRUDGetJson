package com.filzah.kotlinrestorancrud.adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.filzah.kotlinrestorancrud.R
import com.filzah.kotlinrestorancrud.response.ResponOwner
import kotlinx.android.synthetic.main.item_layout.view.*

/* *
1.make class
2.add konctructor array (List)
3.extend ke RecyclerView adapter
4.make class new in Adapter -> Adapter<MakananAdapter.MyHolder>
5.merah di myholder ->klik kanan create class
6.myHolder extend ke recyclerview my holder
7. klik create constructor
8.merah in part class makanan adapter -> alt enter pilih implement
9.make layout item
10.panggil onCreate view
11.hitung size array di function get itemCount
12.eksekusi isi array di function
13.pindahin isi array ke view di my holder
*/

class MakananAdapter(var data: List<ResponOwner>?): RecyclerView.Adapter<MakananAdapter.MyHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): MyHolder {
        //this is for setting the view, with item layout
        val view = LayoutInflater.from(parent?.context).inflate(R.layout.item_layout, parent, false)
        return MyHolder(view)
    }

    override fun getItemCount(): Int {
        //search or, taking or counting data in database to show
        return data!!.size
    }

    override fun onBindViewHolder(holder: MyHolder?, position: Int) {
        //
        //holder?.bind(data.get(position))

        //why there is owner? couse we take the object first and take string inside it
        holder?.textview?.text = data?.get(position)?.owner?.id.toString()
        holder?.textview1?.text = data?.get(position)?.owner?.url
    }


    class MyHolder(itemView: View?) :RecyclerView.ViewHolder(itemView) {
        //this bind take from above
        //and also this taking datas of food, in Makanan
        //then set the text inside itemView(itemLayout) to get and set data from Makanan.class
//        fun bind(get : Makanan){
//            itemView.textName.text = get.makanan_nama
//            itemView .textPrice.text = get.makanan_harga
//        }

        var textview = itemView?.textName
        var textview1 = itemView?.textAlm

    }
}

