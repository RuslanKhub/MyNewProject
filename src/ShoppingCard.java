
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShoppingCard {

    public static void card(){
        Scanner sc = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        while (true) {
            System.out.println("Введите пнродукт");
            String product = sc.nextLine();
            if(product.isEmpty()) {
                break;
            }
            list.add(product);
        }
        list.forEach(System.out::println);
    }
}
