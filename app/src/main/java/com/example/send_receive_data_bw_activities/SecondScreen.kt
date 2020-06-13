package com.example.send_receive_data_bw_activities

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_second_screen.*

class SecondScreen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_screen)

        btSubmit.setOnClickListener {
            val intent= Intent()
            intent.putExtra(MainActivity.NAME,etName.text.toString())
            intent.putExtra(MainActivity.MAIL,etMail.text.toString())
            setResult(Activity.RESULT_OK,intent)

            finish() //AKA GetBACK wherever itActivityIntent came



        }

    }
}
