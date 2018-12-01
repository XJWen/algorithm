package com.study.method;

import com.study.structure.ListNode;

public class AboutListNode {

    public static int getListLength(ListNode headNode){
        int length = 0;
        ListNode currentListNode = headNode;
        while (currentListNode!=null){
            length++;
            currentListNode = currentListNode.getNext();
        }
        return length;
    }
}
