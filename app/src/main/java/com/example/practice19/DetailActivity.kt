package com.example.practice19

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.res.Configuration


class DetailActivity : AppCompatActivity() {
    companion object{
        const val SELECTED_ITEM = "SELECTED_ITEM"
    }
    var selectedItem = "Не выбрано"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        if(resources.configuration.orientation ==
            Configuration.ORIENTATION_LANDSCAPE){
            finish()
            return
        }

        setContentView(R.layout.activity_detail)

        val extras: Bundle? = intent.extras
        selectedItem = extras?.getString(SELECTED_ITEM).toString()
    }
    override fun onResume() {
        super.onResume()

        val fragment: InfoFragment =
            supportFragmentManager.findFragmentById(R.id.detailFragment) as
                    InfoFragment
        fragment?.setSelectedItem(selectedItem)
    }



}