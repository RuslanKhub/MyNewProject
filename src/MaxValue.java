import java.util.Scanner;

public class MaxValue {

    public static void getMax(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число");
        int num1 = sc.nextInt();
        System.out.println("Введите второе число");
        int num2 = sc.nextInt();
        if(num1 == num2)
            System.out.println("Числа равны");
        else
            System.out.println(Math.max(num2,num1));
    }
}
