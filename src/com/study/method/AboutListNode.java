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
    /**
     * 插入链表节点
     * **/
    public ListNode insertListNode(ListNode headNode,ListNode inserNode,int position){
        if (headNode == null){
            return inserNode;
        }
        int size = getListLength(headNode);
        if (position>size||position<1){
            System.out.println("插入点position不在范围内");
            return headNode;
        }
        if (position == 1){
            headNode = inserNode;
            return headNode;
        }else {
            ListNode previousNode = headNode;
            int count = 1;
            while (count<position-1){
                previousNode = previousNode.getNext();
                System.out.println(count+" Node data is "+previousNode.getData());
                count++;
            }
            ListNode currentNode = previousNode.getNext();
            inserNode.setNext(currentNode);
            previousNode.setNext(inserNode);
        }
        return headNode;
    }

    public ListNode DeleteListNode(ListNode headNode,int position){
        if (headNode==null){
            System.out.println("当前链表为空，无法删除");
            return headNode;
        }
        int size = getListLength(headNode);
        if (position>size||position<1){
            System.out.println("插入点position不在范围内");
            return headNode;
        }
        if (position == 1){
            ListNode currentNode = headNode.getNext();
            headNode = null;
            return currentNode;
        }else {
            ListNode previousNode = headNode;
            int count = 1;
            while (count < position){
                previousNode = previousNode.getNext();
                System.out.println(count+" Node data is "+previousNode.getData());
                count++;
            }
            ListNode currentNode = previousNode.getNext();
            previousNode.setNext(currentNode.getNext());
            currentNode=null;
        }
        return headNode;
    }
}
