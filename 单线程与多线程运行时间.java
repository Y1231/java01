package 线程;

/**
 * @ Author     ：CYD
 * @ Date       ：Created in 15:34 2020/12/5
 * @ Description：多线程适用于任务量大的
 * @ Modified By：
 */

public class 单线程与多线程运行时间 {

    private static  final long count=10_0000_0000;
    //private static  final long int=10_0000_0000;
  /**
   * 当任务比较复杂，执行时间比较久，多线程优势最为明显
  */



    public static void main(String[] args) throws InterruptedException {
        onethread();
        twothread();
    }

    private static void twothread() throws InterruptedException {

        //记录开始时间
        long stime= System.currentTimeMillis();

        Thread t1=new Thread(()->{
            int a=0;
            for(int i=0;i<count;i++){
                a++;
            }
        });
        t1.start();
        Thread t2=new Thread(()->{
            int b=0;
            for(int i=0;i<count;i++){
                b++;
            }
        });
        t2.start();




        //要等线程运行结束
        t1.join();
        t2.join();

        /**
         * 串行  并行
         *
         *  t1.start();
         *  t1.join();
         *  t2.start();
         *  t2.join();
         *
         *
         *
        */


        long etime= System.currentTimeMillis();
        System.out.println("多线程"+(etime-stime)+"毫秒");
    }

    private static void onethread() {
        //记录开始时间
        long stime= System.currentTimeMillis();
        int a=0;
        for(int i=0;i<count;i++){
            a++;
        }
        int b=0;
        for(int i=0;i<count;i++){
            b++;
        }
        long etime= System.currentTimeMillis();
        System.out.println("单线程"+(etime-stime)+"毫秒");
    }
}
