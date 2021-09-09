package com.neuedu.work.day0727;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Test_自定义学生类的排序 {
    public static void main(String[] args) {
        Studebt_58[] a={
                new Studebt_58("tom",101,50),
                new Studebt_58("jerry",102,30),
                new Studebt_58("jack",102,80),
                new Studebt_58("rose",102,60),
        } ;
        Arrays.sort(a);//升序
        Arrays.sort(a, Collections.reverseOrder());//降序
        for (Studebt_58 s:a){
            System.out.println(s);
        }
    }
}



class Studebt_58 implements Comparable<Studebt_58>{
    private String name;
    private int sno;
    private int score;

    @Override
    public int compareTo(Studebt_58 o) {
        int i;
        //1按照姓名比较
//      i=this.name.compareTo(o.name);
        //2按照学号比较
//        i=this.sno-o.sno;
       // 3按照成绩比较
        i=this.score-o.score;
        return i;
    }

    public Studebt_58() {
    }

    public Studebt_58(String name, int sno, int score) {
        this.name = name;
        this.sno = sno;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSno() {
        return sno;
    }

    public void setSno(int sno) {
        this.sno = sno;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Studebt_58{" +
                "name='" + name + '\'' +
                ", sno=" + sno +
                ", score=" + score +
                '}';
    }
}

