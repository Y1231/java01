package 线程.java01;

/**
 * @ Author     ：CYD
 * @ Date       ：Created in 19:33 2020/12/15
 * @ Description：单例模式  -饿汉模式
 * @ Modified By：无论是否真实使用它，都在类创建的时候先初始化好
 *
 * 程序启动时，一股脑创建好
 *java在启动时，只有一个线程在运行，static
 *
 * 线程安全的
 */
class Singleton{
    //1.将构造函数设置为私有   (防止外部实例化)
    private  Singleton(){

    }

    //2.设置一个私有的属性（实例）
    private static Singleton instance=new Singleton();

    //3.提供统一的获取实例的方法
    public static Singleton getInstance(){
        return instance;
    }
}


public class hungry {
    public static void main(String[] args) {

        Singleton s1=Singleton.getInstance();
        Singleton s2=Singleton.getInstance();
        System.out.println(s1==s2);
    }
}
