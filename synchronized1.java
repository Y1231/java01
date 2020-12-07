package 线程;

import java.util.Scanner;

/**
 * @ Author     ：CYD
 * @ Date       ：Created in 21:17 2020/12/7
 * @ Description：
 * @ Modified By：
 */

public class synchronized1 {
    public static void main(String[] args) throws InterruptedException {
        Object object=new Object();
        Object object2=new Object();


        Thread t1 =new Thread(()->{
            synchronized (object) {
                System.out.println("输入字符");
                Scanner scanner = new Scanner(System.in);
                scanner.next();
            }
        });
        t1.start();
        t1.join();

        Thread t2 =new Thread(()->{
            synchronized (object){
                //不能是object2,要不然不是同1个锁
                while(true){
                    System.out.println("我是线程2");
                }
            }
        });
        t2.start();
        t2.join();

    }
}
