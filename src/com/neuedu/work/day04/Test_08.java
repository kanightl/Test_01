package com.neuedu.work.day04;

public class Test_08 {
    public static void main(String[] args) {
        Person_08 p = new Person_08();
        p.def="";
        p.pro="";
        p.pub="";

        p.doDef();
        p.doPro();
        p.doPub();


    }
}


class Person_08{
    private String pri;
    String def;
    protected String pro;
    public String pub;

    private void doPri() {}
    void doDef() {}
    protected void doPro() {}
    public void doPub() {}

}
