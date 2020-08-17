import java.util.Scanner;

public class mas2 {
    static void run() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер одномерного массива ");
        int n = sc.nextInt();
        double[] a = new double[n];
        System.out.println("Введите элементы массива");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextDouble();

        }
        System.out.println("Введите число z");
        double z = sc.nextDouble();
        int zamena=0;
        for (int i = 0; i < n; i++) {
            if (a[i] >z) {
              a[i]=z;
              zamena++;
            }
        }
        System.out.println("Новый массив: ");
        for (int i = 0; i < n; i++) {
            System.out.println(a[i]);
        }

        System.out.println("Количество замен в массиве равно "+ zamena);
    }
}
