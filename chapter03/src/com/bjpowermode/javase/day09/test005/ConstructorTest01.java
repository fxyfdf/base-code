package com.bjpowermode.javase.day09.test005;

/**
 * 关于java 类中的构造方法：
 *      1.构造方法又被称为 构造函数、构造器Constructor
 *      2.构造方法语法结构：
 *          [修饰符列表] 构造方法名   (形式参数列表) {
 *              构造方法体；
 *          }
 *      3.回顾普通方法的语法结构：
 *          [修饰符列表] 返回值类型   方法名 (形式参数列表){
 *              方法体
 *          }
 *      4.对于构造方法来说， “返回值类型” 不需要指定， 并且也不能写  void
 *      只要写成  void 就会成为 普通方法
 *      5.构造方法的名，必须和类名一致。
 *      6.构造方法作用：   通过构造方法调用创建对象
 *      7.构造方法调用：
 *          - 普通方法：方法修饰符中有 static 的时候： 类名.方法名(实参列表)、方法修饰符列表中没有static的时候： 引用.方法名(实参列表)
 *          - new 构造方法名(实参列表)
 *      8.构造方法调用执行后都有返回值，但是这个 “return  值” 这样的语句不需要写。构造 方法结束的时间java程序自动返回值
 *      并且返回值类型是构造方法所在类的类型。由于构造方法的返回值类型就是累本身，所以返回值类型不需要编写
 *
 *      9.当一个类中没有定义任何构造方法的话，系统默认 给该类提供一个无惨的构造 方法，这个构造方法被称为缺省构造器
 *      11.当一个了诶显示的将构造方法定义出来了，那么系统则不再默认创建为这个类提供缺省构造器。
 *      建议，创建无惨构造器，  方法重载。 只要构造函数调用 就会在堆中创建对象。
 **/
public class ConstructorTest01 {
    public static void main(String[] args) {

        // 创建User 对象
        // 调用User 类的构造方法来完成对象的创建
        User u1 = new User();
        User u2 = new User(1);

        // 调用带 static 的方法： 类名
        doSome(); // 同一个类中，调用静态方法
        ConstructorTest01.doSome();  //或类名 方法名

        //调用没有 static 的方法：引用
        //doOther 方法在ConstructorTest01类当中，所以需要创建 ConstructorTest01 对象
        // 创建对象，调用无惨构造方法
        ConstructorTest01 t1 = new ConstructorTest01();
        t1.doOther();

    }

    public  static  void doSome(){
        System.out.println("do some");
    }
    public void doOther(){
        System.out.println("do other");
    }
}
