public class Functions {
    // main entry point for the program
    public static void main(String[] parms) {
        print_loop(5);
    }

    // method
    public static void print_loop(int n) {
        int i;

        for (i=0; i<n; i++) {
            System.out.println(i);
        }
    }
}