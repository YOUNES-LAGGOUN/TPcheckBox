package com.example.tpcheckbox

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class BlankFragment : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val selectedItems = intent.getStringArrayListExtra("SELECTED_ITEMS") ?: listOf()


        val selectedItemsTextView = findViewById<TextView>(R.id.textV)
        selectedItemsTextView.text = if (selectedItems.isNotEmpty()) {
            selectedItems.joinToString("\n")
        } else ¨addn63a
            "Aucun article"
        }
    }
}
