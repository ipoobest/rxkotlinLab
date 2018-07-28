package com.hoikhong.searchusergithubmvp.holder

import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import kotlinx.android.synthetic.main.user_list.view.*

class UserHolder(itemView: View?) : RecyclerView.ViewHolder(itemView) {
    val textId: TextView = itemView!!.textId
    val textUsername: TextView = itemView!!.textUsername
    val avatar: ImageView = itemView!!.avatar
//    val buttonViewProfile: Button = itemView!!.buttonViewProfile

}