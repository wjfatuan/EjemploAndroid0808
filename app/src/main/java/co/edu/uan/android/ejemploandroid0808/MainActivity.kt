package co.edu.uan.android.ejemploandroid0808

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    val num1:Int = (0..100).random()
    val num2 = (0..100).random()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val b1 = findViewById<Button>(R.id.button1)
        val tr = findViewById<TextView>(R.id.resultado)
        b1.setOnClickListener {
            if(num1>num2) {
                tr.text =     "Felicitaciones, gano"
                Toast.makeText(this, "Felicitaciones, gano", Toast.LENGTH_LONG).show()
            }
            else {
                tr.text =     "\uD83D\uDE41"
                Toast.makeText(this, "\uD83D\uDE41", Toast.LENGTH_LONG).show()
            }
        }

        val b2 = findViewById<Button>(R.id.button2)
        b2.setOnClickListener {
            if(num1<num2) {
                tr.text =     "Felicitaciones, gano"
                Toast.makeText(this, "Felicitaciones, gano", Toast.LENGTH_LONG).show()
            }
            else {
                tr.text =     "\uD83D\uDE41"
                Toast.makeText(this, "\uD83D\uDE41", Toast.LENGTH_LONG).show()
            }
        }
    }
}