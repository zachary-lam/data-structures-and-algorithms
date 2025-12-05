public class Strings {
    public static void main(String[] parms) {
        
        // String is NOT a primitive data type
        String s;
        String t;
        
        s = "abc";
        System.out.println(s);
        
        // similar to Python slicing
        System.out.println(s.substring(1,2));
        System.out.println(s.substring(1));

        s = "abc";
        t = "abc";
        
        // Strings are compared with equality using equals, not ==
        if (t.equals(s)) {
            System.out.println("The strings are equal");
        }
        else {
            System.out.println("The strings are not equal");
        }
    }
}