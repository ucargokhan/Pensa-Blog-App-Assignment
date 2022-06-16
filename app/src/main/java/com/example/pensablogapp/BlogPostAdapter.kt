package com.example.pensablogapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.view.*

class BlogPostAdapter(
    private val posts: MutableList<BlogPost>
) : RecyclerView.Adapter<BlogPostAdapter.BlogPostViewHolder>(){
    class BlogPostViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BlogPostViewHolder {
        return BlogPostViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.activity_main,
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: BlogPostViewHolder, position: Int) {
        val curPost = posts[position]
        holder.itemView.apply {
            tvBlogTitle.text = curPost.title
            tvBlogComment.text = curPost.comment
            tvBlogText.text = curPost.content
        }
    }

    override fun getItemCount(): Int {
        return posts.size
    }
}