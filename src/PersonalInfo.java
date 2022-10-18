import java.sql.SQLOutput;
public class PersonalInfo {
    // public static void main(String args[]) {
    static String first_name="Shipra";
    static String Last_name="Sharma";
    static int age=22;

    static {
        System.out.println(first_name + " " + Last_name + " " + age);
    }

    static void print() {
        System.out.println( first_name+ " " + Last_name+ " " + age);
    }
}

