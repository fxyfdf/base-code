package com.bjpowernode.javase.test001;

/**
 * 1 this
 *
 */
public class Customer {

    String name;

    //构造方法
    public Customer(){

    }

    //顾客行为
    //没有static 的关键字的方法称为  实例方法   实例方法 的访问 引用.  这个动作的完成是否需要对象参与，不需要就加static
    //没有static 的关键字的变量称为实例变量

    public void shopping(){
        System.out.println(this.name + "xxx 在购物");
    }

    //带static
    public  static  void  doSome(){
        System.out.println("Error:(26, 28) java: 无法从静态上下文中引用非静态 变量 name");
    }

    public static void doOther(){

        Customer c = new Customer();
        System.out.println(c.name);
    }

}
