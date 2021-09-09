package com.neuedu.work.day0806;

public class Test_使用栈校验表达式 {
    public static void main(String[] args) {
        String expstr="((5-3)*8-2)";
        valid(expstr);

    }

    public static void valid(String s ){
        SeqStack<String > stack=new SeqStack<>();
        boolean flag=true;//表示能够匹配
        for (int i=0;i<s.length();i++){
            char c=s.charAt(i);
            switch(c){
                case '(':
                    stack.push("(");
                    break;
                case ')':
                    if (stack.isEmpty() || !stack.pop().equals("(")){
                        flag=false;
                    }
                    break;
            }
        }
        if (!flag || !stack.isEmpty()){
            System.out.println("不匹配");
        }else {
            System.out.println("匹配");
        }
    }
}
