package ThreadPool;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/**
 * @ Author     ：CYD
 * @ Date       ：Created in 12:19 2020/12/20
 * @ Description：
 * @ Modified By：线程池的执行逻辑：
 * 等任务超过核心线程数时，新来的任务会存储在队列
 * 当队列已经存储满，增加零时工的数量，一直扩展到最大线程数
 * 当最大线程数已满，任务队列已满，执行线程池的拒绝策略（5种）
 *
 */

public class ThreadPool05 {

        public static void main(String[] args) {

            // 线程池的创建
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(10,
                    15,
                    100,
                    TimeUnit.SECONDS,
                    new LinkedBlockingQueue<>(10));

            for (int i = 0; i < 21; i++) {
                threadPoolExecutor.submit(() -> {
                    System.out.println("线程名称：" + Thread.currentThread().getName());
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                });
            }


        }
    }

