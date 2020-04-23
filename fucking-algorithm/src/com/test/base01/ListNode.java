package com.test.base01;

// 链表定义

public  class ListNode {
    // 数据
    int value;
    // 下一节点
    ListNode next;

    //链表方法之一： 遍历链表值
    public void traverse(ListNode head) {
        for (ListNode p = head; p != null; p = p.next) {
            // 迭代访问p.val
            System.out.println(p.value);
        }
    }

    // 获取key
    public int getValue() {
        return value;
    }

    public ListNode setValue(int val){
        this.value = value;
        return  this;
    }

    public ListNode getNext(){
        return next;
    }

    public ListNode setNext(ListNode next) {
        this.next = next;
        return this;
    }

}