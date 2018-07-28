package com.hoikhong.searchusergithubmvp.adapters

import android.annotation.SuppressLint
import android.content.Context
import android.support.v7.widget.RecyclerView
import com.dreamdev.simpleretrofit.models.User
import android.view.LayoutInflater
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.hoikhong.searchusergithubmvp.R
import com.hoikhong.searchusergithubmvp.holder.UserHolder


class UserListAdapter(private val context: Context, private val users: List<User>): RecyclerView.Adapter<UserHolder>() {

    @SuppressLint("InflateParams")
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserHolder {
        val itemLayoutView = LayoutInflater.from(parent.context)
                .inflate(R.layout.user_list, null)
        itemLayoutView.layoutParams = RecyclerView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT)

        return UserHolder(itemLayoutView)
    }

    override fun getItemCount(): Int {
        return users.size
    }

    override fun onBindViewHolder(holder: UserHolder, position: Int) {
        holder.textId.text = users[position].id.toString()
        holder.textUsername.text = users[position].login
//        holder.buttonViewProfile.setOnClickListener {
//            val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse(users[position].url))
//            context.startActivity(browserIntent)
//        }
        Glide.with(context).load(users[position].avatar_url).into(holder.avatar)
    }

//    class ViewHolder(itemLayoutView: View) : RecyclerView.ViewHolder(itemLayoutView) {
//
//        val textId: TextView = itemLayoutView.textId
//        val textUsername: TextView = itemLayoutView.textUsername
//        val avatar: ImageView = itemLayoutView.avatar
//        val buttonViewProfile: Button = itemLayoutView.buttonViewProfile
//
//    }
}