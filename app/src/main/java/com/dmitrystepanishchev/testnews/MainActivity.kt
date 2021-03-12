package com.dmitrystepanishchev.testnews

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.view.View
import android.widget.LinearLayout
import android.widget.ScrollView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity(), OnDataListener {

    var lastNews = News("", "", "")
    lateinit var newsListFragment:NewsListFragment
    var newsFragment = NewsFragment.newInstance(lastNews)
    private var isTwoPane = false
    var listPos=0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        isTwoPane = findViewById<View>(R.id.frame_left) != null
        newsListFragment = NewsListFragment(savedInstanceState?.getInt("RVstate") ?: 0)

        if (isTwoPane) {
            if(savedInstanceState?.getBoolean("isNews") == true){
                newsFragment=NewsFragment.newInstance(savedInstanceState.getParcelable<News>("News")!!, savedInstanceState.getInt("scrollNews"))
            }
            supportFragmentManager.beginTransaction().add(R.id.frame_left, newsListFragment)
                .add(R.id.frame_right, newsFragment).commit()
        } else {
            supportFragmentManager.beginTransaction().add(R.id.container, newsListFragment)
                .commit()
        }
    }

    override fun OnData(Data: News) {
        lastNews = Data
        newsFragment = NewsFragment.newInstance(Data)
        listPos = ((newsListFragment.view?.findViewById<RecyclerView>(R.id.newsRecyclerView))?.layoutManager as LinearLayoutManager).findFirstVisibleItemPosition()
        supportFragmentManager.beginTransaction()
            .replace(
                if (isTwoPane)
                    R.id.frame_right
                else
                    R.id.container, newsFragment
            )
            .addToBackStack(null).commit()
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        if(!isTwoPane&&newsFragment.view!=null){
            outState.putBoolean("isNews", true)
            outState.putParcelable("News", lastNews)
            outState.putInt("scrollNews", newsFragment.view?.findViewById<ScrollView>(R.id.scrollView)?.scrollY?:0)
        }
        else{
            outState.putBoolean("isNews", false)
            listPos = ((newsListFragment.view?.findViewById<RecyclerView>(R.id.newsRecyclerView))?.layoutManager as LinearLayoutManager).findFirstVisibleItemPosition()

        }
        outState.putInt("RVstate", listPos)
    }
}