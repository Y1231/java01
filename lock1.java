package 线程;

/**
 * @ Author     ：CYD
 * @ Date       ：Created in 19:44 2020/12/7
 * @ Description：
 *
 *    线程安全性：
 *    如果有两个线程1和线程2，目的都让count++，count=0
 *    线程1 count=1
 *    线程2
 *
 *
 * @ Modified By：
 */

import sun.plugin.ClassLoaderInfo;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 *1.jvm自带
 * synchronized (底层jvm，自动加锁解锁)
 * 1.修饰静态方法  2.修饰普通方法  3.修饰代码块
 *
 *对象中有对象头，里面有隐藏属性，synchronized 设置标志，表示被加锁
 *对于synchronized通过mutex(互斥锁)实现
 *
 * 在jdk1.6之前性能非常低，在之后做了优化：
 * 锁属性是无锁，刚开始无锁状态下对象头，里面有隐藏属性，此属性用来记录获取它的锁线程的线程ID，它会将此id记录，如果新进来的线程id
 * 不相等，那个新进来的就会自旋等待获取锁，若等待50次，锁还在被用，锁就会升级，从轻量级成为重量级
 *
 *   加锁
 *   内存中读入变量
 *   修改变量
 *   将变量放入内存
 *   释放锁
 *
 *锁的基本特性：互斥性，同一时间，只有一个线程能获得锁
 *
 *
 * 2.手动锁
 *lock
 * 活动性更高,lock锁粒度更小
*/



public class lock1 {

    private static int count;

    static class Counter{


        static Lock lock=new ReentrantLock();
        public static void increment(){

            /* synchronized (Counter.class){
                              count++;
                          }*/

          // error: Lock lock=new ReentrantLock();放这里的话，会new 两个锁，不对劲

            lock.lock();//必须放try外面，try可能不成功

            try{

                count++;
        }finally {
                lock.unlock();
            }
            }
    }


    private static final int maxSize=1_0000;

    public static void main(String[] args) throws InterruptedException {

        Thread t1 =new Thread(()->{
            for(int i=0;i<maxSize;i++){
                Counter.increment();
            }
        });
        t1.start();
        t1.join();

        Thread t2 =new Thread(()->{
            for(int i=0;i<maxSize;i++){
                Counter.increment();
            }
        });
        t2.start();
        t2.join();
        System.out.println(count);
    }
}
