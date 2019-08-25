package com.study.sort;

/**
 *
 * 冒泡排序
 * 1.两个相邻元素相互比较,数大的往后移;
 * 2.对每一对相邻的元素进行比较，从开头到结尾，将最大的数移动到最后面;
 * 3.将已经移动完毕的数固定，然后其余元素再按1、2步骤进行移动，直到结束
 **/
public class BubbleSort {

    public static int[] bubbleSort(int[] array){
        int temp;
        int[] bubbleArray = array;
        for (int i=0;i<bubbleArray.length;i++){
            /**
             *
             * i代表已经成功排序的数据个数；-1是为了将j+1和j进行比对到最后一位(j代表倒数第二位)
             * **/
            for (int j=0;j<bubbleArray.length-1-i;j++){
                if (bubbleArray[j+1]<bubbleArray[j]){
                    temp = bubbleArray[j+1];
                    bubbleArray[j+1] = bubbleArray[j];
                    bubbleArray[j] = temp;
                }
            }
        }
        return bubbleArray;
    }
}
