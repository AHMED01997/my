package com.example.islamicquize;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;

public class QuistionDatabaseHelper extends SQLiteOpenHelper {

    public static final String DATABASE_NAME = "quistions.db";


    public  QuistionDatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String CREATE_QUISTIONS_TABLE = "CREATE TABLE " + "quistions" +
                "(" +
                "id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "quistion TEXT, " +
                "op1 TEXT, " +
                "op2 TEXT, " +
                "op3 TEXT, " +
                "op4 TEXT, " +
                "answer TEXT" +
                ")";
        String CREATE_USER_QUESTIONS_TABLE = "CREATE TABLE " + "user_questions" +
                "(" +
                "id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "question_text TEXT, " +
                "answer_text TEXT" +
                ")";
        db.execSQL(CREATE_QUISTIONS_TABLE);
        db.execSQL(CREATE_USER_QUESTIONS_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + "quistions");
        db.execSQL("DROP TABLE IF EXISTS " + "user_questions");
        onCreate(db);
    }}
