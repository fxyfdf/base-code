package com.test.basic;
/*
	关于java语言中的整型数据：
		byte		1byte(8bit)  -128~127
		short		2byte
		int		4byte
		long		8byte
	关于浮点型：
		float  4个字节
		double 8个字节
	整数型有三种表示方式：
		十进制
		八进制  以0开始
		十六进制  以0x开始
	关于java中的布尔类型:

		1.boolean类型的数据只有两个值：true/false,没有1和0。
		2.boolean类型的数据主要用在逻辑运算和条件控制语句中。

*/
public class DataType {
    public static void main(String[] args){

        int i1 = 10; // 十进制
        int i2 = 010; //八进制
        int i3 = 0x10; // 十六进制
        int i4 = 100;// 将 int 类型100 字面值赋值给i4
        long i5 = 100; // 存在类型转换，但是自动转换
        long i6 = 100L; // 普通赋值
        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);
        System.out.println(i4);
        System.out.println(i5);
    }
}

class DataTypeTest02{

    public static void main(String[] args) {

        long l1 = 1000L;
        //将long类型转换成int 类型，不能自动类型转换
        int i1 = (int)l1; // 强制进行类型转换慎用

        System.out.println(l1);
    }

}

class DataTypeTest03{
    public static void main(String[] args) {

        double d1 = 1.2;

        //强制转换
        float f1 = (float)3.2;

        //自动赋值运算
        float f2 = 3.2F;

        System.out.println(d1);
        System.out.println(f1);
        System.out.println(f1);

    }
}

class  DataTypeTest04{

    public static void main(String[] args) {

        // Error: boolean 只能是true/false
        // boolean b1 = 1;

        boolean sex = false;

        if(sex){
            System.out.println("man");
        }else{
            System.out.println("woman");
        }
    }

}

// byte,short,char做混合运算的时候先各自转换成int在做运算。
class DataTypeTest05{

    public static void main(String[] args) {

        byte b1 = 10;
        short s1 = 20;

        int i1 = b1 + s1;

        System.out.println(i1); //30(int)

        //java程序分编译期和运行期
        //编译阶段只是知道b1+s1的结果是int类型。
        //int类型无法直接赋值给byte类型.
        //byte b2 = b1 + s1;

        //可以.
        byte b3 = 100;

    }

}


/*
	关于基本数据类型转换规则：
		1. 8种基本数据类型除boolean类型之外都可以相互转换.
		2. 小容量向大容量转换叫做自动类型转换：
				byte<short<int<long<float<double
				     char<
		3. byte,short,char做混合运算的时候，各自都先转换成int在做运算

		4.大容量向小容量转换是强制类型转换，需要加强制转换符，
		编译虽然通过，运行期可能损失精度。谨慎使用。

		5.如果整数没有超出byte,short,char的取值范围，可以直接将这个整数赋值给byte,short,char

		6.多种数据类型做混合运算，先转换成容量最大的那种再做运算。
*/

class DataTypeTest06 {

    public static void main(String[] args) {

        //出现错误，1000超出了byte的范围
        //byte a = 1000;

        //正确，因为20没有超出byte范围
        //所以赋值
        byte a = 20;

        //变量不能重名
        //short a =  1000;

        //正确，因为数值1000没有超出short类型的范围
        //所以赋值正确
        short b =  1000;

        //正确，因为默认就是int，并且没有超出int范围
        int c = 1000;

        //正确，可以自动转换
        long d = c;

        //错误，出现精度丢失问题，大类型-->>小类型会出现问题
        //int e = d;

        //将long强制转换成int类型
        //因为值1000，没有超出int范围，所以转换是正确的
        int e = (int)d;

        //因为java中的运算会会转成最大类型
        //而10和3默认为int,所以运算后的最大类型也是int
        //所以是正确的
        int f = 10/3;

        //声明10为long类型
        long g = 10;

        //出现错误，多个数值在运算过程中，会转换成容量最大的类型
        //以下示例最大的类型为double，而h为int，所以就会出现大类型（long）到小类型（int）
        //的转换，将会出现精度丢失问题
        //int h = g/3;

        //可以强制转换,因为运算结果没有超出int范围
        //int h = (int)g/3;

        //可以采用long类型来接收运算结果
        //long h = g/3;

        //出现精度损失问题，以下问题主要是优先级的问题
        //将g转换成int，然后又将int类型的g转换成byte,最后byte类型的g和3运算，那么
        //它的运算结果类型就是int，所以int赋值给byte就出现了精度损失问题
        //byte h = (byte)(int)g/3;

        //正确
        //byte h = (byte)(int)(g/3);

        //不能转换,还有因为优先级的问题
        //byte h = (byte)g/3;

        //可以转换，因为运算结果没有超出byte范围
        //byte h = (byte)(g/3);

        //可以转换，因为运算结果没有超出short范围
        short h = (short)(g/3);

        short i = 10;

        byte j = 5;

        //错误，short和byte运算，首先会转换成int再运算
        //所以运算结果为int，int赋值给short就会出现精度丢失问题
        //short k = i + j;

        //可以将运算结果强制转换成short
        //short k = (short)(i + j);

        //因为运算结果为int，所以可以采用int类型接收
        int k  = i + j;

        char l = 'a';
        System.out.println(l);

        //输出结果为97，也就是a的ascii值
        System.out.println((byte)l);

        int m = l + 100;
        //输出结构为197,取得a的ascii码值，让后与100进行相加运算
        System.out.println(m);

    }
}
