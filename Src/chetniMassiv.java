import java.util.Arrays;
import java.util.Scanner;

public class chetniMassiv {
    public static void main(String[] args) {

        System.out.println("создаем массив из четных элементов.");
        System.out.println("массив начинается с 2 и заканчивается введеным вами числом.");
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите любое целое число больше 2 - ");
        int max = 0;
        while (max <= 2) {
            if (sc.hasNextInt()) {
                max = sc.nextInt();
                if (max <= 2) {
                    System.out.print("Введенное число должно быть больше 2. Повторите ввод: ");
                }
            } else {
                System.out.print("Вы ввели не число. Повторите ввод:");
                sc.next();
            }
        }
        int dlinna = 0;
        int[] creatArr = createArray(max);
        System.out.println("Длина массива: " + creatArr.length);
        System.out.println("Массив: ");
        System.out.println( Arrays.toString(creatArr));
        System.out.println("Массив: ");
        Arrays.stream(creatArr).forEach(System.out::println);
        System.out.println("Массив: ");
        for(int n: creatArr)
            System.out.print(n + " ");
    }

    public static int[] createArray(int max) {
        int min = 2;
        int range = (max) / 2;
        int[] myArray = new int[range];
        int i = 0;
        for (int j = 0; j < range; j++) {
            i++;
            //  int schet = myArray[j];
            do {
                if (i % 2 == 0) {
                    myArray[j] = i;
                    break;
                } else i++;
            } while (i <= max);
        }
        return  myArray;
    }
}
