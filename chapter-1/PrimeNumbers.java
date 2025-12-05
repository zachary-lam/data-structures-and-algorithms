public class PrimeNumbers { 
    public static void main(String[] parms) {
        int[] list;

        list = generatePrimes(40);
        print_list(list);
    }

    public static int[] generatePrimes(int max) {
        int[] list;
        int[] new_list;
        int numPrimes;
        int count;

        list = new int[max];
        numPrimes = 0;
        
        for (count = 2; count < max; count++) {
            if (isPrime(count)) {
                list[numPrimes] = count;
                numPrimes++;
            }
        }

        new_list = new int[numPrimes];
        System.arraycopy(list, 0, new_list, 0, numPrimes);
        return new_list;
    }

    public static boolean isPrime(int value) {
        int count;
        int sqrt;
        boolean result;

        result = true;
        for (count = 2; (count < value) && result; count++) {
            if (((value/count) * count) == value) {
                result = false;
            }
        }
        return result;
    }

    public static void print_list(int[] my_list) {
        int i;

        for (i = 0; i < my_list.length; i++) {
            System.out.print(my_list[i] + " ");
        }
        System.out.println();
    }
}