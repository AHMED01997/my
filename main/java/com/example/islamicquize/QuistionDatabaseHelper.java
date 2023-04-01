package com.example.islamicquize;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;

public class QuistionDatabaseHelper extends SQLiteOpenHelper {
public  static final String DatabaseName="app.db";
public QuistionDatabaseHelper(Context context) {
        super(context, DatabaseName, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table Quize (id INTEGER primary key AUTOINCREMENT,quistion TEXT,op1 TEXT,op2 TEXT,op3 TEXT ,op4 TEXT,answer TEXT,userSelectedAnswer TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
       db.execSQL("DROP TABLE IF EXISTS Quize ");
       onCreate(db);
        }
        public String insertData(String quistion,String op1,String op2,String op3,String op4,String answer,String userSelectedAnswer ){
    SQLiteDatabase s =this.getWritableDatabase();
            ContentValues values=new ContentValues();
            values.put("quistion",quistion);
            values.put("op1",op1);
            values.put("op2",op2);
            values.put("op3",op3);
            values.put("op4",op4);
            values.put("answer",answer);
            values.put("userSelectedAnswer",userSelectedAnswer);
  long re =  s.insert("Quize",null,values);
    if(re==-1)
        return"error";
    else
        return "ok done";
        }

        public ArrayList <QuistionList> getData(){
    ArrayList<QuistionList> arrayList =new ArrayList();
    SQLiteDatabase s =this.getReadableDatabase();
            Cursor c =s.rawQuery("select*from Quize",null);
            c.moveToFirst();

            while(c.isAfterLast()==false){
                arrayList.add(new QuistionList(
                        c.getString(0),
                        c.getString(1),
                        c.getString(2),
                        c.getString(3),
                        c.getString(4),
                        c.getString(5),
                        c.getString(6)) );
                c.moveToNext();
            }

    return arrayList;


        }
    }
