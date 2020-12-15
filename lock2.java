package 线程.java01;

/**
 * @ Author     ：CYD
 * @ Date       ：Created in 14:59 2020/12/13
 * @ Description：
 * @ Modified By：
 */

import java.util.concurrent.TimeUnit;

/**
 *死锁问题：线程1，线程2都拥有一把锁，都想要对方的锁
 * jconsole
 * jvisualvm
*/

/**
 *线程状态：
 * NEW (就绪状态，还没有调用start）
 * RUNNNABLE   ->start
 * TIMED_WAITING（调用sleep）
 * BLOCKED
 * WAITING
 *
 *
*/



public class lock2 {
    public static void main(String[] args) throws InterruptedException {
        Object lock1=new Object();
        Object lock2=new Object();


        Thread t1 =new Thread(()->{
            synchronized (lock1){
                System.out.println(Thread.currentThread().getName()+"获取线程1");
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                //要写在锁1里面
                synchronized (lock2){
                    System.out.println(Thread.currentThread().getName()+"已获取线程2");
                }
            }

        },"t1");
        t1.start();



        Thread t2 =new Thread(()->{
            synchronized (lock2){
                System.out.println(Thread.currentThread().getName()+"获取线程2");
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (lock1){
                    System.out.println(Thread.currentThread().getName()+"已获取线程1");
                }
            }

        },"t2");
        t2.start();


    }

}
