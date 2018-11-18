package liran.com.wallpaper

import android.annotation.SuppressLint
import android.content.Intent
import android.opengl.Visibility
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.view.View
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
@SuppressLint("ResourceAsColor")
fun setTextBox(view: View)
{
    findViewById<TextView>(R.id.editText).apply {
        var contentment = ""
        text = contentment }
    findViewById<TextView>(R.id.editText).apply {
        setTextColor(R.color.black)            }
}
fun sendMessage(view: View)
{
    val editText = findViewById<EditText>(R.id.editText)
    val message = editText.text.toString()
    val intent = Intent(this, DisplayMessageActivity::class.java).apply {
        putExtra(EXTRA_MESSAGE, message)

    }
    startActivity(intent)
}
}
