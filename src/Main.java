import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	System.out.println("ЧАСТЬ 2");
	System.out.println("Какое задание нужно выполнить?\nОдномерные массивы 1-10");
	Scanner sc=new Scanner(System.in);
	int x=sc.nextInt();
	switch (x){
        case 1:mas1.run();
        break;
        case 2:mas2.run();
            break;
        case 3:mas3.run();
            break;
        case 4:mas4.run();
            break;
        case 5:mas5.run();
            break;
        case 6:mas6.run();
            break;
        case 7:mas7.run();
            break;
        case 8:mas8.run();
            break;
        case 9:mas9.run();
            break;
        case 10:mas10.run();
            break;
    }

    }
}
