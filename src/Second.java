import java.util.*;
public class Second {
        public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            //int i=0;
            String str=sc.nextLine();
            String s ="";
            // System.out.println(str);
            while(str.equals("XDONE")!=true){
                //String str=sc.nextLine();
                //System.out.println(str);
                s=s+str+" ";
                str=sc.nextLine();
                // System.out.println(str);
            }
            System.out.print(s);
            System.out.println(str);
        }
    }


