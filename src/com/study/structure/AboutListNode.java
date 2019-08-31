package com.study.structure;

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
        System.out.println("insertListNode:");
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
                System.out.println(count+" Node data is "+previousNode.getData());
                previousNode = previousNode.getNext();
                count++;
            }
            ListNode currentNode = previousNode.getNext();
            System.out.println("插入的数据在"+previousNode.getData()+"和"+currentNode.getData()+"之间");
            inserNode.setNext(currentNode);
            previousNode.setNext(inserNode);
        }
        return headNode;
    }

    public ListNode deleteListNode(ListNode headNode,int position){
        if (headNode==null){
            System.out.println("当前链表为空，无法删除");
            return headNode;
        }
        System.out.println("deleteListNode");
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
                System.out.println(count+" Node data is "+previousNode.getData());
                previousNode = previousNode.getNext();
                count++;
            }
            ListNode currentNode = previousNode.getNext();
            System.out.println("删除的节点数据："+currentNode.getData());
            previousNode.setNext(currentNode.getNext());
            currentNode=null;
        }
        return headNode;
    }

    public void deleteLinkList(ListNode head){
        ListNode auxilaryNode,iterator = head;
        if (iterator!=null){
            auxilaryNode =iterator.getNext();
            System.out.println("删除的节点数据为："+iterator);
            iterator=null;
            iterator = auxilaryNode;
        }
    }
    /**
     * 利用递归来实现反转链表
     * **/
    public static ListNode reserveListNode(ListNode head){
        //1.递归结束条件
        if (head==null||head.getNext()==null){
            return head;
        }
        //递归反转链表
        ListNode newlistNode = reserveListNode(head.getNext());
        // 改变 1，2节点的指向。
       // 通过 head.next获取节点2
        ListNode nextNode = head.getNext();
        // 让 2 的 next 指向 1
        nextNode.setNext(head);
        // 1 的 next 指向 null.
        head.setNext(null);

        return newlistNode;
    }
}
