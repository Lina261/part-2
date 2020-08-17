import java.util.Scanner;

public class mas8 {
    static void run() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер одномерного массива ");
        int n = sc.nextInt();
        int[] mas = new int[n];
        System.out.println("Введите элементы массива");
        for (int i = 0; i < n; i++) {
            mas[i] = sc.nextInt();
        }

        int min=mas[0];
        for(int i=0;i<n;i++){
            if(mas[i]<min){
                min=mas[i];
            }
        }
        System.out.println("Массив без минимального элемента ");
        for(int i=0;i<n;i++){
            if(mas[i]!=min){
                    System.out.println(mas[i]);
            }

        }

}
}
