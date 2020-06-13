package com.example.send_receive_data_bw_activities

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_first_screen.*
import kotlinx.android.synthetic.main.activity_main.*

class FirstScreen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_screen)

        btFinish.setOnClickListener {
            setResult(Activity.RESULT_OK)
            finish()
        }
    }
}
