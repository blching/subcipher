import java.util.HashMap;
import java.util.Scanner;

public class subcipher {

    public static void main(String[] args) {
        String abc = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        System.out.println("Please enter Ciphertext:");
        Scanner scan = new Scanner(System.in);
        String ct = scan.nextLine(); 
        HashMap map = new HashMap<Character, Integer>();

        //Puts frequency of each letter
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

        //Prints for each letter of the alphabet, if there is one
        for (int i = 0; i < abc.length(); i++) {
            char tmp = abc.charAt(i);
            if (map.get(tmp) != null) {
                System.out.print(tmp + " " + map.get(tmp).toString() + "|");
            } else {
                System.out.print(tmp + " 0" +  "|");
            }
        }

        //Takes in key
        System.out.println("");
        System.out.println("Please enter Key:");

        String key = scan.nextLine();

        HashMap keymap = new HashMap<Character, Character>();

        //Matches up the key to each letter
        for (int i = 0; i < ct.length(); i++) {
            char letter = abc.charAt(i);
            char keyletter = key.charAt(i);

            keymap.put(letter, keyletter);
        }

        String decipheredString = "";

        for (int i = 0; i < ct.length(); i++) {
            char current = ct.charAt(i);
            char decipher = (char) keymap.get(current);

            decipheredString = decipheredString + decipher;
        }

        System.out.println("Deciphered String: ");
        System.out.print(decipheredString);

        scan.close();

    }
}
