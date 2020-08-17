import java.util.Scanner;

public class mas9 {
     static int num,c,num2,max,numMax,min;

    static void run() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер одномерного массива ");
        int n = sc.nextInt();
        int[] mas1 = new int[n];
        System.out.println("Введите элементы массива");
        for (int i = 0; i < n; i++) {
            mas1[i] = sc.nextInt();
        }
         int [] mas2 = new int [n]; int [] mas3 = new int [n];

        for(int i=0;i<n;i++) {
            for(int j=i;j<n;j++) {
                if(mas1[i]==mas1[j]) num++;
            }
            mas2[i]=num; num=0;
        }


            max=mas2[0];
            for(int i=0;i<n;i++) {
                if(max<mas2[i]){
                max=mas2[i];
                c=i;}
            }
            for(int i=0;i<n;i++) {
                if(max==mas2[i]) {numMax++;}// Находим количество максимально повторяющихся элементов
            }
            if(numMax==1) { // Если их количество равно 1 ,то одно число повторяется максимальное количество раз
                System.out.println("Число "+mas1[c]+" встречается " + max+" раза"); // Выводим это число
            }
            else {
                for(int i=0;i<n;i++) {
                    if(mas2[i]==max) {mas3[i]=mas1[i];}// Если же таких элементов несколько ,то заполняем новый массив D этими элементами
                }

                min=mas3[0];
                c=0;
                for(int i=0;i<n;i++) {

                    if(min>mas3[i] && mas3[i]!=0) {min=mas3[i];c=i;}// Находим в массиве D минимальное число
                }
                System.out.println("Число "+min+" встречается " + max+" раза"); // Выводим минимальное число в массиве ,которое встречается максимальное количество раз

            }

        }}

