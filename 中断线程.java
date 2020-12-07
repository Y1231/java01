package 线程;

/**
 * @ Author     ：CYD
 * @ Date       ：Created in 16:57 2020/12/5
 * @ Description：
 * @ Modified By：
 */

public class 中断线程 {
    private static boolean flag=false;

    public static void main(String[] args) throws InterruptedException {
        //1.标识符

        Thread t1 =new Thread(()->{
            while(!flag){
                System.out.println("转账ing");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("转账结束");
        });
        t1.start();

        Thread.sleep(2000);
        System.out.println("有内鬼，终止交易");
        flag=true;
    }
}
