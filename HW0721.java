package BasicWork.HW200708;
import java.util.Scanner;
/**
 * @ Author     ：CYD
 * @ Date       ：Created in 10:18 2020/7/22
 * @ Description：
 * @ Modified By：
 * @Version: $
 */

public class HW0721 {
    //1.求最大值方法的重载

    //在同一个类中定义多个方法：要求不仅可以求两个整数的最大值，还可以求两个小数的最大值，
    // 以及两个小数和一个整数的大小关系

    public static int func1(int x, int y) {
        int max;
        if (x > y) {
            max = x;
        } else {
            max = y;
        }
        return max;
    }

    public static double func2(double x, double y) {
        double max;
        if (x > y) {
            max = x;
        } else {
            max = y;
        }
        return max;
    }

    public static double func3(int a, int b, double c) {
        double max3;
        max3 = (a > b ? a : b) > c ? (a > b ? a : b) : c;
        return max3;
    }

    public static void main1(String[] args) {
        int a = 3;
        int b = 13;
        double c = 3.4;
        double d = 13.4;
        System.out.println(func1(a, b));
        System.out.println(func2(c, d));
        System.out.println(func3(a, b, c));

    }

    //2.求和的重载
//在同一个类中,分别定义求两个整数的方法 和 三个小数之和的方法。 并执行代码，求出结果
    public static int fun1(int x, int y) {
        int c = 0;
        c = x + y;
        return c;
    }

    public static double fun2(double x, double y, double z) {
        double c = 0;
        c = x + y + z;
        return c;
    }

    public static void main2(String[] args) {
        int a = 1;
        int b = 2;
        double c = 1.0;
        double e = 2.0;
        double f = 3.0;
        System.out.println(fun1(a, b));
        System.out.println(fun2(c, e, f));

    }

    //3.青蛙跳台阶问题
//f(n)=f(n-1)+f(n-2);
    //递归思想
    public static int f(int n) {
        if (n != 1) {
            if (n != 2) {
                return f(n - 1) + f(n - 2);
            } else
                return 2;
        } else
            return 1;
    }

    public static void main3(String[] args) {
        System.out.println("请输入台阶数：");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(f(n));
    }


    //4.汉诺塔问题（递归）
    public static void move(int n,char a,char b,char c){
        if(n==1){ //当n只有1个的时候直接从a移动到c
            System.out.println(a+"-->"+c);
        }else{
            move(n-1,a,c,b);
            System.out.println(a+"-->"+c);
            move(n-1,b,a,c);//第n-1个移动过来之后b变开始盘，b通过a移动到c
        }
    }


    public static void main4(String args[]){
            System.out.println("请输入要移动的块数：");
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            move(n,'a','b','c');
        }
//5.写一个递归方法，输入一个非负整数，返回组成它的数字之和
public static int func(int n){
        if(n<10){
            return n;
        }else{
            return n%10+func(n/10);
        }
}

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("请输入一个正整数:");
        int n=scan.nextInt();
        System.out.println(func(n));
    }
}