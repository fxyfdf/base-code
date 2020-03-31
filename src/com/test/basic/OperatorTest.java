package com.test.basic;

/*
	关于算术运算符
		+	求和
		-	相减
		*	乘积
		/	相除
		++	自加1
		-- 自减1
		%  取余、求模

*/
public class OperatorTest {

    public static void main(String[] args) {

        int a = 12;
        int b = 3;

        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);

        //关于++
        int k = 10;
        System.out.println("k="+k);
        k ++;
        System.out.println("k="+k);

        //++ 出现在后面
        int m = 10;
        int e = m++; //++ 如果出现在变量的后面，先赋值后自加1
        System.out.println("e="+e);
        System.out.println("m="+m);

        // ++ 出现在变量的前面
        int f = 10;
        ++f;
        System.out.println("f="+f);

    }
}

/*
	关系运算符
		>   大于
		>=	 大于等于
		<   小于
		<=  小于等于
		==  判断是否相等(基本数据类型)
		!=  不等于

		关系运算符的运算结果一定是boolean类型.
*/
class OperatorTest02{
    public static void main(String[] args) {
        int a = 10;
        int b = 10;

        // 判断两个基本数据类型是否相等，必须使用"==","=" 是赋值运算
        boolean c = (a==b); //不清楚运算符优先级就加括号

        System.out.println(a>b);
        System.out.println(a>=b);
        System.out.println(a<b);
        System.out.println(a<=b);
        System.out.println(a==b);
        System.out.println(a!=b);

    }
}

/*
	布尔运算符

		&  逻辑与	两边都是true，结果是true
		|	逻辑或	一边是true,结果就是true
		!	逻辑非	取反  !true --> false
		^	逻辑异或		两边只要是不一致就是true

		&&	短路与	用法和 & 一样。
		|| 短路或	用法和 | 一样

	布尔运算符两边的算子必须是布尔类型，整个表达式的运算结果也是一个布尔类型。
	例如： 5>10 | 6>5	--> true
*/
class OperatorTest03{

    public static void main(String[] args){

        System.out.println(5>3 & 5>4); //true
        System.out.println(5>3 & 5>6); //false  逻辑与只要有一个是false，结果就是false

        System.out.println(5>3 | 5>10); //true

        System.out.println(5>11 | 5>10); //false

        System.out.println(!false); //true


        System.out.println(true^false); //true
        System.out.println(false^true); // true
        System.out.println(true^true); //false
        System.out.println(false^false); //false


        //关于短路与
		/*
		int a = 10;
		int b = 10;

		System.out.println(a < b & a++ >= b);

		System.out.println(a); //11
		*/


        int a = 10;
        int b = 10;

        //短路：后边那个表达式不执行.
        //什么时候发生短路与？第一个算子结果是false的时候。
        //什么时候发生短路或？第一个算子结果是true的时候。
        System.out.println(a < b && a++ >= b);

        System.out.println(a); //10
    }
}

/*
	关于赋值运算符

		基本的赋值运算符
			=

		扩展的赋值运算符

			+=		追加
			-=
			*=
			/=
			%=

		+= 例子：
			int i = 10;
			i += 10; 等同于 i = i + 10;

*/
class OperatorTest04{

    public static void main(String[] args){

        //基本的赋值运算符
        int a = 10;

        //追加
        a += 10; //a = a+10;
        System.out.println(a); //20

        //a==20
        a -= 5;
        System.out.println(a); //15

        //a==15
        a *= 3;
        System.out.println(a); //45

        //a==45
        a /= 15; // a = a/15;
        System.out.println(a); //3

        //a==3
        a %= 2; //a = a%2;
        System.out.println(a); //1

        //基本赋值运算符和扩展赋值运算符的区别
        byte i = 10;

        //编译无法通过。运算结果是int类型，前边的变量是byte类型.
        //i = i + 10;

        //语法：扩展赋值运算符不改变运算结果类型。可能损失精度。
        i += 10;

        //虽然编译通过，精度损失严重。
        i += 1000;
    }
}



/*
	关于字符串连接运算符

		+ 运算符可以:

			1.做加法运算(+两边只要都是数字类型，一定是加法运算)

			2.字符串连接(+两边任意一端只要是字符串类型，则一定是字符串连接)
*/
class OperatorTest05{

    public static void main(String[] args){

        //字符串连接
        System.out.println("PI=" + 3.14);  //运算结果是字符串类型

        int a = 10;
        int b = 12;

        System.out.println("a+b=" + (a+b)); //"a+b=22"

        System.out.println("a+b=" + a + b); //"a+b=1012"


        System.out.println(a + "+" + b + "=" + (a+b)); //"10+12=22"

    }
}


/*
	条件运算符(三目运算符)
		?:

		语法：
			boolean表达式?表达式1:表达式2

			boolean表达式的结果是true,则整个表达式的结果就是表达式1的结果，相反则是表达式2的结果。

*/
class OperatorTest06{

    public static void main(String[] args){

        //这个不是java语句.
        //10; //Error

        int i = 10; //可以


        //判断以下程序编译可否通过?
        boolean sex = false;

        //不是语句
        //sex?'男':'女';

        char c = (sex?'男':'女');

        System.out.println(c);


        boolean isSuccess = true;

        //类型不兼容
        //char c1 = isSuccess?'S':"失败";

		/*
		System.out.println('a');
		System.out.println("abc");
		*/

        System.out.println(isSuccess?'S':"失败");
    }
}