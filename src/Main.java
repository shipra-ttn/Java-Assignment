import java.sql.SQLOutput;

interface StringManipulation{
    private static String reverse(String s){
     return new StringBuilder(s).reverse().toString();
    }

    static String toLowerCase(String s){
        return reverse(s).toLowerCase();
    }

    static String toUpperCase(String s){
        return reverse(s).toUpperCase();
    }
}

public class Main{
    public static void main(String[] args) {
        System.out.println(StringManipulation.toLowerCase("SHIPRA"));
        System.out.println(StringManipulation.toUpperCase("shipra"));
    }
}