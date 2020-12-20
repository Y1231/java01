package ThreadPool.java01;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @ Author     ：CYD
 * @ Date       ：Created in 16:12 2020/12/20
 * @ Description：线程池状态
 * @ Modified By：
 *
 *
 * 线程池终止：
 * 1.shutdown 继续将任务队列的任务执行完成
 * 2.shutdowmnow 不会执行
 */

public class ThreadPool5 {
    public static void main(String[] args) throws InterruptedException {

        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1,
                1000, TimeUnit.SECONDS, new LinkedBlockingQueue<>(5));

        for (int i = 0; i < 10; i++) {
            final int index = i;
            threadPoolExecutor.submit(() -> {
                System.out.println("我是任务" + index + ",线程名称" + Thread.currentThread().getName());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }

        Thread.sleep(700);
        threadPoolExecutor.shutdown();
    }
}