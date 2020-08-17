import java.util.Scanner;

public class mas5 {
    static void run() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер одномерного массива ");
        int n = sc.nextInt();
        double[] a = new double[n];
        System.out.println("Введите элементы массива");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextDouble();
        }
        for (int i = 0; i < n; i++){
            if(a[i]>i){
                System.out.println(a[i]);

            }
        }

    }
}
