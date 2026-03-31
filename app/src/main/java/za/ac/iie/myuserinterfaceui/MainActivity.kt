package za.ac.iie.myuserinterfaceui

import android.os.Bundle
import android.widget.Button
import android.widget.Switch
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        // declaring all the conponents located in the user interface
        var clicMebutton=findViewById<Button>(R.id.buttonEnter)
        var zulu=findViewById<Switch>(R.id.zuluSwitch)
        // assignating a toast message to the button "buttonEnter" when clicked
        clicMebutton.setOnClickListener {
            Toast.makeText(this@MainActivity, "button clicked", Toast.LENGTH_SHORT).show()
        }



















        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}