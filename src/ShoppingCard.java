import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingCard {
    public static void card(){
        Scanner sc = new Scanner(System.in);
        ArrayList <String> array = new ArrayList<>();
        String str;
        while (sc.hasNext()) {
            str = sc.nextLine();
            if (isItEmpty(str) == true) {
                array.add(str);
            }else{
                break;
            }
            str = "";
        }
        for (int i = 0; i < array.size(); i++) {
            System.out.println(array.get(i));
        }
    }

    public static boolean isItEmpty(String str){
        if (str.isEmpty())
            return false;

        else
            return true;
    }
}
