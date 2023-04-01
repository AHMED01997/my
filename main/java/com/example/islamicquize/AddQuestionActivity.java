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
                d.get(0).setquistion(questionEditText.getText().toString());
                d.get(0).setOp1(option1EditText.getText().toString());
                d.get(0).setOp2(option2EditText.getText().toString());
                d.get(0).setOp3(option3EditText.getText().toString());
                d.get(0).setOp4(option4EditText.getText().toString());
                d.get(0).setAnswer(answerEditText.getText().toString());
                d.get(0).setquistion(questionEditText.getText().toString());
                d.get(0).setUserSelectedAnswer("");



                // Display a success message and clear the text fields
                Toast.makeText(AddQuestionActivity.this, "done" ,Toast.LENGTH_SHORT).show();
                questionEditText.setText("");
                answerEditText.setText("");
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
    }
    private void addQuestion() {
        // Get the question and answer text from the EditText views
        String questionText = questionEditText.getText().toString();
        String answerText = answerEditText.getText().toString();

        // Get an instance of the database helper
        QuistionDatabaseHelper dbHelper = new QuistionDatabaseHelper(this);

        // Insert the new question into the database

    }*/
}

