import java.util.Scanner;

public class mas10 {
    static void run() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер одномерного массива ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Введите элементы массива");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if((i==1)||(i%2==1)){
                System.out.println("0");
            }
            else System.out.println(a[i]);
        }
    }
}
