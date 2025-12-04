public class Loops {
    public static void main(String[] parms) {
        int i;
        System.out.println("For loop:");
        for (i=0; i<5; i++) {
            System.out.println(i);
            }

        System.out.println();

        i=0;
        System.out.println("While loop:");
        while (i<5) {
            System.out.println(i);
            i++;
        }

        System.out.println();

        int n;
        int stop;
        n = 25;
        stop = 0;
        System.out.println("While loop where n is a multiple of 20:");
        // not neccessary to use while here cause additional clauses in a for statement is supported
        for (i=n; (i<50) && (stop==0); i++) { 
            System.out.print(i + " ");

            if ((i/20*20) == 1) {
                stop = 1;
            }
        }
        System.out.println();
    }
}
