import java.util.Scanner;

public class a51 {
    static int xor (int a, int b) {
        if (a == b) return 0;
        return 1;
    }

    static int maj(int x, int y, int z) {
        int sum = x + y + z;
        if (sum > 1) {
            return 1;
        }

        return 0;
    }

    static void shift(int[] a, int tap, int output) {
        int last = a[a.length-1];

        for (int i = a.length-2; i >= 0; i--) {
            a[i+1] = a[i];
        }
        a[0] = tap;

        output = last;
    }

    static void stringtoint(int[] a, String s) {
        for (int i = 0; i < a.length; i++) {
            char tmp = s.charAt(i);
            int input = Character.getNumericValue(tmp);

            a[i] = input;
        }
    }

    static void printArray(String name, int[] a) {
        System.out.print(name + ": ");
        for (int i = 0; i < a.length; i++) System.out.print(a[i]);
        System.out.println("");
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

        //Convert string to int
        stringtoint(x, xstring);
        stringtoint(y, ystring);
        stringtoint(z, zstring);

        //Calculate Maj of x8 y10 and z10
        int m = maj(x[7], y[9], z[9]);

        //Calculate X steps 13,16,17,18 XOR
        boolean xstep = false, ystep = false, zstep = false;
        int current, xtap, ytap, ztap;

        current = xor(x[12], x[15]);
        current = xor(current, x[16]);
        current = xor(current, x[17]);

        xtap = current;
        //Calculate Y steps, 20, 21 XOR
        current = xor(y[19], y[20]);

        ytap = current;

        //Calculate Z steps, 7, 20, 21, 22 XOR
        current = xor(z[6], z[19]);
        current = xor(current, z[20]);
        current = xor(current, z[21]);

        ztap = current;

        //Shift each register if x8, y10, z10 = m
        if (x[7] == m) xstep = true;
        if (y[9] == m) ystep = true;
        if (z[9] == m) zstep = true;

        if (xstep) {
            int xout = -1;
            shift(x, xtap, xout);
        }
        
        if (ystep) {
            int yout = -1;
            shift(y, ytap, yout);
        }

        if (zstep) {
            int zout = -1;
            shift(z, ztap, zout);
        }

        int keystreamBit;

        keystreamBit = xor(x[17], y[20]);
        keystreamBit = xor(keystreamBit, z[21]);

        printArray("x", x);
        printArray("y", y);
        printArray("z", z);

    }    
}
