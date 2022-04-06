package com.example.kotlinpracticerecyclerview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(private val context: Context, dataSet: ArrayList<Contact>, private val _onClickListener: OnClickListeners):
    RecyclerView.Adapter<MyAdapter.ViewHolder>() {

    class ViewHolder(view: View): RecyclerView.ViewHolder(view)

    lateinit var tvSNo: TextView
    lateinit var tvName: TextView
    lateinit var tvPhoneNumber: TextView
    lateinit var clView: ConstraintLayout
    var contacts = dataSet
    var onClickListener = _onClickListener

    interface OnClickListeners{
        fun onClick(contact: Contact, context: Context)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.layout_contact, parent, false)
        tvSNo = view.findViewById(R.id.tv_sr_no)
        tvName = view.findViewById(R.id.et_name)
        tvPhoneNumber = view.findViewById(R.id.et_phone_number)
        clView = view. findViewById(R.id.cl_view)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        tvSNo.append(contacts[position].getSno())
        tvName.append(contacts[position].getName())
        tvPhoneNumber.append(contacts[position].getPhoneNumber())
        clView.setOnClickListener {
            onClickListener.onClick(contacts[position], context)
        }
    }

    override fun getItemCount(): Int {
        return contacts.size
    }

    fun addData(contact: Contact){
        contacts.add(contact)
        notifyItemInserted(contacts.size)
    }

    override fun getItemId(position: Int): Long {
        return super.getItemId(position)
    }
}