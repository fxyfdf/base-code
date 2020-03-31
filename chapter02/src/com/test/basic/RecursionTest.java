package com.test.basic;

/*
  关于方法的递归调用
    1.方法的递归调用就是方法自身调用自身
    2.以下程序因为没有结束条件，所以一直压栈
      所以递归必须要有结束条件
 */
public class RecursionTest {
    // 入口
    public static void main(String[] args) {
        m1();
    }
    public static void m1(){
        m1(); //java.lang.StackOverflowError
    }
}


/*
  不使用递归，计算1-N的求和
 */
class RescursionTest02{

    public static void main(String[] args) {

        int n=5;

        //调用该方法完成1-N
        int retValue = method1(n);

        System.out.println(retValue);
    }

    //该方法完成1-N的求和
    public static int method1(int n) {
        int sum = 0;

        for(int i=0;i<=n;i++){
            sum +=i;
        }

        return sum;
    }
}


/*
  使用递归，计算1-N 的求和
 */
class RecursionTest03{

    public static void main(String[] args) {

        int n=10;

        int retValue = method1(n);

        System.out.println(retValue);
    }

    //1+2+3 ---+N
    public static int method1(int n){

        if(n==1){
            return 1;
        }else{
            return n+method1(n-1);
        }
    }
}

/*
  递归练习：

    计算 N 的阶乘

    两种方式： 使用递归和不使用递归

 */
class RecursionTest04{

    public static void main(String[] args){

        System.out.println(method1(5));
        System.out.println(method2(5));

    }

    public static int method1(int n) {
        // 不用递归

        int result = 1;

        for(int i=1;i<=n;i++){
            result *=i;
        }

        return result;
    }

    public static int method2(int n){

        int result = 1;

        if(n==1){
            return 1;
        }else {
            return n*method2(n-1);
        }
    }
}





