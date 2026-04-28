
package com.example.lifehackapp
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
class MainActivity:AppCompatActivity(){
 override fun onCreate(savedInstanceState:Bundle?){
  super.onCreate(savedInstanceState)
  setContentView(R.layout.activity_main)
  findViewById<Button>(R.id.startBtn).setOnClickListener{
   startActivity(Intent(this,QuestionActivity::class.java))
  }
 }
}
