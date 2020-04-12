package com.test.student;

public class OOTest05 {

    public static void main(String[] args) {

        Customer c = new Customer();
        System.out.println(c.id);

        c = null;

        //以下程序编译可以通过，因为符合语法
        //运行出现空指针异常
        //空引用访问“实例” 相关的数据， 一定会出现空指针异常

        //Exception in thread "main" java.lang.NullPointerException

        //空引用访问实例相关数据
        System.out.println("-------------------------");
        System.out.println(c.id);
    }
}

//"实例" 相关的数据表示： 这个数据访问的是必须有对象 的参与。 这种数据就是实例相关的数据
