package 线程.java01;

/**
 * @ Author     ：CYD
 * @ Date       ：Created in 21:36 2020/12/15
 * @ Description：懒汉模式优化2
 * @ Modified By：
 */

public class new_lazy2 {
    static class Singleton4{
        private Singleton4(){

        }

        private static Singleton4 instance=null;

        public static Singleton4 getInstance(){
            if(instance==null) {
                synchronized (Singleton4.class) {
                    if(instance==null) {
                        instance = new Singleton4();
                    }
                }
            }
            return instance;
        }

    }

    static Singleton4 s1=null;
    static Singleton4 s2=null;

    public static void main(String[] args) throws InterruptedException {
        Thread t1 =new Thread(()->{
            s1= Singleton4.getInstance();
        },"t1");
        t1.start();

        Thread t2 =new Thread(()->{
            s2=Singleton4.getInstance();
        },"t2");
        t2.start();

        t1.join();
        t2.join();

        System.out.println(t1==t2);
    }
}
