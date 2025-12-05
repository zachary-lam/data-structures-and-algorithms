public class PassingParams {
    public static void main (String[] params) {
        int[] my_list;

        my_list = new int[] {1,2,3,4,5};

        add_element(my_list,200);

        print_list(my_list);
    }

    public static void add_element(int[] my_list, int element) {
        int[] new_list;

        new_list = new int[my_list.length+1];
        System.arraycopy(my_list, 0, new_list, 0, my_list.length);
        new_list[new_list.length-1] = element;
        my_list = new_list;
        print_list(my_list);
    }

    public static void print_list(int[] my_list) {
        int i;

        for (i=0; i < my_list.length; i++) {
            System.out.print(my_list[i] + " ");
        }
        System.out.println();
    }
}