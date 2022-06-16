package com.example.pensablogapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import java.io.File
import java.lang.Exception

class MainActivity : AppCompatActivity() {

    lateinit var blogAdapter: BlogPostAdapter



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        try {
            val fileName = "entriesFormatted.csv"
            var liness:List<String> = File(fileName).readLines()
            liness.forEach { line-> println(line) }

        }catch (e:Exception){
            e.printStackTrace()
        }finally {
            println("CSV Reading finished.")
        }



        blogAdapter = BlogPostAdapter(
            mutableListOf(
                BlogPost("BLOG","My first blog!","My first blog!","1","Nice work"),
                BlogPost("BLOG","Cats on the internet are funny","Cats on the internet are funny","4","Wow, look at that"),
                BlogPost("BLOG","How does this thing work?","How does this thing work?","6",""),
                //BlogPost(liness[0],liness[1],liness[2],liness[3],"SUCCESS")
        )
        )

        rvBlogItems.adapter = blogAdapter
        rvBlogItems.layoutManager = LinearLayoutManager(this)
    }
}