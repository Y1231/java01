package 线程;

/**
 * @ Author     ：CYD
 * @ Date       ：Created in 17:05 2020/12/5
 * @ Description：
 * @ Modified By：当调用interrupt 时，并不会直接终止线程，只会提示异常，要不要终止线程决定权在你手里
 */

public class 中断线程2 {
    public static void main(String[] args) throws InterruptedException {


        Thread t2 = new Thread(() -> {
     //       while (!Thread.currentThread().isInterrupted()) {
            while (!Thread.interrupted()) {
                /**
                 *两者区别：
                 * !Thread.currentThread().isInterrupted()
                 * 不清除中断标志
                 * flase true true
                 *
                 *
                 * !Thread.interrupted()
                 * 清除中断标志
                 * false true flase
                */


                //!Thread.interrupt()
                System.out.println("转账ing");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
//                    e.printStackTrace();
                    //加入break，终止
                    break;
                }
            }
            System.out.println("转账终止");

        });
        t2.start();
        Thread.sleep(2000);
        System.out.println("有内鬼，终止交易");

        //让t2终止
        t2.interrupt();
    }
}
