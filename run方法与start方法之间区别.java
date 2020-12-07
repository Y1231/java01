package 线程;

/**
 * @ Author     ：CYD
 * @ Date       ：Created in 16:45 2020/12/5
 * @ Description：
 * @ Modified By：
 */

public class run方法与start方法之间区别 {

    static class MyThread extends Thread{
        @Override
        public void run() {
            System.out.println("我是线程1  "+Thread.currentThread().getName());
        }
    }
    public static void main(String[] args) {

        MyThread thread=new MyThread();
        thread.start();

        thread.run();
        /**
         *run相当于调用类的普通方法，并不是创建了新线程
         * start相当于创建新线程，并调用run方法
         *
         * 使用getname
         * run()     main
         * start()   Thread=0
         *
         *
         * run方法可以多次调用
         * start不能调用多次  (PCB已经存在)
         *
         *
         * 进入方法，run属于 自定义实现类
         *   start属于Thread
         */

    }
}
