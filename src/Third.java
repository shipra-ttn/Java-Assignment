import java.util.*;
public class Third {
    static void area(int r) {
        double sum = 3.14 * r * r;
        System.out.print("Area is" + sum);
    }
    static void circum(int r) {
        double sum2 = 2 * 3.14 * r;
        System.out.print("circumference is" + sum2);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        System.out.print("Enter your choice between 1-3");
        int n=sc.nextInt();
        switch(n) {
            case 1: Third.area(r);
                break;
            case 2: Third.circum(r);
                break;
            case 3: System.out.print("exiting");
                break;
            default: System.out.print("Invalid choice");
        }
    }
}


