package co.edu.uan.android.ejemploandroid0808

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    val num1:Int = 10
    val num2 = 30
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val b1 = findViewById<Button>(R.id.button1)
        b1.setOnClickListener {
            if(num1>num2)
                println("Felicitaciones, gano")
            else
                println(":(")
        }

        val b2 = findViewById<Button>(R.id.button2)
        b2.setOnClickListener {
            if(num1<num2)
                println("Felicitaciones, gano")
            else
                println(":(")
        }
    }
}