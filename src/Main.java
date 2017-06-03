import java.util.Arrays;

/**
 * Created by Valentin on 20.05.2017.
 */
public class Main {
    public static void main(String[] args) {
        for (char i = 'A'; i <='C'; i++) {
            System.out.println("i = " + i);
        }
        
        
        /*System.out.println("Hi");
        int a=10;
        System.out.println("a= " + a);*/

        int[] data = {1, 5, 88, 9, 2, 6, 5, 14};
        for (int barr = data.length - 1; barr >= 0; barr--) {
            for (int index = 0; index < barr; index++) {
                if (data[index] > data[index + 1]) {
                    int tmp = data[index];
                    data[index] = data[index + 1];
                    data[index + 1] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(data));
    }
}
