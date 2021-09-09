package com.neuedu.work.day03;

public class Test_05 {
    public static void main(String[] args) {
//         kongxing(5,8);
//        System.out.println();

        int x=5;
        System.out.println("方法调用前x="+x);
        getX(x);
        System.out.println("调用后x="+x);

        int[] y ={5};
        System.out.println("方法调用前y[0]="+y[0]);
        getY(y);
        System.out.println("调用后y[0]="+y[0]);

    }

//    //创建一个方法，有参数row。col，使用星号答应举行
//    public static void daying(int row,int col){
//        for (int i=0;i<row;i++){
//            for (int j=0;j<col;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }


//    public static void kongxing(int row,int col){
//        for (int i=0;i<row;i++){
//            for (int j=0;j<col;j++){
//                if ( i==0 || i==row-1 || j==0 || j==col-1 ){
//                    System.out.println("*");
//                }else {
//                    System.out.println(" ");
//                }
//            }
//            System.out.println();
//        }
//    }

    public static  void getX(int x){
        x =x+3;
    }
    public static void getY(int[] y){
        y[0]=y[0]+3;
    }




}
