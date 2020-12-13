package BasicWork.HW200708;
import java.util.Arrays;
/**
 * @ Author     ：CYD
 * @ Date       ：Created in 21:33 2020/7/22
 * @ Description：
 * @ Modified By：
 * @Version: $
 */

public class HW0722 {
    //1.求数组的平均值
    //实现一个方法 avg, 以数组为参数, 求数组中所有元素的平均值(注意方法的返回值类型).
    public static double avg(int [] array){
        int sum=0;
        double avg;
        for(int x:array){
            sum=sum+x;
        }
        avg=sum/array.length;
        return sum;
    }

    public static void main1(String[] args) {
        int [] array={1,2,3,4};
        System.out.println(avg(array));
    }



//2.实现一个方法 sum, 以数组为参数, 求数组所有元素之和.
public static int sum(int [] array1){
    int sum=0;
    for(int x:array1){
        sum=sum+x;
    }
    return sum;
}

    public static void main2(String[] args) {
        int [] array1={1,2,3,4};
        System.out.println(sum(array1));
    }
//3.实现一个方法 transform, 以数组为参数, 循环将数组中的每个元素 乘以 2 ,
// 并设置到对应的数组元素上. 例如 原数组为 {1, 2, 3}, 修改之后为 {2, 4, 6}
public static int [] transform(int [] array3){
    int [] temp=new int [array3.length];
    for(int i=0;i<array3.length;i++)
    {
        temp[i]=array3[i]*2;
    }
    return temp;
}

    public static void main3(String[] args) {
        int [] array3={1,2,3};
        System.out.println(Arrays.toString(transform(array3)));
    }
//4.实现一个方法 printArray, 以数组为参数, 循环访问数组中的每个元素, 打印每个元素的值.
    public static void printArray(int [] array4){
        for(int x:array4){
            System.out.print(x+" ");
        }
    }

    public static void main4(String[] args) {
        int [] array4={1,2,3};
        printArray(array4);
    }
//5.创建一个 int 类型的数组, 元素个数为 100, 并把每个元素依次设置为 1 - 100
public static int[] put(int[] array5) {
    for(int i = 0;i < 100; i++){
        array5[i] = i + 1;
    }
    return array5;
}
public static void main(String[] args) {
    int[] array5 = new int[100];
    System. out. println(Arrays. toString(put(array5)));
}


}
