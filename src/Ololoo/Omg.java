package Ololoo;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by Valentin on 27.05.2017.
 */
public class Omg {
    public static void main(String[] args) {
        /*int x= 15;
        boolean b = (x > 10) && (x < 100);
        System.out.println(b);*/
        /*String a="qwerty";
        String d="qwerty";
      //String d = new String("qwerty");
        System.out.println(a==d);
        System.out.println(a.equals(d)); //правильно
        System.out.println("qwerty".equals(d));*/

        /*int a=Integer.parseInt("123");
        double v = Double.parseDouble("123.34");
        System.out.println(a+10);
        System.out.println(v+10);
        System.out.println(String.valueOf(a)+10);*/

        // System.out.println(" Drug 100 ml".trim().split(" ")[2]);
        // System.out.println(" Drug 100 ml".trim().charAt(6));
        /*System.out.println(Integer.toString(262));
        System.out.println(Integer.toBinaryString(262));
        System.out.println(Integer.toHexString(267));
        System.out.println(Integer.toOctalString(267));*/

        /*int[] arr = {1, 2, 3, 4};
        System.out.println(Arrays.toString(arr));
*/
        /*int[] arr = new int[4];
        arr[arr.length - 1] = 100;
        arr[0] = 15;
        System.out.println(Arrays.toString(arr));*/

        /*int[][] arr = {{1, 2, 3},
                {4, 5, 6}};
        System.out.println(Arrays.deepToString(arr));*/

        /*int[][] arr = new int[4][4]; //null значение ссылки по умолчанию;
        arr[1][1]=1000;
        arr[2][2]=1001;
        System.out.println(Arrays.deepToString(arr));*/

       /* int[][] arr = new int[4][]; //null значение ссылки по умолчанию;
        arr[0] = new int[2];
        arr[1] = new int[3];
        arr[2] = new int[4];
        arr[3] = new int[5];
        System.out.println(Arrays.deepToString(arr));*/

       /* int[] arr = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(Arrays.toString(arr));
        reversArr(arr);
        System.out.println(Arrays.toString(arr));

        int[] arr1 = {10, 20, 30, 40, 50, 60, 70};
        System.out.println(Arrays.toString(arr1));
        reversArr(arr1);
        System.out.println(Arrays.toString(arr1));*/

        int[] data = {1, 5, 88, 9, 2, 6, 5, 14};
        System.out.println(Arrays.toString(data));
        sort(data);
        System.out.println(Arrays.toString(data));

        /*int[] data2 = {2, 5, 88, 9, 2, 6, 5, 14};
        Arrays.sort(data2);
        System.out.println(Arrays.toString(data2));*/
    }

    public static void sort(int[] data) {
        for (int barr = data.length - 1; barr >= 0; barr--) {
            for (int index = 0; index < barr; index++) {
                if (data[index] > data[index + 1]) {
                    int tmp = data[index];
                    data[index] = data[index + 1];
                    data[index + 1] = tmp;
                }
            }
        }
    }

   /* private static void reversArr(int[] arr) {
        for (int k = 0; k < arr.length / 2; k++) {
            int temp = arr[k];
            arr[k] = arr[arr.length - 1 - k];
            arr[arr.length - 1 - k] = temp;
        }
    }*/


}
