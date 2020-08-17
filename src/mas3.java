import java.util.Scanner;

public class mas3 {
    static void run() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер одномерного массива ");
        int n = sc.nextInt();
        double[] a = new double[n];
        System.out.println("Введите элементы массива");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextDouble();

        }
        int z1=0, z2=0, z3=0;
        for (int i = 0; i < n; i++) {
            if(a[i]>0){
                z1++;
            }
            if(a[i]<0){
                z2++;
            }
            if(a[i]==0){
                z3++;
            }
        }

        System.out.println("Количество положительных элементов -  "+ z1);
        System.out.println("Количество отрицательных элементов -  "+ z2);
        System.out.println("Количество нулевых элементов - "+ z3);
    }
}
