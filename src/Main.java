import java.lang.Double;
import java.util.*;
public class Main {
    public static void main(String[] args) {
            ArrayList<Double> list=new ArrayList<>();
list.add(2.25);
list.add(3.67);
list.add(4.78);
list.add(10.233);
            double sum=0;
            Iterator it=list.iterator();
while(it.hasNext()){
                double num= (double) it.next();
                sum+=num;
            }
System.out.println(sum);
    }
}