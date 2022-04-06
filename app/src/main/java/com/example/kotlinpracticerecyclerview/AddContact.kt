package com.example.kotlinpracticerecyclerview

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class AddContact : AppCompatActivity() {

    private lateinit var etName: EditText
    private lateinit var etPhoneNumber: EditText
    private lateinit var btSubmit: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_contact)

        etName = findViewById(R.id.et_name)
        etPhoneNumber  = findViewById(R.id.et_phone_number)
        btSubmit  = findViewById(R.id.bt_submit)

        btSubmit.setOnClickListener{

            setResult(Activity.RESULT_OK, Intent(this.applicationContext, MainActivity::class.java)
                .putExtra("name", etName.text.toString())
                .putExtra("phoneNumber", etPhoneNumber.text.toString()))
            finish()
        }
    }
}