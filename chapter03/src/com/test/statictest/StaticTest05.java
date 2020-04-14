package com.test.statictest;

/*
	关于代码的顺序
*/
public class StaticTest05{
	
	//编译通过
	static int i = 100;
	
	static{
		System.out.println(i);
	}
	
	
	
	//非法向前引用
	/*
	static{
		System.out.println(i);
	}
	
	static int i = 100;
	*/
	
}

/*

	类{
		
		//可以通过“类名.”，也可以通过“引用.”，即使使用“引用.”底层也是“类名.”
		//1.静态变量
		//2.静态方法
		
		//必须对象存在才可以访问，采用“引用.”
		//3.成员变量
		//4.成员方法
		
		//创建对象,给成员变量赋值
		//5.构造方法
		
		//类加载时只执行一次。
		//6.静态语句块
		
		//构造方法没调用之前执行一次。
		//7.实例语句块
		
		//用在成员方法和构造方法中。
		//8.this
	}
	
	空指针异常：空引用访问成员
	
*/