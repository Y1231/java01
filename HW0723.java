package BasicWork.HW200708;
import java.util.Arrays;
/**
 * @ Author     ：CYD
 * @ Date       ：Created in 17:22 2020/7/23
 * @ Description：
 * @ Modified By：
 * @Version: $
 */

public class HW0723 {
    //1.给定一个整型数组, 实现冒泡排序(升序排序)
    public static void Maopao(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int b = array.length - 1; b > i; b--) {
                if (array[b - 1] > array[b]) {
                    int tmp = array[b - 1];
                    array[b - 1] = array[b];
                    array[b] = tmp;
                }
            }
        }
    }

    public static void main1(String[] args) {
        int[] array = {3, 6, 2, 8, 4};
        Maopao(array);
        System.out.println(Arrays.toString(array));
    }

    //2.给定一个整型数组, 判定数组是否有序（递增）
    public static boolean func(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main2(String[] args) {
        int[] array = {1, 4, 6, 3};
        System.out.println(func(array));

    }

    //3.给定一个有序整型数组, 实现二分查找
    public static int find(int[] array, int tofind) {
        int left = 0;
        int right = array.length - 1;
        while (left < right) {
            int mid = (left + right) / 2;
            if (tofind < mid) {
                right = mid - 1;
            } else if (tofind > array[mid]) {
                left = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static void main3(String[] args) {
        int[] array = {1, 4, 6, 7, 9};
        System.out.println(find(array, 4));
    }

}
