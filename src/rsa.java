import java.util.Scanner;
public class rsa {

    public static void main(String[] args) {
        //Takes in arguments
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter p: ");
        int p = scan.nextInt();

        System.out.println("Please enter q: ");
        int q = scan.nextInt();

        System.out.println("Please enter e: ");
        int e = scan.nextInt();

        // d = e^-1 mod (p-1)(q-1) or e*d mod n = 1 from EEA
        int n = (p-1) * (q-1);
        boolean go = true;
        int d = 1;
        while (go) {
            int tmp = (d * e) % n;

            if (tmp == 1) {
                System.out.println(d);
                go = false;
            }

            d++;
        }

        scan.close();
    }
}
