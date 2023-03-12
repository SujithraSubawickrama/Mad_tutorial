package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.EditText
import android.widget.Spinner
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import models.FormData

class MainActivity : AppCompatActivity() {
    lateinit var edtStudentId: EditText
    lateinit var spnYear: Spinner
    lateinit var spnSemester:Spinner
    lateinit var cbAgree: CheckBox
    lateinit var tvYear: TextView
    lateinit var tvSemester:TextView
    private var count = 0;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        edtStudentId  = findViewById(R.id.SID)
        tvYear = findViewById(R.id.Year)
        spnYear = findViewById(R.id.spinner3)
        tvSemester = findViewById(R.id.Semester)
        spnSemester = findViewById(R.id.spinner2)
        cbAgree = findViewById(R.id.checkBox)
        fun displayAlert(title:String, message:String){
            val builder = AlertDialog.Builder(this)
            builder.setTitle(title)
            builder.setMessage(message)
            builder.setPositiveButton("OK") { dialog, which ->
            // Do something when the "OK" button is clicked     }     val dialog = builder.create()     dialog.show() }
            }
    }
}

    fun submit(v: View){
        val myForm = FormData(
            edtStudentId.text.toString(),
            spnYear.selectedItem.toString(),



            spnSemester.selectedItem.toString(),
    };