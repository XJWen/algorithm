package com.study.method;

import com.study.structure.DLLNode;

/**
 * 双向链表
 * **/
public class AboutDLLNode {
    public static int getListLength(DLLNode headNode){
        int length = 0;
        DLLNode currentListNode = headNode;
        while (currentListNode!=null){
            length++;
            currentListNode = currentListNode.getNext();
        }
        return length;
    }

    public DLLNode insertDLLNode(DLLNode headNode,DLLNode insertNode,int position){
        if (headNode==null){
            headNode = insertNode;
            return headNode;
        }
        int size = getListLength(headNode);
        if (position>size||position<1){
            System.out.println("position超出范围");
            return headNode;
        }
        if (position==1){
            insertNode.setNext(headNode);
            headNode.setPrevious(insertNode);
            return insertNode;
        }else {
            DLLNode previousNode = headNode;
            int count = 1;
            while (count<position-1){
                previousNode = previousNode.getNext();
                count++;
            }
            DLLNode currentNode = previousNode.getNext();
            insertNode.setNext(currentNode);
            if (currentNode!=null){
                currentNode.setPrevious(insertNode);
            }
            previousNode.setNext(insertNode);
            insertNode.setPrevious(previousNode);
        }
        return headNode;
    }

    public DLLNode deleteDLLNode(DLLNode headNode,int position){
        if (headNode==null){
            System.out.println("当前双向链表为空！");
            return headNode;
        }
        int size =getListLength(headNode);
        if (position>size||position<1){
            System.out.println("position超出范围");
            return headNode;
        }
        if (position==1){
            DLLNode currentNode = headNode.getNext();
            headNode=null;
            currentNode.setPrevious(null);
            return currentNode;
        }else {
            DLLNode previousNode = headNode;
            int count = 1;
            while (count<position){
                previousNode = previousNode.getNext();
                count++;
            }
            DLLNode currentNode = previousNode.getNext();
            DLLNode laterNode = currentNode.getNext();
            previousNode.setNext(laterNode);
            if (laterNode!=null){
                laterNode.setPrevious(previousNode);
            }
            currentNode=null;
        }
        return headNode;
    }
}
