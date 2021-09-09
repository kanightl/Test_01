package com.neuedu.work.homework;

public class TestStudent {
    public static void main(String[] args) throws Exception {
        Student s = new Student();

        try {
            s.getScore(50, 150);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class Student {
    private int usualScore;
    private int finalScore;

    public Student(int usualScore, int finalScore) {
        this.usualScore = usualScore;
        this.finalScore = finalScore;
    }

    public Student() {
    }

    public void getScore(int usualScore, int finalScore) throws Exception {

        if (((usualScore + finalScore) / 2) < 60) {
            System.out.println("总成绩小于60！");
        } else {
            System.out.println("总成绩" + (usualScore + finalScore) / 2);
        }

    }
}