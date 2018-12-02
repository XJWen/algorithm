package com.study;

import com.study.method.AboutListNode;
import com.study.structure.ListNode;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        TwoSum twoSum = new TwoSum();
//        int[] nums = {2,3,7,9,11};
//        twoSum.twoSum(nums,9);
//        twoSum.Twosum(nums,12);
//        twoSum.TwoSum(nums,16);

//        Hanoi.TowersOfHanoi(5,'A','C','B');
        ListNode listNode1 = new ListNode(4);
        ListNode listNode2 = new ListNode(15);
        ListNode listNode3 = new ListNode(7);
        ListNode listNode4 = new ListNode(40);
        ListNode listNode5 = new ListNode(100);
        ListNode listNode6 = new ListNode(0 );
        listNode1.setNext(listNode2);
        listNode2.setNext(listNode3);
        listNode3.setNext(listNode4);

        AboutListNode aboutListNode = new AboutListNode();
        aboutListNode.insertListNode(listNode1,listNode5,3);
    }
}
