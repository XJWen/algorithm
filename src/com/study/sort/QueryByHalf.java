package com.study.sort;

/**
 * 二分法查找相关元素
 * **/
public class QueryByHalf {

    public static void main(String[] args){
        String str[] = {"a","b","c","d","e","f","g","h"};
        int bsearch = bsearch(str, "g");
        System.out.println(bsearch);

    }

    /**
     * m 的位置在整个数组里比要查的字符串v  <  l=m+1
     *   >  r=m-1
     * **/
    static int bsearch(String[] str,String v){
        int l =0,r=str.length-1;
        while (l<=r){
            int m = (l+r)/2;
            if (str[m].compareTo(v)==0){
                return m;
            }else if (str[m].compareTo(v)<0){
                l = m+1;
            }else if (str[m].compareTo(v)>0){
                r = m-1;
            }
        }
        return -1;
    }
}

