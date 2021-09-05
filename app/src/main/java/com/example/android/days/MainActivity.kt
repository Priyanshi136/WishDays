package com.example.android.days

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun createTheCard(view: View) {
        val days = inputDay.editableText.toString()
        val intent = Intent(this, CardView::class.java)
        intent.putExtra("day", days)
        startActivity(intent)
    }

    fun showSomePics(view: View) {
        val intent = Intent(this, ViewPics::class.java)
        startActivity(intent)
    }
}