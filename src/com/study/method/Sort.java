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
    /**
     * 冒泡算法改进
     **/
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

    /*插入排序*/
    public void InsertionSort(int[] A,int n){
        //通过三个变量来做坐标
        int i =0,j = 0,v = 0;
        for (i=2;i<=n-1;i++){
            //暂存A[i]值
            v = A[i];
            j = i;
        }
        while (A[j-1] > v&&j>=1){
            A[j] = A[j-1];
            j--;
        }
        A[j] = v;
    }

    /*归并排序*/
    public void Mergesort(int[] A,int[] temp,int left,int right){
        int mid = 0;
        if (left>right){
            mid = (right+left)/2;
            Mergesort(A,temp,left,mid);
            Mergesort(A,temp,mid+1,right);
            Merge(A,temp,left,right,mid+1);
        }
    }
    public void Merge(int[] A,int[] temp,int left,int right,int mid){
        int i =0,left_end = 0,size = 0,temp_pos =0;
        left_end = mid -1;
        temp_pos = left;
        size = right - left + 1;
        while ((left<=left_end)&&(mid<=right)){
            if (A[left]<=A[mid]){
                temp[temp_pos] = A[left];
                temp_pos = temp_pos+1;
                left = left+1;
            }else {
                temp[temp_pos] = A[mid];
                temp_pos = temp_pos+1;
                mid = mid+1;
            }
        }
        while (left<=left_end){
            temp[temp_pos] = A[left];
            left = left+1;
            temp_pos +=1;
        }
        while (mid<=right){
            temp[temp_pos] = A[mid];
            mid = mid+1;
            temp_pos = temp_pos+1;
        }
        for (i=0;i<=size;i++){
            A[right] = temp[right];
            right --;
        }
    }

    /*快速排序*/
    public void Quicksort(int[] A,int low,int high){
        int pivot = 0;
        if (high>low){
            pivot = Partition(A,low,high);
            Quicksort(A,low,pivot-1);
            Quicksort(A,pivot+1,high);
        }
    }
    public int Partition(int[] A,int low,int high){
        int left,right,pivot_item = A[low];
        left = low;
        right = high;
        while (left<right){
            /*当item<pivot移动左指针*/
            while (A[left]<=pivot_item){
                left++;
            }
            /*当item>pivot移动右指针*/
            while (A[right]>=pivot_item){
                right++;
            }
            if (left<right){

            }

        }
        A[low] = A[right];
        A[right] = pivot_item;
        return right;
    }


}
