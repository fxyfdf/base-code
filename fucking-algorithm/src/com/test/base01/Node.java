package com.test.base01;

import java.sql.SQLOutput;

/**
 *  单链表实现
 *
 */
public class Node {
    //数据
    int value;
    //下一节点
    private Node next;

    public Node(int value,Node next){
        this.value = value;
        this.next = next;
    }

    public Node (int value){
        this.value = value;
    }

    public Node(){}

    //封装几个方法
    //判断next 是否为null。 作用，如果不是null时可以继续next
    public boolean hasNext(){
        return this.next == null ? false : true;
    }

    public Node addToNext(Node node){
        node.next = this.next;
        this.next = node;
        return node;
    }

    public Node setValue(int value){
        this.value = value;
        return this;
    }

    public Node getValue(){
        this.next = next;
        return this;
    }

    public Node getNext() {
        return next;
    }

    public Node setNext(Node node) {
        this.next = next;
        return this;
    }

    //链表尾部插入
    public void addToTail(Node node){
        Node temp = this;
        while(temp.hasNext()){
            temp = temp.next;
        }
        temp.next = node;
    }

    //链表头插入
    public void addToHead(Node head,Node node){
        node.next = head.next;
        head.next = node;
    }


    @Override
    public String toString() {
        String val = Integer.toString(value);
        if(next != null){
            val = val.concat("hasNext");
            val = val.concat(next.toString());
        }
        return val;
    }

    //递归遍历列表
    public void traverse(Node  head) {

        for (Node p = head;p !=null; p = p.next){
//            return p;
            System.out.println(p.value);
        }
        //return p;
    }

    //单链表反转
//    public static Node reverse(Node head){
//        Node curNode = null;
//        Node afterNode = null;
//        if(head ==null){
//            return null;
//        }
//        if(head.hasNext()){
//            curNode = head.getNext();
//        }else {
//            return head; //加入只有一个节点,不进行反转
//        }
//        if (curNode.hasNext()){
//            afterNode = curNode.getNext();
//        }else {
//            curNode.setNext(head); //假如链表只有两个节点 ，直接反转引用
//            head.setNext(null);
//            return curNode;
//        }
//        //假如有三个及3个以上
//        //先将第一个节点独立，如果不独立则这个节点将永远指向原链表中的第二个节点，会成环。必须切断引用
//
//
//    }




    public static void main(String [] args){
        // 链表，先有许多个节点，再把节点串起来

        //头结点
        Node head = new Node(-1);
        //第一个节点
        Node firstNode = new Node(0);
        //第二个节点
        Node secondNode = new Node(1);
        //链接
        head.addToNext(firstNode);
        //加入第二个节点
        firstNode.addToNext(secondNode);
        //向尾部添加节点
        head.addToTail(new Node(2));
        //向头部添加节点
        head.addToHead(head,new Node(3));
        //向中间添加节点
        secondNode.addToNext(new Node(4));
        head.traverse(head);
        //输出
        System.out.println(head);

    }
}


