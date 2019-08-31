package com.study.method.recursionTest;

import com.study.structure.AboutListNode;
import com.study.structure.ListNode;

public class test01 {

    /**
     * 递归结束条件是否够严谨问题
     * 递归第一步，确定入参
     * 第二步，确定结束条件
     * 第三步，找出函数等价公式(最难)
     * **/
    public static void main(String[] args){
        System.out.printf("跳%d台阶有%d种跳法\n",3,f1(3));
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        node1.setNext(node2);
        node2.setNext(node3);
        node3.setNext(node4);
        node4.setNext(null);
        ListNode newNode = AboutListNode.reserveListNode(node1);
        while (newNode!=null){
            System.out.print(newNode.getData()+" ");
            newNode = newNode.getNext();
        }
//        System.out.println(newNode.getData()+" "+newNode.getNext().getData()+" "+newNode.getNext().getNext().getData()+" "+newNode.getNext().getNext().getNext().getData());
    }
    /**
     * 一只青蛙一次可以跳上1级台阶，也可以跳上2级。求该青蛙跳上一个n级的台阶总共有多少种跳法。
     * @param n 代表上第n级台阶
     **/
    static  int f1(int n){
         if (n<=1){
             return 1;
         }
         //n-1 代表跳一阶台阶 \ n-2  代表跳两阶台阶
         return f1(n-1)+f1(n-2);
    }
}
