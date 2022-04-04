package com.example.kotlinpracticerecyclerview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter

class MyAdapter(private val context: Context, dataSet: ArrayList<Contact>): BaseAdapter() {
    var contacts = dataSet
    override fun getCount(): Int {
        return contacts.size
    }
    override fun getItem(position: Int): Any {
        return position
    }
    override fun getItemId(position: Int): Long {
        return position.toLong()
    }
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View? {
        convertView = LayoutInflater.from(context).inflate(R.layout., parent, false)
        serialNum = convertView.findViewById(R.id.serialNumber)
        name = convertView.findViewById(R.id.studentName)
        contactNum = convertView.findViewById(R.id.mobileNum)
        serialNum.text = " " + arrayList[position].num
        name.text = arrayList[position].name
        contactNum.text = arrayList[position].mobileNumber
        return convertView
    }
}