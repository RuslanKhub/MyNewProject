import java.util.Scanner;

public class PrimeNumbers {
    public static void getNumbers(){
        Scanner sc = new Scanner(System.in);
        int min = sc.nextInt();
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
            if(result == true){
                System.out.println(i);
            }
        }
    }
}
