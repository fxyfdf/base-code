package com.bjpowernode.javase.test008;

/**
 * 中国人类
 *
 */
public class Chinese {

    //每个中国人都有身份证号
    String id;

    //名字
    String name;

    //国籍固定 为中国, 实例变量每个对象都有一份
    //静态变量 存储在方法去中，类加载时候就分配了内存空间
    static String country="中国";

    //构造函数
    public Chinese(){

    }
    public Chinese(String id,String name){
        this.id = id;
        this.name = name;
//        this.country = country;

    }
}
