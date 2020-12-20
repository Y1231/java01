package ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @ Author     ：CYD
 * @ Date       ：Created in 20:37 2020/12/17
 * @ Description：线程池
 * @ Modified By：
 *
 * 线程池优点：（必问面试）
 * 1.避免线程频繁创建和消耗所带来的性能开销
 * 2.线程池可以更快速的执行任务，当有任务时可以直接分配线程进行执行
 * 3.线程池有统一调度和管理机制，可以避免线程的争抢
 * 4.线程池提供更加丰富的功能，可以执行定时任务的线程池
 *
 *
 *单个线程池的优点：
 *
 *
 *
 */

public class ThreadPool01 {

    public static void main(String[] args) {
        //1.创建固定数量的线程池
        ExecutorService threadPool=Executors.newFixedThreadPool(10);

         for(int i=0;i<10;i++){

                     /* threadpool.submit(new Runnable(){
                          public void run(){
                              System.out.println("当前线程"+Thread.currentThread().getName());
                          }*/

             /*threadPool.submit(() -> {
                System.out.println("线程的名称：" + Thread.currentThread().getName());
                      });*/

             threadPool.execute(() -> {
                 System.out.println("线程的名称：" + Thread.currentThread().getName());
             });
                  }

    }

}
