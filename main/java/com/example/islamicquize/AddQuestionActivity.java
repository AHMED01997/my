package com.example.islamicquize;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class AddQuestionActivity extends AppCompatActivity {

    QuistionDatabaseHelper obj = new QuistionDatabaseHelper(this);

ArrayList getAllRecord;
    private EditText questionEditText;
    private EditText option1EditText;
    private EditText option2EditText;
    private EditText option3EditText;
    private EditText option4EditText;
    private EditText answerEditText;
    private Button submitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_question);
    //String n=   obj.isertData("","","","","","","");
ArrayList<QuistionList>d=obj.getData();





        questionEditText = findViewById(R.id.questionEditText);
        option1EditText = findViewById(R.id.option1EditText);
        option2EditText = findViewById(R.id.option2EditText);
        option3EditText = findViewById(R.id.option3EditText);
        option4EditText = findViewById(R.id.option4EditText);
        answerEditText = findViewById(R.id.answerEditText);
        submitButton = findViewById(R.id.submitButton);

       submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
addQuistion();

         // Display a success message and clear the text fields

            }
        });
        }


  /*  private void saveQuestion(QuistionList question) {
        // Save the question to the database
        // You can use a database like SQLite to store the data
        QuistionDatabaseHelper dbHelper = new QuistionDatabaseHelper(this);
        SQLiteDatabase db = dbHelper.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put("quistion", question.getquistion());
        values.put("op1", question.getOp1());
        values.put("op2", question.getOp2());
        values.put("op3", question.getOp3());
        values.put("op4", question.getOp4());
        values.put("answer", question.getanswer());

        db.insert("quistions", null, values);
        db.close();
    }*/
  public void addQuistion() {
      // Get the values of the new question from the user input
      String quistion = questionEditText.getText().toString();
      String op1 = option1EditText.getText().toString();
      String op2 = option2EditText.getText().toString();
      String op3 = option3EditText.getText().toString();
      String op4 = option4EditText.getText().toString();
      String answer = answerEditText.getText().toString();
      String userSelectedAnswer = "";

      // Call the insertData method to insert the new question into the Quiz table
      String result = obj.insertData(quistion, op1, op2, op3, op4, answer, userSelectedAnswer);
      if (result.equals("ok done")) {
          Toast.makeText(this, "Question added successfully", Toast.LENGTH_SHORT).show();
          // Clear the user input fields
          questionEditText.setText("");
          option1EditText.setText("");
          option2EditText.setText("");
          option3EditText.setText("");
          option4EditText.setText("");
          answerEditText.setText("");
      } else {
          Toast.makeText(this, "Question not added", Toast.LENGTH_SHORT).show();
      }
  }
}

