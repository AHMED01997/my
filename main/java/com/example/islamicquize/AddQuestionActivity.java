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
    private QuistionDatabaseHelper dbHelper;
    QuistionDatabaseHelper db = new QuistionDatabaseHelper(this);

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
        dbHelper = new QuistionDatabaseHelper(this);






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


                String question = questionEditText.getText().toString();
                String answer = answerEditText.getText().toString();

                // Insert the new question into the database
                SQLiteDatabase db = dbHelper.getWritableDatabase();
                ContentValues values = new ContentValues();
                values.put(QuistionDatabaseHelper.COLUMN_QUESTION_TEXT, question);
                values.put(QuistionDatabaseHelper.COLUMN_ANSWER_TEXT, answer);
                long newRowId = db.insert(QuistionDatabaseHelper.TABLE_USER_QUESTIONS, null, values);

                // Display a success message and clear the text fields
                Toast.makeText(AddQuestionActivity.this, "Question added successfully!", Toast.LENGTH_SHORT).show();
                questionEditText.setText("");
                answerEditText.setText("");
            }
        });}

    private void saveQuestion(QuistionList question) {
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
}

