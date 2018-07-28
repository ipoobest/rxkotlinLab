package com.hoikhong.searchusergithubmvp.main

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.DefaultItemAnimator
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.SearchView
import com.dreamdev.simpleretrofit.models.User
import com.hoikhong.searchusergithubmvp.R
import com.hoikhong.searchusergithubmvp.adapters.UserListAdapter
import kotlinx.android.synthetic.main.fragment_main.*

class MainFragment : Fragment(), MainContact.View {
    val presenter: MainPresenter = MainPresenter(this)

    override fun setAdapterData(items: List<User>) {
        listUsers.adapter = UserListAdapter(context!!,items)
    }

    companion object {

        fun newInstance(): MainFragment {
            return MainFragment()
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val rootView = inflater!!.inflate(R.layout.fragment_main, container, false)
        initView(rootView)
        return rootView

    }

    private fun initView(rootView:View) {

        val recyclerView  = rootView.findViewById<RecyclerView>(R.id.listUsers)
        recyclerView.layoutManager = LinearLayoutManager(context)
        recyclerView.itemAnimator = DefaultItemAnimator()

        val searchView = rootView.findViewById<SearchView>(R.id.searchUsers)
        searchView.setOnQueryTextListener(object: SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(text: String?): Boolean {
                presenter.searchUser(text)
                return false
            }

            override fun onQueryTextChange(text: String?): Boolean {
//                presenter.searchUser(text)
                return false
            }
        })
    }

}