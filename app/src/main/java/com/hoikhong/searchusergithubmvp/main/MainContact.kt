package com.hoikhong.searchusergithubmvp.main

import android.content.Context
import com.dreamdev.simpleretrofit.models.User

interface MainContact {


    interface View{

        fun setAdapterData(items: List<User>)

    }

    interface userActionListener{

    }

}