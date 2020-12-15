package 线程.java01;

/**
 * @ Author     ：CYD
 * @ Date       ：Created in 15:36 2020/12/13
 * @ Description：
 * @ Modified By：
 */

/**
 * review:
 *
 *内存可见性问题：
 *
 * 两个线程，一个线程修改，另一个线程读取，因为读取频率较高，cpu优化存储到寄存器中，线程前者的修改对于后者是不可见的
 * volatile->进制优化，解决内存可见性问题，只能解决一个线程修改，多个线程读取的问题
 * synchronized ,lock解决任意的多线程问题
 *
 *
 * 线程通讯问题：
 * wait/notify/notifyAll  ->synchronized            wait() / wait(2000)    无限/上限
 * condition await/signal/signalAll -> lock
 *但都不能唤醒特定线程
 * LockSupport park/unpark
 *
 *
*/


/**
 *竞态条件问题：多线程在执行的时候，它的执行结果不确定
 * wait:
 * 1.释放锁     ->原子性
 * 2.等待通知   ->原子性   so  wait 不存在 竞态条件问题
 * 3.被唤醒，试图获取锁
 *
 *
 *
 * 单例模式->设计模式
 *
 *
 *
*/


public class lock3 {


}
