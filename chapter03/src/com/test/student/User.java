package com.test.student;

//用户类
public class User {

    //属性 [以下都是成员变量只实例变量]

    //用户编号
    //int 是一种基本数据类型： 整数型
    //no 是一个实例变量
    int no;
    //用户名
    //String 是一种引用数据类型: 代表字符串
    //name 是一个实例变量
    //name 是一个引用
    String name;

    //家庭住址
    //Address 是一种引用数据类型: 代表家庭住址
    //addr 是一个实例变量
    //addr 是一个引用
//    String addr;
    Address addr = new Address();

}
