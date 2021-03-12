package com.dmitrystepanishchev.testnews

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ScrollView
import android.widget.TextView
import androidx.fragment.app.Fragment

class NewsFragment():Fragment() {

    private lateinit var mainContext: Context

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        if(container!=null){
            container.removeAllViews()
        }
        val News: News = this.arguments?.getParcelable<News>("News")!!
        val scroll:Int = this.arguments?.getInt("scrollPos")?:0
        val view = inflater.inflate(R.layout.fragment_news, container, false)
        view.findViewById<TextView>(R.id.date_title).text=News.date+"  "+News.title
        view.findViewById<TextView>(R.id.text_news).text=News.text
        view.findViewById<ScrollView>(R.id.scrollView).scrollY=scroll
        return view
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        mainContext=context
    }

    companion object {
        fun newInstance(News:News, scroll:Int=0) = NewsFragment().apply {
            arguments = Bundle(2).apply {
                putParcelable("News",News)
                putInt("scrollPos",scroll)
            }
        }
    }
}