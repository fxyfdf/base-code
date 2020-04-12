package com.bjpowermode.javase.day09.test005;

/**
 *
 * 构造方法的作用
 *      1.创建对象
 *      2.创建对象的同时，初始化实例变量的内存空间。 【给实例变量赋值】
 *
 *  成员变量之实例变量，属于对象级别的变量，这种变量必须先有对象才能有实例变量
 *  实例变量没有手动赋值的时候，系统默认赋值，
 *  类加载的时候只加载了代码片段，还没来得及创建对象，所以此时实例变量并没有初始化
 *
 *  实际上，实例变量的内存空间是在构造方法执行过程中完成开辟的，完成初始化的
 *  系统在默认赋值的  时候，也是在构造方法执行过程当中完成赋值的
 *
 *  实例变量默认值：
 *      byte,short,int,long 0
 *      float,double 0.0
 *      belean false
 *      引用类型 null
 *
 *      实例变量是存储在JVM的堆内存java对象内部。
 */
public class ConstructorTest02 {

    public static void main(String[] args) {
        //TDO Auto-generated method stub
        // 创建对象
        Account actl = new Account();

        System.out.println("账号：" + actl.getActno());
        System.out.println("余额：" + actl.getBalance());

        String s = "ad";
        Account actl2 = new Account(s);
        double d = 10000.0;
        actl2.setBalance(d);
        System.out.println("账号：" + actl2.getActno());
        System.out.println("余额：" + actl2.getBalance());
    }
}
