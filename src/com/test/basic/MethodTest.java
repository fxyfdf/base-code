package com.test.basic;
/*
	 需求：

	 	计算10和20的和.

	 	计算50和100的和.
*/
class MethodTest{

    public static void main(String[] args){

        //计算10和20的和.
        int a = 10;
        int b = 20;
        int c = a + b;
        System.out.println(a + "+" + b + "=" + c);


        int i1 = 50;
        int i2 = 100;
        int i3 = i1 + i2;
        System.out.println(i1 + "+" + i2 + "=" + i3);

        //以上代码完成了两个求和的功能。
        //但是缺点：两段代码都是为了求和，功能相同，只是“数据”不同。
        //以上代码并没有得到重复的利用。
        //所以java引入了"方法".

    }

}
/*
  引入方法计算两个整数求和：

  什么是方法？
    方法是一段代码的片段，这个片段可以完成特定的功能

 */
class MethodTest02 {

    //入口
    public static void main(String[] args) {

        //在main方法中对sumInt方法进行调用,完成功能。
        //注意，加有static的方法，调用的时候必须采用“类名.”的方式调用
        MethodTest02.sumInt(10,20);
        MethodTest02.sumInt(50,100);

        sumInt(100,200);
    }

    //定义方法，完成两个数求和
    //注意： 目前所有的方法请定义成 public static
    public static void sumInt(int a,int b){
        int c=a+b;
        System.out.println(a + "+" + b + "=" +c);
    }
}

/*
	定义方法的语法：

		[方法的修饰符列表] 方法的返回值类型 方法名(方法的形式参数列表){
			java语句;
		}

		1.[方法的修饰符列表]是可选项。现在暂时先写成: public static
		2.方法的返回值类型，可以是java语言中的任何一种数据类型(基本数据类型和引用数据类型)
		3.如果该方法执行结束之后，并没有任何返回值，那么定义方法的时候，返回值类型写：void
		4.方法名只要是合法的标识符即可。
		5.方法的形式参数列表，可以有参数，也可以没有参数，如果有多个参数的话使用“逗号”隔开。


		public static void m1(){}
			public static 修饰符
			void 这个方法执行结束之后没有返回值
			m1就是方法名
			没有形式参数

		public static int m2(int a,boolean b){}
			public static 修饰符
			int	这个方法的返回值类型
			m2 方法名
			int a,boolean b 是形式参数列表.

		6.如果一个方法的返回值类型不是void,那么在方法体中必须使用return 语句来返回数据。
		return语句一旦执行，则方法结束。

*/