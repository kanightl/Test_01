package com.neuedu.work.day0729.Algorithm;

public class Test_二分法查找 {
    public static void main(String[] args) {
        int[] a={10,11,12,16,18,23,29 ,33,48,54,57,68,77,84,98};
       int t=23;
       int i=search(a,t);
        System.out.println(i);
    }

    public static int search(int[] a,int t){
        int count =0;//查找次数
        int low=0;
        int high=a.length-1;
        int i=-1;//表示被查找值的索引

        while (low<=high){
            count++;
            //如果low大于high则表示没找到
            int mid=(low+high)/2;
            if (a[mid]==t){
                i=mid;
                break;
            }else if (a[mid]<t){
                low=mid+1;
            }else {
                high=mid-1;
            }
        }
        System.out.println("一共找了"+count+"次");
        return i;
    }
}
