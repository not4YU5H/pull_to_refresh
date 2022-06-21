package com.example.pulltorefresh


import android.os.Bundle
import android.os.Handler
import android.view.LayoutInflater
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout
import java.util.*


class MainActivity : AppCompatActivity() {
    var swipeRefreshLayout: SwipeRefreshLayout? = null
    var textView: TextView? = null
    var r = 1
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        swipeRefreshLayout = findViewById<View>(R.id.simpleSwipeRefreshLayout) as SwipeRefreshLayout
        textView = findViewById<View>(R.id.textView) as TextView

        val i1 = 1
        textView!!.text = "1"
        swipeRefreshLayout!!.setOnRefreshListener {
            Handler().postDelayed({
                swipeRefreshLayout!!.isRefreshing = false
                textView!!.text = r.toString()
            }, 1000)
            r += i1
        }
    }
}