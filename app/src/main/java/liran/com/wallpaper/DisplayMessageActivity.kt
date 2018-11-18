package liran.com.wallpaper

import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.ImageView
import android.widget.TextView

class DisplayMessageActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_message)
        val kittycode = "Show the kitty"
        val message = intent.getStringExtra(EXTRA_MESSAGE)
        findViewById<TextView>(R.id.textView).apply {
            text = message
        }
      if (message == kittycode)
       {
        //Make the image visible
        findViewById<ImageView>(R.id.imageView).apply {
            visibility = View.VISIBLE
        }
       }

    }
}
