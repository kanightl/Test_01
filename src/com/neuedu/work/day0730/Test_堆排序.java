package com.neuedu.work.day0730;



import java.util.Arrays;

public class Test_堆排序 {
    public static void main(String[] args) {
        int[] arr = { 27, 46, 12, 33, 49, 27, 36, 40, 42, 50, 51 };
        heapSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void heapSort(int[] a){
        //从最后一个非叶节点开始，对数组初始化，建立大顶堆，完成后数组的第0个位置就是最大值了；
        for (int i=a.length/2-1;i>=0;i--){
            heapify(a,i,a.length);
        }
        //从后往前循环去数组的索引，与第0个位置交换，然后对剩下元素重新生成大顶堆；
        for (int i=a.length-1;i>0;i--){
            swap(a,0,i);
            heapify(a,0,i-1);
        }
    }

    //对数组a，以索引i为父节点，到索引lastIndex为止，建立大顶堆
    public static void heapify(int[] a,int i,int lastIndex){
            int max=i;
        //取索引为i的元素的左子节点，进行比较；
            if (2*i+1<lastIndex && a[2*i+1]>max){
                //设置左子节点的索引为最大值
                max=2*i+1;
            }

        //取索引为i的元素的右子节点，进行比较；
        if (2*i+2<lastIndex && a[2*i+2]>max){
            //设置右子节点的索引为最大值
            max=2*i+2;
        }
        if (max!=i){
            swap(a,max,i);
            //交换完，索引i位置是最大值
            //要考虑索引 max也可能是一个父节点，交换玩，max节点可能就小于子节点了
            //  所以需要对max这个父节点再次生成大顶堆
            heapify(a,max,lastIndex);
        }


    }

    //交换数组元素
    public static void swap(int[] a,int i,int j){
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
}
