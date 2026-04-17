package za.ac.iie.myuserinterfaceui

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Switch
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat


class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n", "UseSwitchCompatOrMaterialCode")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        // declaring all the components located in the user interface
        val clickMebutton=findViewById<Button>(R.id.buttonEnter)
        val zulu=findViewById<Switch>(R.id.zuluSwitch)
        val greetingText=findViewById<TextView>(R.id.textViewone)
        val inputText=findViewById<EditText>(R.id.editTextInput)
        // assignating a toast message to the button "buttonEnter" when clicked
        clickMebutton.setOnClickListener {
            Toast.makeText(this@MainActivity, "button clicked", Toast.LENGTH_SHORT).show()
            //configurated the textview so that the greeting can contain the name of the user
            greetingText.text="welcome,${inputText}!"
            //set the action of the switch
            if (zulu.isChecked){
                greetingText.text="Sawubona, ${inputText}!"
            }else greetingText.text="welcome, ${inputText}!"



        }



















        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}