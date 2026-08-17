package com.junglebook.livestats

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val textView = TextView(this)

        textView.text = """
            JungleBook Live Stats

            Live Stats App
        """.trimIndent()

        textView.textSize = 24f
        textView.setPadding(32, 32, 32, 32)

        setContentView(textView)
    }
}
