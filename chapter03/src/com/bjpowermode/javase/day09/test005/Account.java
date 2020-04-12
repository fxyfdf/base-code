package com.bjpowermode.javase.day09.test005;

//账户类
public class Account {

    //账户
    private String  actno; // 实例变量、对象变量。也就是说必须先有对象才能有对应的实例变量

    //余额
    private double  balance;

    //构造无参函数
    public Account(){
        //actno = null;
        //double = 0.0;
    }
    public Account(String s){
        actno = s;
    }

    public String getActno() {
        return actno;
    }

    public void setActno(String actno) {
        this.actno = actno;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }


}
