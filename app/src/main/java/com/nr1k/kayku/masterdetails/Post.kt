package com.nr1k.kayku.masterdetails

import java.util.ArrayList
import java.util.HashMap


object Post {

    var ITEMS: MutableList<DataClass> = ArrayList()
    var ITEM_MAP: MutableMap<String,DataClass> = HashMap()

    init {
    }
    fun addItem(item: DataClass) {
        Post.ITEMS.add(item)
        Post.ITEM_MAP.put(item.id, item)
    }
}