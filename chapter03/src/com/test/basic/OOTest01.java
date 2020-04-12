package com.test.basic;

import java.sql.SQLOutput;

public class OOTest01 {

    public static void  main(String[] args){

        //int 是基本数据类型
        //i 是一个变量名
        // 10 是一个int 类型的字面值
        int i = 10;

        //通过一个类可以实例化N个对象
        //实例化对象的语法： new 类名();
        //new 是java语言当中的语法运算符
        //new 运算符的作用是创建对象，在JVM 堆内存当中开辟新的内存空间
        //方法区内存，在类加载的时候，class字节码片段被加载到该内存空间当中
        //栈内存（局部变量）：方法代码片段执行的时候，会给该方法分配内存空间，在栈内存中压栈
        //堆内存： new 的对象在堆内存中存储

        //Student是一个引用数据类型
        //s 是一个变量名
        //new Student() 是一个学生对象
        // st 是一个局部变量 【在栈内存中存储】
        //什么是对象， new 运算符在堆内存中开辟的内存空间称为对象
        //什么是引用，引用是一个变量，只不过这个变量中保存了另一个java对象的内存地址
        //java语言当中，不能直接操作堆内存，java中 没有指针，
        //java语言当中，通过引用区访问堆内存中对象内部实例变量
        Student s = new Student();

        //访问实例变量的语法格式：
        // 读取数据：引用.变量名
        // 修改数据: 引用.变量名 = 值
        s.no = 11;
        int stuNo = s.no;
        s.no = 10;
        String stuName = s.name;
        int stuAge = s.age;
        String stuAddr = s.addr;

        System.out.println(stuNo);
        System.out.println(stuName);
        System.out.println(stuAge);
    }
}
