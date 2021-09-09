package com.neuedu.work.day0729.Algorithm;

public class Test_顺序查找 {
    public static void main(String[] args) {
        int[] data = {3,6,7,2,12,9,0,11};
        int n=12;
        int index=search(data,n);
        System.out.println("index="+index);
    }

    /**
     * 查找数组中是否包含某个值
     * @param a 待查找的数组
     * @param t 被查找的值
     * @return 如果找到，则返回该值在数组中的索引；如果没有找到，则返回-1
     */
    public static int search(int[] a,int t){
        for (int i=0;i<a.length;i++){
            if (a[i]==t){
                return i;
            }
        }
        return -1;
    }
}
