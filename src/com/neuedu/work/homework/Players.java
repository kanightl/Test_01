package com.neuedu.work.homework;

public class Players {

   private static int sum;

   private  Players(){}

   public static Players crate(){
       sum=0;
       Players players=null;
       for( int i=0;i>-1;i++){
              sum++;
              if (sum==12){
                  System.out.println("对不起，已经创建了11个对象。不能再创建对象了");
                  break;
              }else {
                  System.out.println("创建了一个对象");
              }

       }
       return players;
   }
    public static void main(String[] args) {
      Players.crate();
    }
}

