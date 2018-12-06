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

    /**二分查找**/
    /*迭代*/
    public int BinarySerachIterative(int[] A,int n,int data){
        int low =0,high = n-1,mid;
        while (low<high){
            mid = low + (high-low)/2;
            if (A[mid]==data){
                return mid;
            } else if (A[mid]<data) {
                low = mid+1;
            }else {
                high = mid-1;
            }
        }
        return  -1;
    }
    /*递归*/
    public int BinarySerachRescursive(int[] A,int high,int low,int data){
        int mid = low + (high-low)/2;
        if (A[mid]==data){
            return mid;
        }else if (A[mid]<data){
            return BinarySerachRescursive(A,high,mid+1,data);
        }else {
            return BinarySerachRescursive(A,mid-1,low,data);
        }
    }
}
