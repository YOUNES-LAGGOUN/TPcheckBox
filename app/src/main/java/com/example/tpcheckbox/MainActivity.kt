package com.example.tpcheckbox

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val checkBox1 = findViewById<CheckBox>(R.id.checkBox1)
        val checkBox2 = findViewById<CheckBox>(R.id.checkBox2)
        val checkBox3 = findViewById<CheckBox>(R.id.checkBox3)
        val checkBox4 = findViewById<CheckBox>(R.id.checkBox4)
        val buttonPanier = findViewById<Button>(R.id.buttonPanier)


        buttonPanier.setOnClickListener {
            val selectedItems = mutableListOf<String>()

            if (checkBox1.isChecked) selectedItems.add("Item 1 - 150€")
            if (checkBox2.isChecked) selectedItems.add("Item 2 - 150€")
            if (checkBox3.isChecked) selectedItems.add("Item 3 - 105€")
            if (checkBox4.isChecked) selectedItems.add("Item 4 - 110€")


            val intent = Intent(this, BlankFragment::class.java)
            intent.putStringArrayListExtra("SELECTED_ITEMS", ArrayList(selectedItems))
            startActivity(intent)
        }
    }
}
