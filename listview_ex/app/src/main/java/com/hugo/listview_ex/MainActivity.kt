package com.hugo.listview_ex

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val list_item = mutableListOf<ListViewModel>()

        list_item.add(ListViewModel("오징어 게임", "볼만함"))
        list_item.add(ListViewModel("스위트홈", "내 나름 명작"))
        list_item.add(ListViewModel("수리남", "킬링타임용으로 좋음"))

        val listview = findViewById<ListView>(R.id.mainListview)

        val listAdapter = ListViewAdapter(list_item)
        listview.adapter = listAdapter
    }
}