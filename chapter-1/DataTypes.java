public class DataTypes {
    public static void main(String[] parms) {
        int i;
        float j;

        i = 25;

        System.out.println(i);

        j = (float) i;

        j += 0.5;

        System.out.println(j);

        i = (int) j;

        System.out.println(i);
    }
}