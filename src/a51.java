import java.util.Scanner;

public class a51 {
    int xor (int a, int b) {
        if (a == b) return 0;
        return 1;
    }

    public static void main(String[] args) {
        int[] x = new int[19];
        int[] y = new int[22];
        int[] z = new int[23];

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter x: ");
        String xstring = scan.nextLine();

        System.out.println("Please enter y: ");
        String ystring = scan.nextLine();

        System.out.println("Please enter z: ");
        String zstring = scan.nextLine(); 

        System.out.println(xstring);
        System.out.println(ystring);
        System.out.println(zstring);

    }    
}
