package com.test.base01;

//import java.util.List;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class Test01 {
    //定义测试数组
    //  int arr1[] ;
    // 指定数组长度
    int arr1[] = new int[4] ;
    char arr2[];
    //        String arr3[];
    //直接初始化

    //主测试方法
    public static void main(String[] args) {

        int arr4[] = {1,2,3};
        Test01 t1 = new Test01();
        t1.traverrse(arr4);
        traverrse(arr4);

        //头结点
        ListNode head = new ListNode();
        head.setValue(-1);
        head.setNext(null);
        //第一个节点
        ListNode firstNode = new ListNode();
        firstNode.setValue(0);
        head.setNext(null);
        //链接
        head.setNext(firstNode);
        System.out.println(head.getNext() + " " + head.getNext().getValue());
        System.out.println(firstNode.getNext());

    }
    // 数组遍历: static 可以直接在同类中进行调用，public 类型 需要实例化
    public static void traverrse(int[] arr){
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }

    //链表测试;
    //头结点





}


