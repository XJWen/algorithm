package com.study.method;

public class Search {
    /*无序线性查找*/
    public int UnsorteddLinearSearch(int[] A,int n,int data){
        for (int i =0;i<n;i++){
            if (A[i]==data){
                return i;
            }
        }
        return -1;
    }

    /**
     * 排序/有序线性查找
     * 前提是数组已排序
     * **/
    public int SortedLinearSerach(int[] A,int n,int data){
        for (int i=0;i<n;i++){
            if (A[i]==data){
                return i;
            }else if (A[i]>data){
                return -1;
            }
        }
        return -1;
    }
}
