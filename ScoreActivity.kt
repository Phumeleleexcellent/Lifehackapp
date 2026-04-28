
package com.example.lifehackapp
import android.content.Intent
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class ScoreActivity:AppCompatActivity(){
 override fun onCreate(savedInstanceState:Bundle?){
  super.onCreate(savedInstanceState)
  setContentView(R.layout.activity_score)

  val s=intent.getIntExtra("score",0)
  val t=intent.getIntExtra("total",0)

  val msg=if(s>=t*0.7)"Master Hacker!" else "Keep Practicing!"

  findViewById<TextView>(R.id.scoreText).text="Score: $s/$t"
  findViewById<TextView>(R.id.feedbackText).text=msg

  findViewById<Button>(R.id.reviewBtn).setOnClickListener{
   startActivity(Intent(this,ReviewActivity::class.java))
  }
 }
}
