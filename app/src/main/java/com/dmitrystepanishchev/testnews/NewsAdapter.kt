package com.dmitrystepanishchev.testnews

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class NewsAdapter(val news: List<News>, private var onItemClickListener: OnItemClickListener) : RecyclerView.Adapter<NewsAdapter.ViewHolder>() {

    class ViewHolder(val view: View) : RecyclerView.ViewHolder(view){
        val dateTitle:TextView=view.findViewById(R.id.date_title)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.news_list_item, parent, false)
                as LinearLayout
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = news[position]
        holder.dateTitle.text=item.date+"  "+item.title

        holder.view.setOnClickListener {
            onItemClickListener.onItemClicked(item)
        }
    }

    override fun getItemCount(): Int {
        return news.size
    }

}