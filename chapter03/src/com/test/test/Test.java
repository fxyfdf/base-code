package com.test.test;

public class Test {
    public static void main(String[] args) {
        System.out.println("我是主函数入口");

        //創建User對象
        User user = new User();

        /*
        编译报错，age属性私有化，在外部程序中不能直接访问，只能通过 封装的方法进行访问
         */
        user.setAge(1010);
        int age = user.getAge();
        System.out.println("age: " + age);
    }
}
