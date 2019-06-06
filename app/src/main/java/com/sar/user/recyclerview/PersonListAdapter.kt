package com.sar.user.recyclerview

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class PersonListAdapter(private val list:ArrayList<Person>,private val context:Context):
    RecyclerView.Adapter<PersonListAdapter.ViewHolder>() {
    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): ViewHolder {
     val view=LayoutInflater.from(context).inflate(R.layout.card,p0,false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(p0: ViewHolder, p1: Int) {
         p0?.bindItem(list[p1])
    }


    class ViewHolder(itemView:View): RecyclerView.ViewHolder(itemView) {
        fun bindItem(person:Person){
            var name:TextView=itemView.findViewById(R.id.textView)
            var age:TextView=itemView.findViewById(R.id.textView2)

            name.text=person.name
            age.text= person.age.toString()
        }

    }
}