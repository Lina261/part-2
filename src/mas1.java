import java.util.Scanner;

public class mas1 {
    static void run(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Введите размер одномерного массива ");
        int n=sc.nextInt();
        int [] a= new int[n];
        System.out.println("Введите элементы массива");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();

        }
        System.out.println("Введите число k");
        int k=sc.nextInt();
        int sum=0;
        for(int i=0;i<n;i++){
            if(a[i]%k==0){
                sum=sum+a[i];
            }
        }
        System.out.println("Сумма тех элементов, которые кратны k равна "+sum);
    }
}
