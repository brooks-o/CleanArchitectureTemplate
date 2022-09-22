package com.example.base.extensions

import android.util.Log
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.base.ui.BaseAdapter

@BindingAdapter("bind:item")
fun RecyclerView.binItem(list: List<Nothing>?) {
    list?.let {
        (adapter as BaseAdapter<*>)
            .run {
                setList(list)
            }
    }
}