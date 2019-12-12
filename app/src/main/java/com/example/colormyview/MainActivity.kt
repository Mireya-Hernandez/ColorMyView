package com.example.colormyview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.graphics.Color
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListeners()
    }

    private fun setListeners() {
        val clickableView: List<View> =
            listOf(
                box_one_text, tex_box_two, text_box_three,
                text_box_four, text_box_five,constraint_layout,red_button,yellow_button,green_button,text_box_six)

        for (item in clickableView) {
            item.setOnClickListener { makeColored(it) }
        }
    }

    private
    fun makeColored(view: View) {
        when (view.id) {

            // Boxes using Color class colors for background
            R.id.box_one_text -> view.setBackgroundColor(Color.DKGRAY)
            R.id.tex_box_two -> view.setBackgroundColor(Color.GRAY)

            // Boxes using Android color resources for background
            R.id.text_box_three -> view.setBackgroundResource(android.R.color.holo_green_light)
            R.id.text_box_four-> view.setBackgroundResource(android.R.color.holo_green_dark)
            R.id.text_box_five-> view.setBackgroundResource(android.R.color.holo_green_light)
            R.id.text_box_six -> view.setBackgroundResource(android.R.color.holo_blue_bright)

            // Boxes using custom collors for the background
            R.id.red_button -> text_box_three.setBackgroundResource(R.color.red)
            R.id.yellow_button -> text_box_four.setBackgroundResource(R.color.yellow)
            R.id.green_button -> text_box_five.setBackgroundResource(R.color.green)

            else -> view.setBackgroundColor(Color.LTGRAY)
        }
    }
}