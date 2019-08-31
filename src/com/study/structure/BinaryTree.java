package com.study.structure;

public class BinaryTree {

    private BinaryTree leftTree;
    private BinaryTree regihtTree;
    private int num;

    public BinaryTree getLeftTree() {
        return leftTree;
    }

    public void setLeftTree(BinaryTree leftTree) {
        this.leftTree = leftTree;
    }

    public BinaryTree getRegihtTree() {
        return regihtTree;
    }

    public void setRegihtTree(BinaryTree regihtTree) {
        this.regihtTree = regihtTree;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
