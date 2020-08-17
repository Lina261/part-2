import java.util.Scanner;

public class mas4 {
    static void run() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер одномерного массива ");
        int n = sc.nextInt();
        double[] a = new double[n];
        System.out.println("Введите элементы массива");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextDouble();
        }
        int min=0, max=0;
        for(int i=0;i<n;i++){
            if (a[i] < min) {
                min=i;
            }
            if (a[i] > max) {
                max=i;

            }

        }
        double h=a[max];
        a[max]=a[min];

        a[min]=h;
        System.out.println("Новый массив ");
        for(int i=0;i<n;i++){
            System.out.println(a[i]);
        }

}}
