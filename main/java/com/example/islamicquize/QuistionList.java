package com.example.islamicquize;

public class QuistionList {
    private String quistion,op1,op2,op3,op4,answer;
    private String userSelectedAnswer;

    public QuistionList(String quistion, String op1, String op2, String op3, String op4, String answer, String userSelectedAnswer)
    {
        this.quistion=quistion;
        this.op1 = op1;
        this.op2 = op2;
        this.op3 = op3;
        this.op4 = op4;
        this.answer=answer;

        this.userSelectedAnswer = userSelectedAnswer;
    }



    public void setquistion(String quistion)
    {
        this.quistion = quistion;
    }
    public void setOp1(String op1)
    {
        this.op1 = op1;
    }
    public void setOp2(String op2)
    {
        this.op2 = op2;
    }
    public void setOp3(String op3)
    {
        this.op3 = op3;
    }
    public void setOp4(String op4)
    {
        this.op4 = op4;
    }
    public void setAnswer(String answer)
    {
        this.answer = answer;
    }
    public void setUserSelectedAnswer(String userSelectedAnswer)
    {
        this.userSelectedAnswer = userSelectedAnswer;
    }



    public String getquistion()
    {
        return quistion;}

    public String getOp1()
    {
        return op1;
    }

    public String getOp2()
    {
        return op2;
    }

    public String getOp3()
    {
        return op3;
    }

    public String getOp4()
    {
        return op4;
    }
    public String getanswer()

    {

        return answer;
    }

    public String getUserSelectedAnswer()
    {
        return userSelectedAnswer;
    }











}
