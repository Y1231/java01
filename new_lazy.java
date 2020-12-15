package 线程.java01;

/**
 * @ Author     ：CYD
 * @ Date       ：Created in 20:54 2020/12/15
 * @ Description：优化懒汉模式，变成线程安全
 * @ Modified By：
 */

public class new_lazy {
   static class Singleton3{
       private Singleton3(){

       }

       private static Singleton3 instance=null;

       public static synchronized Singleton3 getInstance(){
           if(instance==null){
               instance=new Singleton3();
           }
           return instance;
       }

   }

   static Singleton3 s1=null;
   static Singleton3 s2=null;

    public static void main(String[] args) throws InterruptedException {
        Thread t1 =new Thread(()->{
            s1=Singleton3.getInstance();
        },"t1");
        t1.start();

        Thread t2 =new Thread(()->{
            s2=Singleton3.getInstance();
        },"t2");
        t2.start();

        t1.join();
        t2.join();

        System.out.println(t1==t2);
    }
}
