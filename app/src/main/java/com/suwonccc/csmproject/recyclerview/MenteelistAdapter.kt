package com.suwonccc.csmproject.recyclerview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.AppCompatTextView
import androidx.recyclerview.widget.RecyclerView
import com.suwonccc.csmproject.R
import de.hdodenhof.circleimageview.CircleImageView
import kotlinx.android.synthetic.main.menteelist_item.view.*

class MenteelistAdapter(val context: Context, val menteelist: ArrayList<Mentee>): RecyclerView.Adapter<MenteelistAdapter.Holder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val view = LayoutInflater.from(context).inflate(R.layout.menteelist_item, parent, false)
        return Holder(view)
    }

    override fun getItemCount(): Int {
        return menteelist.size
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder?.bind(menteelist[position], context)
    }

    inner class Holder(itemView: View?) : RecyclerView.ViewHolder(itemView!!){
        val menteeImg = itemView?.findViewById<CircleImageView>(R.id.profile_photo)
        val menteename = itemView?.findViewById<AppCompatTextView>(R.id.item_name)
        val menteetag1 = itemView?.findViewById<AppCompatTextView>(R.id.item_tag1)
        val menteetag2 = itemView?.findViewById<AppCompatTextView>(R.id.item_tag2)
        val menteetag3 = itemView?.findViewById<AppCompatTextView>(R.id.item_tag3)
        val menteetag4 = itemView?.findViewById<AppCompatTextView>(R.id.item_tag4)
        val menteetag5 = itemView?.findViewById<AppCompatTextView>(R.id.item_tag5)

        fun bind (mentee: Mentee, context: Context){
            val resourceId = context.resources.getIdentifier(mentee.thumb, "drawable", context.packageName)
            menteename?.text = mentee.name
            menteeImg?.setImageResource(resourceId)
            menteetag1?.text = mentee.tag1
            menteetag2?.text = mentee.tag2
            menteetag3?.text = mentee.tag3
            menteetag4?.text = mentee.tag4
            menteetag5?.text = mentee.tag5
        }
    }


}
