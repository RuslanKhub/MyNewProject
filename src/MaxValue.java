import java.util.Scanner;

public class MaxValue {
    public static void getMax(){
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println(Math.max(num2,num1));
    }
}
