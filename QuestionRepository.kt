
package com.example.lifehackapp.data
import com.example.lifehackapp.model.Question
object QuestionRepository {
 val questions=listOf(
  Question("Coffee sobers you up.",false,"It only reduces tiredness."),
  Question("Airplane mode charges faster.",true,"Stops background apps."),
  Question("Rice fixes wet phones.",false,"Not reliable."),
  Question("Cold showers increase alertness.",true,"Boosts circulation."),
  Question("Sugar makes kids hyper.",false,"Myth."),
  Question("Blue light affects sleep.",true,"Disrupts melatonin.")
 )
}
