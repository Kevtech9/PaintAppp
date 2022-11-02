package com.example.paintapp

import android.graphics.Color
import android.graphics.Paint
import android.os.Bundle
import android.widget.ImageButton
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.paintapp.MainActivity.Companion.path
import com.example.paintapp.PaintView.Companion.colorList
import com.example.paintapp.PaintView.Companion.currentBrush
import com.example.paintapp.PaintView.Companion.pathList
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdView
import com.google.android.gms.ads.MobileAds


class MainActivity : AppCompatActivity() {

    lateinit var adView: AdView
    

    companion object{
        var path = android.graphics.Path()
        var paintBrush = Paint()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        loadBanner()
        supportActionBar?.hide()
        var redBtn =findViewById<ImageButton>(R.id.purpleColor)
        var blueBtn =findViewById<ImageButton>(R.id.blueColor)
        var blacktn =findViewById<ImageButton>(R.id.blackColor)
        var greenBtn = findViewById<ImageButton>(R.id.greenColor)
        var whiteBtn = findViewById<ImageButton>(R.id.whiteColor)
        var eraser =findViewById<ImageButton>(R.id.deleteline)


        redBtn.setOnClickListener {
            Toast.makeText(this,"Yellow", Toast.LENGTH_SHORT).show()
            paintBrush.color = Color.YELLOW
            currentColour(paintBrush.color)

        }
        blueBtn.setOnClickListener {
            Toast.makeText(this,"Blue", Toast.LENGTH_SHORT).show()
            paintBrush.color = Color.BLUE
            currentColour(paintBrush.color)

        }
        blacktn.setOnClickListener {
            Toast.makeText(this,"Black", Toast.LENGTH_SHORT).show()
            paintBrush.color = Color.BLACK
            currentColour(paintBrush.color)
        }
        greenBtn.setOnClickListener {
            Toast.makeText(this, "Green", Toast.LENGTH_SHORT).show()
            paintBrush.color=Color.GREEN
            currentColour(paintBrush.color)
        }
        whiteBtn.setOnClickListener {
            Toast.makeText(this, "Green", Toast.LENGTH_SHORT).show()
            paintBrush.color=Color.WHITE
            currentColour(paintBrush.color)
        }

        eraser.setOnClickListener {
            Toast.makeText(this,"ERASE ALL", Toast.LENGTH_SHORT).show()
            pathList.clear()
            colorList.clear()
            path.reset()

        }
    }

    private fun loadBanner() {
        TODO("Not yet implemented")
    }
}

    private fun  currentColour(color:Int){
        currentBrush = color
        path = android.graphics.Path()
    
}