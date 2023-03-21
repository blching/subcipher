import java.util.HashMap;
import java.util.Scanner;

public class subcipher {

    public static void main(String[] args) {
        String abc = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        System.out.println("Please enter Ciphertext:");
        Scanner scan = new Scanner(System.in);
        String ct = scan.nextLine(); 
        HashMap map = new HashMap<Character, Integer>();

        for (int i = 0; i < ct.length(); i++) {
            char tmp = ct.charAt(i);

            if (map.get(tmp) == null) {
                map.put(tmp, 1); 
            } else {
                int value = (int)map.get(tmp);
                value++;
                map.put(tmp,value);
            }
        }

        for (int i = 0; i < abc.length(); i++) {
            char tmp = abc.charAt(i);
            if (map.get(tmp) != null) {
                System.out.print(tmp + " " + map.get(tmp).toString() + "|");
            } else {
                System.out.print(tmp + " 0" +  "|");
            }
        }

        /* System.out.println("Please enter Key:");
        String key = scan.nextLine();
        */
        scan.close();

    }
}
