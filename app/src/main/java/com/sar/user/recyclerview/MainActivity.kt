package com.sar.user.recyclerview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
private var adapter:PersonListAdapter?=null
    private var arrayList:ArrayList<Person>?=null
    private var rec:RecyclerView.LayoutManager?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        arrayList=ArrayList<Person>()
        rec=LinearLayoutManager(this)
        adapter= PersonListAdapter(arrayList!!,this)
        rr.layoutManager=rec
        rr.adapter=adapter
        for (i in 0..9){
            val person=Person()
            person.name="jame"+i
            person.age=i
            arrayList!!.add(person)
        }
        adapter!!.notifyDataSetChanged()

    }
}
