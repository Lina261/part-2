import java.util.Scanner;

public class mas7 {
    static void run() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первый член ряда ");
        int a = sc.nextInt();
        System.out.println("Введите второй член ряда ");
        int b = sc.nextInt();
        System.out.println("Введите количество элементов в ряду");
        int n = sc.nextInt();
        int c=b-a;
        int [] mas= new int[n];
        for (int i = 0; i < n; i++) {
            mas[i]=a+c*i + a+c*(2*n-i);
        }
        int max=0;
        for (int i = 0; i < n; i++) {
            if (mas[i] >max) {
                max=mas[i];
            }}
System.out.println("Максимальный элемент равен "+max);
        }
}
