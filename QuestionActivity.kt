
package com.example.lifehackapp
import android.content.Intent
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import com.example.lifehackapp.data.QuestionRepository

class QuestionActivity:AppCompatActivity(){
 var i=0
 var score=0
 var answered=false
 override fun onCreate(savedInstanceState:Bundle?){
  super.onCreate(savedInstanceState)
  setContentView(R.layout.activity_question)

  val qText=findViewById<TextView>(R.id.questionText)
  val feed=findViewById<TextView>(R.id.feedbackText)
  val prog=findViewById<TextView>(R.id.progressText)

  val tBtn=findViewById<Button>(R.id.trueBtn)
  val fBtn=findViewById<Button>(R.id.falseBtn)
  val nBtn=findViewById<Button>(R.id.nextBtn)

  fun load(){
   val q=QuestionRepository.questions[i]
   qText.text=q.text
   prog.text="Question ${i+1}/${QuestionRepository.questions.size}"
   feed.text=""
   answered=false
  }

  fun check(ans:Boolean){
   if(answered)return
   answered=true
   val q=QuestionRepository.questions[i]
   if(ans==q.isTrue){
    score++
    feed.text="Correct! "+q.explanation
   }else{
    feed.text="Wrong! "+q.explanation
   }
  }

  tBtn.setOnClickListener{check(true)}
  fBtn.setOnClickListener{check(false)}

  nBtn.setOnClickListener{
   i++
   if(i<QuestionRepository.questions.size){
    load()
   }else{
    val intent=Intent(this,ScoreActivity::class.java)
    intent.putExtra("score",score)
    intent.putExtra("total",QuestionRepository.questions.size)
    startActivity(intent)
    finish()
   }
  }
  load()
 }
}
