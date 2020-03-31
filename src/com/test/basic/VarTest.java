package com.test.basic;


/*
	关于java语言中的变量

	1.java中如何定义变量，语法：
			数据类型 变量名;

	2.如何给变量赋值，语法：
			变量名 = 值;

	3.变量的本质是什么？
		变量就是内存中的一块空间，这块空间有“类型”，“名字”，“值”

*/
public class VarTest {

    public static void main(String[] args){

        //int是一种数据类型，是整型。
        int a; //在内存中开辟一块空间，这块空间的类型是整型，给这块空间起名叫a

        //赋值
        a = 100;

        //通过变量名去访问那块内存。
        System.out.println(a);

        //重复访问
        System.out.println(a);

        System.out.println(a);
    }
}


/*
	深入变量
*/
class VarTest01{

    public static void main(String[] args){

        //申请一块int类型的空间，起名i，并赋值10
        int i = 10;

        System.out.println(i);

        //重新赋值
        i = 100;

        System.out.println(i);

        //变量可以重新赋值，但不能重复声明
        //在同一个域中，变量名不能重复。
        //int i = 200; //Error


        //java语言中的变量必须先声明，再赋值，才能使用。
        int a;
        a = 10;
        System.out.println(a);


        //声明三个变量i1,i2,i3，类型都是int类型，i1,i2两个变量没有赋值，只有i3变量赋值。
        int i1,i2,i3 = 456;

        //Error
        //System.out.println(i1); //i1没有赋值不能访问。

        System.out.println(i3);

    }


    public static void m1(){
        int i = 10; //不在同一个区域中可以声明。
    }
}



/*
	关于变量的作用域：有效范围。作用范围。

	出了大括号就不认识了。
*/
class VarTest03{

    //类体
    //声明变量
    int m = 100;

    public void m1(){
        int m = 200;
        System.out.println(m); //200 (就近原则.)
    }

    public static void m(){

        int k = 10;
    }


    public static void main(String[] args){

        int i = 10;
        System.out.println(i);

        //Error
        //无法访问m方法中的k变量.
        //System.out.println(k);

        //for循环
		/*
		for(int j=0;j<10;j++){
			System.out.println(j);
		}

		//Error,j变量是属于for循环的。
		System.out.println(j);
		*/

        //j的作用域在整个main方法中。
        int j;

        for(j=0;j<10;j++){
            System.out.println(j);
        }

        System.out.println(j);



    }
}


/*
	变量根据出现的位置可以分为两种：
		1.局部变量,在方法体中声明的变量叫做局部变量。包括形式参数列表。
		2.成员变量,在类体中，方法之外声明的变量统称成员变量。
*/
class VarTest04{

    //成员变量
    int i = 10;

    //成员变量
    int m;

    public void m1(int m){ //m也是局部变量.
        int k = 10; //局部变量
    }


    public void m2(){
        System.out.println(m); //0
    }


    public static void main(String[] args){

        VarTest04 vt = new VarTest04();
        vt.m2();

    }
}