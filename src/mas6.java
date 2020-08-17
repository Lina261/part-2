import java.util.Scanner;

public class mas6 {
    public static boolean checkSimple(int i) {
        if (i <= 1)
            return false;
        else if (i <= 3)
            return true;
        else if (i % 2 == 0 || i % 3 == 0)
            return false;
        int n = 5;
        while (n * n <= i) {
            if (i % n == 0 || i % (n + 2) == 0)
                return false;
            n = n + 6;
        }
        return true;
    }

    static void run() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер одномерного массива ");
        int n = sc.nextInt();
        double[] a = new double[n];
        System.out.println("Введите элементы массива");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextDouble();
        }

        double sum = 0;
        for (int i = 0; i < n; i++) {

            if (checkSimple(i)){
                sum+=a[i];
            }
        }

        System.out.println(sum);
    }

}

