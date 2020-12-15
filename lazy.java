package 线程.java01;

/**
 * @ Author     ：CYD
 * @ Date       ：Created in 19:40 2020/12/15
 * @ Description：懒汉模式
 * @ Modified By：真实使用时才会创建资源，如果没人调用就可以省略创建的对象的步骤
 *
 * 1.从内存中读取到变量
 * 2.对比instance和null
 *
 * 线程不安全
 */

 class Singleton2{
    private Singleton2(){
    }

    private static Singleton2 instance=null;

    //3.提供统一对象
    public  static Singleton2 getInstance(){
        if(instance==null){
            instance=new Singleton2();
        }
        return instance;
    }
}


public class lazy {
    public static void main(String[] args) {

        Singleton2 s1=Singleton2.getInstance();
        Singleton2 s2=Singleton2.getInstance();
        System.out.println(s1==s2);
    }
}
