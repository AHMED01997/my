package com.example.islamicquize;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class QuistionBank {
    private static List<QuistionList> javaQuistion(){
        final List<QuistionList> quistionList= new ArrayList<>();
        final QuistionList quistion1=new QuistionList("معنى المعصرات","السحب","البحار","المطر", "الرعد","السحب","");
        final QuistionList quistion2=new QuistionList("معنى الطلح","التفاح","الموز","الكرز", "الوسائد","الموز","");
        final QuistionList quistion3=new QuistionList("معنى نمارق","حور عين","نوع فاكهة","كأس عذب", "وسائد","وسائد","");
        final QuistionList quistion4=new QuistionList("معنى أو هم قائلون","يعني عند قولهم","وقت القيلولة","وقت السحر", "بعد قولهم","وقت القيلولة","");
        final QuistionList quistion5=new QuistionList("معنى مريج","مختلط","قبيح","سهل", "محزن","مختلط","");
        final QuistionList quistion6=new QuistionList("اسم والد الرسول","ابوطالب","عبدالمطلب","هاشم", "عبدالله","عبدالله","");
        final QuistionList quistion7=new QuistionList("أحب الناس للرسول","يلال","ابوبكر","عمر", "عائشة","عائشة","");
        final QuistionList quistion8=new QuistionList("وقت غزوة بدر","2هجريا","6هجريا","3هجريا", "4هجريا","2هجريا","");
        final QuistionList quistion9=new QuistionList("اول مسجد في الاسلام","قباء","المسجد الحرام","القدس", "المسجد النبوي","قباء","");
        final QuistionList quistion10=new QuistionList("اعظم اية في القران","الكرسي","اية الدين","اية المواريث", "اية الجن","الكرسي","");

        quistionList.add(quistion1);


        quistionList.add(quistion2);

        quistionList.add(quistion3);
        quistionList.add(quistion4);
        quistionList.add(quistion5);


        quistionList.add(quistion6);

        quistionList.add(quistion7);
        quistionList.add(quistion8);
        quistionList.add(quistion9);


        quistionList.add(quistion10);


        Collections.shuffle(quistionList);
        for (QuistionList quistion : quistionList) {
            List<String> answers = new ArrayList<>();
            answers.add(quistion.getOp1());
            answers.add(quistion.getOp2());
            answers.add(quistion.getOp3());
            answers.add(quistion.getOp4());
            Collections.shuffle(answers);
            quistion.setOp1(answers.get(0));
            quistion.setOp2(answers.get(1));
            quistion.setOp3(answers.get(2));
            quistion.setOp4(answers.get(3));
        }

        return quistionList;
    }




    public static List<QuistionList>getQuistion (String selectedTobicName){
        switch (selectedTobicName){case "java":
            return javaQuistion();

            case "java2": return javaQuistion();
            case"java3":return javaQuistion();
            default :return javaQuistion();




        }












    }}
