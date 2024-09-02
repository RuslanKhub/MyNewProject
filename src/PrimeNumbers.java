import java.util.Scanner;

public class PrimeNumbers {

    public static void getPrimeNumbers(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число");
        int min = sc.nextInt();
        System.out.println("Введите второе число");
        int max = sc.nextInt();
        boolean result = true;
        for (int i = min; i < max; i++) {
            result = true;
            for (int j = 2; j < i; j++) {
                if(i % j == 0){
                    result = false;
                    break;
                }
                }
            if(result){
                System.out.println(i);
            }
        }
    }
}
