package com.example.pr18

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity(),FirstFragment.OnFragmentSendDataListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onSendData(selectedItem: String?) {
        val fragment = supportFragmentManager.findFragmentById(R.id.fragmentContainerView2) as SecondFragment?
        fragment?.setSelectedItem(selectedItem)
    }

}