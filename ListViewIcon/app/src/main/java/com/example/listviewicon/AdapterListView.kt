package com.example.listviewicon

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class AdapterListView (var Mcontext: Context, var resource:Int, var items:List<Declare>)
    :ArrayAdapter<Declare>(Mcontext,resource,items){

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val layoutInflater:LayoutInflater = LayoutInflater.from(Mcontext)

        val view:View = layoutInflater.inflate(resource , null)
        val imageView:ImageView = view.findViewById(R.id.iconPres)
        val textView:TextView = view.findViewById(R.id.urutanPres)
        val textView1:TextView= view.findViewById(R.id.namaPres)

        var mItems:Declare = items [position]
        imageView.setImageDrawable(Mcontext.resources.getDrawable(mItems.photo))

        textView.text = mItems.title
        textView1.text = mItems.desc




        return view
    }

}