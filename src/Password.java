import java.util.Scanner;

public class Password {
    public static void password(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите пароль:");
        String password = sc.next();
        System.out.println("Теперь попробуйте ввести его еще раз:");
        String attempt = sc.next();
        while (!password.equals(attempt)){
            System.out.println("Неверный пароль попробуйте еще раз:");
            attempt = sc.next();
        }
    }
}
