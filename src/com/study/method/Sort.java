package com.study.method;

public class Sort {

    /*冒泡算法*/
    public void BubbleSort(int A[],int n){
        for (int pass = n-1;pass>=0;pass--){
            for (int i = 0;i<pass;i++){
                if (A[i]>A[i+1]){
                    int temp = A[i];
                    A[i] = A[i+1];
                    A[i+1] = temp;
                }
            }
        }
    }

    public void BubbleSortImproved(int A[],int n){
        int pass,i,temp;
        boolean swapped = true;
        for (pass = n-1;pass>=0&&swapped;pass--){
            swapped = false;
            for (i = 0;i<pass;i++){
                if (A[i]>A[i+1]){
                    temp = A[i];
                    A[i] = A[i+1];
                    A[i+1] = temp;
                    swapped = true;
                }
            }
        }
    }
    /*选择排序*/
    public void Selection(int A[],int n){
        int i,j,temp,min;
        for (i =0;i<n-1;i++){
            min = i;
            for (j=i+1;j<n;j++){
                if (A[j]<A[min]){
                    min = j;
                }
                temp = A[min];
                A[min] = A[j];
                A[j] = temp;
            }
        }
    }
}
