package com.example.retrofitrec

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder



class PostAdepter(Post: Any?) : RecyclerView.Adapter<PostAdepter.postHolder>() {
    lateinit var context:Context
    class postHolder(itemView: View) : ViewHolder(itemView){

        var userid=itemView.findViewById<TextView>(R.id.userid)
        var id=itemView.findViewById<TextView>(R.id.identify)
        var title=itemView.findViewById<TextView>(R.id.title)
        var body=itemView.findViewById<TextView>(R.id.body)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): postHolder {
context=parent.context
        return postHolder(LayoutInflater.from(parent.context).inflate(R.layout.post_item,parent,false))
    }


    override fun getItemCount(): Int {

    }

    override fun onBindViewHolder(holder: postHolder, position: Int) {
        holder.id.text=
    }
}