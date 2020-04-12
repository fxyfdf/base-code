package com.test.student;

import javax.jws.soap.SOAPBinding;

public class OOTest02 {

    public static void main(String[] args) {

        //创建User对象
        User u = new User();

        System.out.println(u.name);
        System.out.println(u.no);
        System.out.println(u.addr);
        System.out.println(u.addr.street);


    }

}
