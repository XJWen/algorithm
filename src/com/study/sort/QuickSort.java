package com.study.sort;

public class QuickSort {

    public static int Partition(int a[],int p,int r){
        int x = a[r-1];//取最末尾的数
        int i = p-1;//从0开始
        int temp;
        for (int j=p;j<=r-1;j++){
            if (a[j-1]<=x){
                i++;//用来判断数组前半段的有序度指针
                temp=a[j-1];
                a[j-1]=a[i-1];
                a[i-1]=temp;
            }
        }
        temp=a[r-1];
        a[r-1]=a[i+1-1];//前i项已排列，将第i项放到最后一位做参考变量
        a[i+1-1]=temp;
        return i+1;
    }

    public static void QuickSort(int a[],int p,int r){
        if (p<r){
            int q = Partition(a,p,r);
            System.out.println(q);
            QuickSort(a,p,q-1);
            QuickSort(a,q+1,r);
        }
    }

    public static void main(String[] args){
        int a[]={23,53,77,36,84,76,93,13,45,23};
        QuickSort(a,1,10);
        for (int i=1;i<=10;i++){ System.out.println(a[i-1]);}


    }
}
