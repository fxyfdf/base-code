package com.test.student;

public class OOTest03 {

    public static void main(String[] args) {

        // U 是引用
        // u 是局部变量
        User u = new User();

        // a 是引用
        // a 是局部变量
        Address a = new Address();
        u.addr = a;
        a.city = "BJ";

        System.out.println(u.addr);
        System.out.println(u.addr.city);

    }
}
