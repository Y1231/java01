package ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @ Author     ：CYD
 * @ Date       ：Created in 12:02 2020/12/20
 * @ Description：
 * @ Modified By：
 */

public class ThreadPool02 {
    //创建带缓存的线程池
    //根据任务创建线程数量，使用很危险
    public static void main(String[] args) {
        ExecutorService executorService= Executors.newCachedThreadPool();
        for(int i=0;i<16;i++){
            executorService.submit(()->{
                System.out.println("线程名:"+Thread.currentThread().getName());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }
    }
}
