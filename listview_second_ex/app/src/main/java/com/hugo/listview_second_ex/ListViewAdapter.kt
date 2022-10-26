package com.hugo.listview_second_ex

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

//class ListViewAdapter(val List: MutableList<String>) : BaseAdapter() {
class ListViewAdapter(val List: MutableList<ListViewModel>) : BaseAdapter() {
    override fun getCount(): Int {
        return List.size
    }

    override fun getItem(p0: Int): Any {
        return List[p0]
    }

    override fun getItemId(p0: Int): Long {
        return p0.toLong()
    }

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        var convertView = p1

        /* 이런 모양으로 들어있을꺼야
       * List = [
        * ListViewModel("a", "b"),
        * ListViewModel("c", "d"),
        * ListViewModel("e", "f"),
        * ]
        */

        if (convertView == null) {
            convertView = LayoutInflater.from(p2?.context).inflate(R.layout.listview_item, p2, false)
        }

        val title = convertView!!.findViewById<TextView>(R.id.listviewItemText)
        val title2 = convertView!!.findViewById<TextView>(R.id.listviewItemText2)
        title.text = List[p0].text1
        title2.text = List[p0].text2

        return convertView!!
    }
}