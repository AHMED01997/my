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
       db.execSQL("CREATE TABLE quistions (id INTEGER PRIMARY KEY AUTOINCREMENT, quistion TEXT, op1 TEXT, op2 TEXT, op3 TEXT, op4 TEXT, answer TEXT)");
   }

   @Override
   public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
       db.execSQL("DROP TABLE IF EXISTS quistions;");
       onCreate(db);
   }
   public boolean insertData(String quistion,String op1 ,String op2 ,String op3 ,String op4 , String answer){
       SQLiteDatabase db =this.getWritableDatabase();
       ContentValues contentValues = new ContentValues();
       contentValues.put("quistion",quistion);
       contentValues.put("op1",op1);
       contentValues.put("op2",op2);
       contentValues.put("op3",op3);
       contentValues.put("op4",op4);
       contentValues.put("answer",answer);
       long result =db.insert("quistions",null,contentValues);
       if(result==-1)
           return false;
       else
           return true;


   }

public ArrayList getAllRecord(){
    ArrayList arrayList =new ArrayList() ;
    SQLiteDatabase db =this.getReadableDatabase();
   Cursor res =db.rawQuery("select * from quistions",null);
   res.moveToFirst();
   while (res.isAfterLast()==false){

       String t1= res.getString(0);
       String t2= res.getString(1);
       String t3= res.getString(2);
       String t4= res.getString(3);
       String t5= res.getString(4);
       String t6= res.getString(5);
       arrayList.add(t1+t2+t3+t4+t5+t6);
       res.moveToNext();


   }

     return arrayList;


}


}
