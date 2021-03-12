package com.dmitrystepanishchev.testnews

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class NewsListFragment(var position:Int = 0) : Fragment() {

    var news=ArrayList<News>()
    private lateinit var mainContext: Context

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        if(container!=null){
            container.removeAllViews()
        }
        news=DataManager().getNews()
        val view = inflater.inflate(R.layout.fragment_news_list, container, false)
        val recyclerView:RecyclerView=view.findViewById(R.id.newsRecyclerView)
        recyclerView.adapter=NewsAdapter(news, object :OnItemClickListener{
            override fun onItemClicked(item: News) {
                (mainContext as OnDataListener).OnData(item)
            }
        })
        (recyclerView.layoutManager as LinearLayoutManager).scrollToPosition(position)
        return view
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        mainContext=context
    }
}