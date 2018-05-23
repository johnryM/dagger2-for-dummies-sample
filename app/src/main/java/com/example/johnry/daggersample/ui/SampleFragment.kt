package com.example.johnry.daggersample.ui


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.example.johnry.daggersample.R
import com.example.johnry.daggersample.di.Choose
import com.example.johnry.daggersample.di.DaggerSampleComponent
import com.example.johnry.daggersample.stuff.Info
import com.example.johnry.daggersample.stuff.InfoWithArguement
import kotlinx.android.synthetic.main.fragment_blank.*
import javax.inject.Inject


class SampleFragment : Fragment() {

    @Inject
    lateinit var info : Info
    @Inject @field:Choose("info_arg_one")
    lateinit var multiInfoOne : InfoWithArguement
    @Inject @field:Choose("info_arg_two")
    lateinit var multiInfoTwo : InfoWithArguement

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_blank, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        DaggerSampleComponent.create().injectFragment(this)
        fragTitle.text = info.getMessage()
        fragTitleTwo.text = String.format(resources.getString(R.string.multi_string, multiInfoOne.message, multiInfoTwo.message))
    }


}
