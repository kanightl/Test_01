package com.neuedu.work.day0802;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Test_桶排序 {
    public static void main(String[] args) {
        int[] arr = {3,44,38,5,47,15,36,26,27,2,46,4,19,50,48};
         bucketSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void bucketSort(int[] a){
        //获取原数组中的最大值最小值
        int max=a[0];
        int min=a[0];
        for (int i=1;i<a.length;i++){
            max=Math.max(max,a[i]);
            min=Math.min(min,a[i]);
        }

        //计算桶的数量，并创建集合来保存多个桶，并初始化每个桶
        int count =(max-min)/a.length+1;
        ArrayList<ArrayList<Integer>> buckets =new ArrayList<>();
        for (int i=0;i<count;i++){
            buckets.add(new ArrayList<>());
        }
        //遍历原数组，把数据放在对应的桶里
        for (int i=0;i<a.length;i++){
            buckets.get( (a[i] - min) / a.length ).add(a[i]);
        }

        //对每个桶内部排序
        for (int i =0;i<count;i++){
            Collections.sort(buckets.get(i));
        }


        //遍历桶集合，把每个桶的数据输出到原数组
        int k=0;//保存数组的索引
        for (int i=0;i<count;i++){
            ArrayList<Integer> list=buckets.get(i);
            for (Integer j:list){
                a[k++]=j;
            }
        }

    }
}
