package com.test.extendstest;

/**
 *   1.继承面向对象三大特征之一，  封装继承多态
 *   2.继承作用： 代码复用。最重要的是，有了继承才有了以后“方法覆盖”和“多态机制”
 *   3.继承语法：
 *      [修饰符列表]  class 类名 extends 父类{
 *          类体 = 属性 + 方法
 *      }
 *   4.java 语言当中继承只支持单继承，一个类不能同时继承很多类， 只能继承一个类。 c++ 支持很多个继承
 *   5. 关于继承中一些术语
 *      B类继承A类，其中：
 *          A类称为： 父类，基类，超类， superclass
 *          B类称为：子类，派生类，subclass
 *   6.在java语言当中子类继承父类都继承那些数据呢？
 *      - 私有的不支持继承
 *      - 构造方法都支持继承
 *      - 其他数据都可以被继承
 *   7.虽然java语言当中支持单继承，但是一个类可以间接继承其他类
 *      C extends B{
 *      }
 *      B extends A{
 *      }
 *      A extends T{
 *      }
 *      c 直接继承B类，但是C 类间接继承T A 类
 *    8. java 语言中假设 一个类没有显示的继承任何类，该类默认继承JAVASE 库当中提供的java.lang.Object类
 */
public class ExtendsTest {

    // 查找类型  ctrl + shift + t
    // 查找资源  ctrl + shift + r
    public static void main(String[] args) {
        ExtendsTest st = new ExtendsTest();
        String s = st.toString(); // 可以调用toString方法，ExtentsTest 类中从Object 类中继承过来的
    }
}
