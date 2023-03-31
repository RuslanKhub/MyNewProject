
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShoppingCard {

    public static void card(){
        Scanner sc = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        String str;
        while (sc.hasNext()) {
            str = sc.nextLine();
            if (isItEmpty(str)) {
                list.add(str);
            }else{
                break;
            }
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    public static boolean isItEmpty(String str){
        if (str.isEmpty())
            return false;

        else
            return true;
    }
}
