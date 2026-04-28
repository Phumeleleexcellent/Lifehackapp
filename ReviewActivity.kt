
package com.example.lifehackapp
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.lifehackapp.data.QuestionRepository

class ReviewActivity:AppCompatActivity(){
 override fun onCreate(savedInstanceState:Bundle?){
  super.onCreate(savedInstanceState)
  setContentView(R.layout.activity_review)

  val sb=StringBuilder()
  QuestionRepository.questions.forEach{
   sb.append(it.text+"\n")
   sb.append("Answer: "+(if(it.isTrue)"True" else "False")+"\n")
   sb.append(it.explanation+"\n\n")
  }
  findViewById<TextView>(R.id.reviewText).text=sb.toString()
 }
}
