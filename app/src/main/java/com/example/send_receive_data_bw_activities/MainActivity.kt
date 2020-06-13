package com.example.send_receive_data_bw_activities

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    companion object {
        const val FIRST_SCREEN_ACTIVITY_REQUEST_CODE = 1
        const val SECOND_SCREEN_ACTIVITY_REQUEST_CODE = 2

        const val NAME = "name"
        const val MAIL = "mail"

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btFirstScreen.setOnClickListener {
            val intent = Intent(this, FirstScreen::class.java)
            startActivityForResult(intent, FIRST_SCREEN_ACTIVITY_REQUEST_CODE)
        }

        btSecondScren.setOnClickListener {
            val intent = Intent(this, SecondScreen::class.java)
            startActivityForResult(intent, SECOND_SCREEN_ACTIVITY_REQUEST_CODE)

        }


    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        when (resultCode) {
            Activity.RESULT_OK -> {
                if (requestCode == FIRST_SCREEN_ACTIVITY_REQUEST_CODE) {
                    tv_First.text = "FirstScreen Activity Result is OK"
                } else if (requestCode == SECOND_SCREEN_ACTIVITY_REQUEST_CODE) {
                    if (data != null) {
                        var name = data!!.getStringExtra(NAME)
                        var email = data!!.getStringExtra(MAIL)

                        tvSecond.text="$name - $email"
                    }


                }


            }
            Activity.RESULT_CANCELED -> {
                if (requestCode == FIRST_SCREEN_ACTIVITY_REQUEST_CODE) {
                    tv_First.text = "FirstScreen Activity Canceled"
                } else if (requestCode == SECOND_SCREEN_ACTIVITY_REQUEST_CODE)
                    tvSecond.text = "SecondScreen Activity Canceled"
            }
        }

    }
}
