package ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @ Author     ：CYD
 * @ Date       ：Created in 12:11 2020/12/20
 * @ Description：
 * @ Modified By：
 */

public class ThreadPool03 {
    //3.创建单个线程数的线程池
    public static void main(String[] args) {


        ExecutorService executorService = Executors.newSingleThreadExecutor();

        for (int i = 0; i < 10; i++) {
            executorService.submit(() -> {
                System.out.println("线程名:" + Thread.currentThread().getName());
            });
        }
    }
}