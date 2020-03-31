package com.test.basic;

import javax.print.DocFlavor;

public class ControlFlowTest {

}

/*
	关于条件控制语句,流程控制语句if...else.

		1.语法：

			第一种结构：
				if(boolean表达式){
					java语句;
				}

			第二种结构：
				if(boolean表达式){
					java语句;
				}else{
					java语句;
				}

			第三种结构：
				if(boolean表达式){
					java语句;
				}else if(boolean表达式){
					java语句;
				}else if(boolean表达式){
					java语句;
				}else if(boolean表达式){
					java语句;
				}

			第四种结构：
				if(boolean表达式){
					java语句;
				}else if(boolean表达式){
					java语句;
				}else if(boolean表达式){
					java语句;
				}else if(boolean表达式){
					java语句;
				}else{
					java语句;
				}

		注意：在if语句中只要有一个分支执行，则整个if语句结束。
			上面的结构2,4,可以保证一定会有一个分支语句执行，因为他们都有else语句.
*/
class IfTest01 {

    public static void main(String[] args) {

        boolean isSuccess = false;

        if (isSuccess) {
            System.out.println("登录成功");
        } else {
            System.out.println("登录失败");
        }


        //分支语句中，如果只有一条java语句，大括号可以省略
        //不推荐使用，别人这样写能看懂就行。
        if (isSuccess)
            System.out.println("登录成功");
        else
            System.out.println("登录失败");


    }
}

/*
	需求：
		1.系统给定人的年龄.[1-100]

		2.系统给定程序，通过人的年龄，来判断这个人处于生命的哪个阶段：
			[1-5] 幼儿
			[6-18] 少年
			[19-35] 青年
			[36-55] 中年
			[56-100] 老年
*/
class ifTest02 {

    public static void main(String[] args) {

        // 假定年龄合法

        int age = 83;
        String grade = "幼儿";

        if (age >= 1 && age < 5) {

            grade = "幼儿";

        } else if (age < 18) {

            grade = "少年";

        } else if (age < 35) {

            grade = "青年";

        } else if (age < 55) {

            grade = "中年";

        } else {

            grade = "老年";

        }

        System.out.println(grade);


    }
}


/*
	关于switch语句:

		1.语法：
			switch(int类型){

			case int类型:
				java语句;
				java语句;
				break;

			case int类型:
				java语句;
				java语句;
				break;

			case int类型:
				java语句;
				java语句;
				break;

			defalut:
				java语句;
			}

		注意：break;语句可以没有.
				defalut语句也可以没有

			break;语句如果没有，则发生case穿透现象。

			switch后面的括号中可以填写byte/short/char类型，因为可以自动转换.
*/
class SwitchTest01 {

    public static void main(String[] args) {

		/*
		long a = 1000L;

		switch(a){ //Error
		case 100:
			System.out.println("Test");
		}
		*/

		/*
		char c = 'F';

		switch(c){

		case 'A':
			System.out.println("优秀");
			break;

		case 'B':
			System.out.println("良好");
			break;

		case 'C':
			System.out.println("及格");
			break;

		default:
			System.out.println("不及格");
		}
		*/


        //case穿透

        char c = 'A';

        switch (c) {

            case 'A':
                System.out.println("优秀");

            case 'B':
                System.out.println("良好");

            case 'C':
                System.out.println("及格");
                break;

            default:
                System.out.println("不及格");
        }


        //case可以合并
/*
        char c = 'D';

        switch(c){

            case 'A':case 'B':case 'C':
                System.out.println("优秀");
                break;
            case 'D':
                System.out.println("良好");
        }
*/
    }

}

/*
	需求：
		1.系统给定学生的成绩,成绩可以带小数。[0-100]
		2.编写程序根据学生的程序判断学生成绩等级：
			[90-100]  优秀
			[70-90)	良好
			[60-70)	及格
			[0-60)	不及格

		以上程序只允许使用switch
*/
class SwitchTest02 {
    public static void main(String[] args) {
        double score = 9.5;
        int grade = ((int) score) / 10;
        String grade2;
        switch (grade) {

            case 9:
            case 10:
                grade2 = "A";
                break;

            case 7:
            case 8:
                grade2 = "B";
                break;

            case 6:
                grade2 = "C";
                break;

            default:
                grade2 = "D";


        }
        System.out.println(grade2 + ":" + score);

    }
}

/*
	for循环：
		语法：
			for(表达式1;表达式2;表达式3){
				java语句;
			}

		表达式1是初始化表达式，最先执行，只执行一次。
		表达式2必须是boolean类型的表达式。

		for循环开始执行，先执行表达式1，并只执行一次。
		进而判断表达式2的结果，如果是true，则执行java语句。
		再执行表达式3，然后再判断表达式2的结果，直到表达式2
		的结果是false，则for循环结束。
*/
class ForTest01 {

    public static void main(String[] args) {

        //死循环
		/*
		for(;;){
			System.out.println("Test");
		}
		*/

        for (int i = 0; i < 10; i++) {
            System.out.println("i=" + i); //0 1 2 3 4 ...9
        }


        int k;

        for (k = 0; k < 10; k += 2) {
            System.out.println("k=" + k); //0 2 4 6 8
        }


        for (int m = 10; m > 0; m--) {
            System.out.println("m=" + m); //10..2 1
        }

    }
}


/*
	关于for循环的嵌套

	所有的控制语句都可以嵌套在一起使用。
*/
class ForTest02 {

    public static void main(String[] args) {

        for (int i = 5; i > 0; i--) {

            for (int j = 0; j < i; j++) {
                System.out.print(j + " ");
            }

            //换行
            //System.out.println();
            System.out.print("\n");

        }
    }
}


/*
	使用嵌套的for循环打印九九乘法表

		1*1=1
		2*1=2 2*2=4
		.......
		9*1=9...............9*9=81

*/
class ForTest03{

    public static void main(String[] args){

        for(int i=1;i<=9;i++){

            for(int j=1;j<=i;j++){
                System.out.print(i + "*"+ j +"=" + (i*j) + " ");
            }

            //一行结束换行
            System.out.println();
        }

    }
}


/*
	计算1-100之间所有奇数的求和.
*/
class ForTest04{

    public static void main(String[] args){

		/*
		int sum = 0;
		for(int i=1;i<=100;i++){
			if(i%2 != 0){
				//奇数
				//追加
				sum += i;
			}
		}

		System.out.println(sum);
		*/
        //加入人为因素
        //效率高.
        int sum = 0;

        for(int i=1;i<=99;i+=2){
            sum += i;
        }
        System.out.println(sum);

    }
}


/*
	关于while循环
		语法：
			while(boolean表达式){
				java语句;
			}

		while循环的次数是：0-N次
*/
class WhileTest01{

    public static void main(String[] args){

        //死循环
		/*
		while(true){
			System.out.println("Test");
		}
		*/

		/*
		int i = 0;
		while(i<10){
			i++;
			System.out.println(i); //1 ... 9 10
		}
		*/


        int i = 0;
        while(i<10){
            System.out.println(i); //0... 9
            i++;
        }

    }
}


/*
	do..while..

		语法：
			do{
				java语句;
			}while(boolean表达式);

		该循环执行的次数是：1-N

*/
class DoWhileTest01{

    public static void main(String[] args){

        int i = 0;

        do{

            //i++;
            System.out.println(i);
            i++;

        }while(i<10);


    }
}


/*
	break;语句:
		1.可以用在switch语句中，结束分支语句.
		2.break;语句可以出现在循环当中，默认情况下结束离它最近的一个循环.
*/
class BreakTest01{

    public static void main(String[] args){

        for(int i=0;i<10;i++){
            System.out.println(i);
            if(i==5){
                break; //只是结束离它最近的一个循环.
                //return; //结束的是main方法.
            }
        }

        System.out.println("Hello World!");

    }
}


/*
	深入break;
*/
class BreakTest02{

    public static void main(String[] args){

		/*
		for(int i=5;i>0;i--){

			for(int j=0;j<i;j++){
				if(j==2){
					break;
				}
				System.out.print(j);
			}

			System.out.println();
		}
		*/



        //通过以下程序得知break可以指定结束某个循环.
        outerFor:for(int i=5;i>0;i--){

            for(int j=0;j<i;j++){
                if(j==2){
                    break outerFor;
                }
                System.out.print(j);
            }

            System.out.println();
        }


    }
}


/*
	continue;
*/
class ContinueTest01{

    public static void main(String[] args){

        for(int i=0;i<10;i++){

            if(i==5){
                //continue语句可以用来结束当前本一次循环，直接进入下一次循环继续执行。
                continue;
            }

            System.out.println(i);
        }


    }
}