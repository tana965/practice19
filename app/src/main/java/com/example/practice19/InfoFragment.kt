package com.example.practice19

import androidx.fragment.app.Fragment
import android.widget.TextView
import android.os.Bundle
import android.view.ViewGroup
import android.view.LayoutInflater
import android.view.View
import android.widget.ImageView


class InfoFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_info, container, false)
    }
    // обновление текстового поля
    fun setSelectedItem(selectedItem: String?) {
        val textView = view?.findViewById<TextView>(R.id.textView)
        val image  = view?.findViewById<ImageView>(R.id.imageView)
        image?.visibility = View.VISIBLE

        when(selectedItem){
            getString(R.string.cat1) ->{
                image?.setImageResource(R.drawable.sfinksa)
                textView?.setText(R.string.Sphink)
            }
            getString(R.string.cat2) ->{
                image?.setImageResource(R.drawable.reks)
                textView?.setText(R.string.Rex)
            }
            getString(R.string.cat3) ->{
                image?.setImageResource(R.drawable.sbibr)
                textView?.setText(R.string.Siberian)
            }

        }
    }
}