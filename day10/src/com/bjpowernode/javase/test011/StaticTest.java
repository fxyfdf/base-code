package com.bjpowernode.javase.test011;

public class StaticTest {
    //静态语句块
    static{
        System.out.println("1");
    }

    static{
        System.out.println("2");
    }

    static{
        System.out.println("3");
    }

    static{
        System.out.println("4");
    }

    //入口
    public static void main(String[] args){
        System.out.println("main execute!  1");
        System.out.println("main execute!  2");
    }

}
