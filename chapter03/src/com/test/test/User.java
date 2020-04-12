package com.test.test;

public class User {
    //屬性私有化
    private int age;

    //無返回值，只修改值
    public void setAge(int num){
        if (num > 100 || num < 0){
            System.out.println("输入年龄有误");
        }else {
            age = num;
        }
    }

    public int getAge(){
        return age;
    }


}
