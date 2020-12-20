package ThreadPool.java01;

import java.util.concurrent.*;

/**
 * @ Author     ：CYD
 * @ Date       ：Created in 15:08 2020/12/20
 * @ Description：拒绝策略
 * @ Modified By：
 */

public class ThreadPool4 {
    public static void main(String[] args) {


    ThreadPoolExecutor threadPoolExecutor=new ThreadPoolExecutor(1, 1,
            1000, TimeUnit.SECONDS, new LinkedBlockingQueue<>(5)
            /*,new RejectedExecutionHandler() {
        @Override
        public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
            System.out.println("自定义拒绝策略");
        }
    }*/);

    for(int i=0;i<7;i++){
        final int index=i;
        threadPoolExecutor.submit(()->{
            System.out.println("我是任务"+index+",线程名称"+Thread.currentThread().getName());
        });
    }

    new ThreadPoolExecutor.AbortPolicy();

}
}
