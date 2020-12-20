package ThreadPool;

/**
 * @ Author     ：CYD
 * @ Date       ：Created in 12:16 2020/12/20
 * @ Description：
 * @ Modified By：
 */
import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
public class ThreadPool04 {



        public static void main(String[] args) {
            // 创建了 10 个可以执行延迟任务的线程池
            ScheduledExecutorService scheduledExecutorService =
                    Executors.newScheduledThreadPool(10);

            // 添加任务
            for (int i = 0; i < 10; i++) {
                scheduledExecutorService.schedule(() -> {
                    System.out.println("date" + new Date());
                }, 3, TimeUnit.SECONDS);
            }

        }
    }

