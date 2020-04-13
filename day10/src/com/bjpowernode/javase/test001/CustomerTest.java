package com.bjpowernode.javase.test001;

public class CustomerTest {
    public static void main(String[] args) {

        //创建一个Customer 对象
        Customer c1 = new Customer();
        c1.name  = "zhangsan";
        c1.shopping();
        //创建Customer 对象
        Customer c2 = new Customer();
        c2.name = "lisi";
        c2.shopping();

        //doSome 修饰符有 static， 采用 类.方法名  ，调用过程中无对象参与
        Customer.doSome();

    }
}
