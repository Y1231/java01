package 线程;

/**
 * @ Author     ：CYD
 * @ Date       ：Created in 15:10 2020/12/5
 * @ Description：
 * @ Modified By：实际main也是一个线程
 */

public class 线程创建方式4个 {
    //创建内部类，重写Thraed接口
    static class MyThread extends Thread{
        @Override
        public void run() {
            System.out.println("我是线程1");
        }
    }

    //通过实现runable接口，run
    static class MyThread2 implements Runnable{
        @Override
        public void run() {
            System.out.println("我是线程2");
        }
    }



    public static void main(String[] args) {
        //1
        MyThread myThread1=new MyThread();
        myThread1.start();


        //2
        Thread  thread2=new Thread(new MyThread2());
        thread2.start();




        //3
        Thread  thread3=new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("我是线程3");
            }
        });
        thread3.start();



        //4使用landom表达式
        Thread thread4=new Thread(()->{
            System.out.println("我是线程4");
        });
        thread4.start();

    }


}
