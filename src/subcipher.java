import java.util.HashMap;
import java.util.Scanner;

public class subcipher {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String ct = scan.nextLine(); 
        HashMap map = new HashMap<Character, Integer>();

        for (int i = 0; i < ct.length(); i++) {
            char tmp = ct.charAt(i);

            if (map.get(tmp) == null) {
                map.put(tmp, 1); 
            } else {
                map.get(tmp)
            }
        }



        scan.close();

    }
}
