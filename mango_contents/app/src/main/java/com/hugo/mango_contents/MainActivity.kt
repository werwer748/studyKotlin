package com.hugo.mango_contents

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private val items = mutableListOf<ContentsModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bookmarkButton = findViewById<TextView>(R.id.bookmarkBtn)

        bookmarkButton.setOnClickListener {
            val intent = Intent(this, BookmarkActivity::class.java)
            startActivity(intent)
        }

        items.add(
            ContentsModel(
                "https://www.mangoplate.com/restaurants/zOOlz9vfJfFF",
                "https://mp-seoul-image-production-s3.mangoplate.com/260591/569295_1466420850640_35698?fit=around|512:512&crop=512:512;*,*&output-format=jpg&output-quality=80",
                "키오스크",
            )
        )
        items.add(
            ContentsModel(
                "https://www.mangoplate.com/restaurants/qs2kK_LDx0fU",
                "https://mp-seoul-image-production-s3.mangoplate.com/1981833_1648380690171626.jpg?fit=around|512:512&crop=512:512;*,*&output-format=jpg&output-quality=80",
                "조앤도슨",
            )
        )
        items.add(
            ContentsModel(
                "https://www.mangoplate.com/restaurants/wgLcFMiJ0pEc",
                "https://mp-seoul-image-production-s3.mangoplate.com/442807/682807_1666536538682_74541?fit=around|512:512&crop=512:512;*,*&output-format=jpg&output-quality=80",
                "오파",
            )
        )
        items.add(
            ContentsModel(
                "https://www.mangoplate.com/restaurants/0ZwLhf5n-y",
                "https://mp-seoul-image-production-s3.mangoplate.com/67078_1495326582514327.jpg?fit=around|512:512&crop=512:512;*,*&output-format=jpg&output-quality=80",
                "꽁티드툴레아",
            )
        )
        items.add(
            ContentsModel(
                "https://www.mangoplate.com/restaurants/RDv4bpoKdmW-",
                "https://mp-seoul-image-production-s3.mangoplate.com/47875_1496372587498703.jpg?fit=around|512:512&crop=512:512;*,*&output-format=jpg&output-quality=80",
                "비하인드리메인",
            )
        )
        items.add(
            ContentsModel(
                "https://www.mangoplate.com/restaurants/z-4tCw3TKCKn",
                "https://mp-seoul-image-production-s3.mangoplate.com/321230/744028_1500467594900_10931?fit=around|512:512&crop=512:512;*,*&output-format=jpg&output-quality=80",
                "육전식당",
            )
        )
        items.add(
            ContentsModel(
                "https://www.mangoplate.com/restaurants/gZgArT4cSW",
                "https://mp-seoul-image-production-s3.mangoplate.com/222693/897636_1663914793816_79163?fit=around|512:512&crop=512:512;*,*&output-format=jpg&output-quality=80",
                "공푸",
            )
        )
        items.add(
            ContentsModel(
                "https://www.mangoplate.com/restaurants/p4hlQ7fhOfyO",
                "https://mp-seoul-image-production-s3.mangoplate.com/32408_1662815073786654.jpg?fit=around|512:512&crop=512:512;*,*&output-format=jpg&output-quality=80",
                "도이칠란드 박",
            )
        )
        items.add(
            ContentsModel(
                "https://www.mangoplate.com/restaurants/jFWl95c1KbXZ",
                "https://mp-seoul-image-production-s3.mangoplate.com/47875_1665391133154583.jpg?fit=around|512:512&crop=512:512;*,*&output-format=jpg&output-quality=80",
                "우정초밥",
            )
        )
        items.add(
            ContentsModel(
                "https://www.mangoplate.com/restaurants/L9uOdmF_mKMs",
                "https://mp-seoul-image-production-s3.mangoplate.com/777980_1643629413047725.jpg?fit=around|512:512&crop=512:512;*,*&output-format=jpg&output-quality=80",
                "모짜",
            )
        )

        val recyclerView = findViewById<RecyclerView>(R.id.rv)
        val rvAdapter = RVAdapter(baseContext, items)
        recyclerView.adapter  = rvAdapter

        rvAdapter.itemClick = object: RVAdapter.ItemClick {
            override fun onClick(view: View, position: Int) {
                val intent = Intent(baseContext,  ViewActivity::class.java)
                intent.putExtra("url", items[position].url)
                intent.putExtra("title", items[position].titleText)
                intent.putExtra("imageUrl", items[position].imageUrl)
                startActivity(intent)
            }
        }

        recyclerView.layoutManager = GridLayoutManager(this, 2)
    }
}