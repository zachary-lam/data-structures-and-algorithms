public class ListsArrays {
    public static void main (String[] parms) {
       int[] my_list; // an array of type integer
       my_list = new int[] {1,2,3,4};
       print_list(my_list);

       System.out.println("Refactored print_list method:");
       my_list = create_list(5);
       refactored_print_list(my_list);
    }

    public static void print_list(int[] my_list) {
        int i;

        for(i=0; i<my_list.length; i++) {
            System.out.println(my_list[i] + " ");
        }
        System.out.println();
    }

    public static int[] create_list(int n) {
        int[] list;
        int i;

        list = new int[n];
        for (i=0; i<n; i++) {
            list[i] = i;
        }
        return list;
    }

    public static void refactored_print_list(int[] list) {
        int i;
        for (i=0; i < list.length; i++) {
            System.out.println(list[i] + " ");
        }
        System.out.println();
    }
}