import java.util.*;
public class Fourth {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int arr[][]=new int[3][3];
            for(int i=0;i<3;i++){
                for(int j=0;j<3;j++){
                    arr[i][j]=sc.nextInt();
                }
            }
            for(int i=0;i<3;i++){
                int sum=0;
                for(int j=0;j<3;j++){
                    sum=sum+arr[i][j];
                }
                System.out.println("sum of row"+(i+1)+"= "+sum);
            }
            for(int i=0;i<3;i++){
                int sum=0;
                for(int j=0;j<3;j++){
                    sum=sum+arr[j][i];
                }
                System.out.println("sum of column"+(i+1)+"= "+sum);
            }

            // System.out.println("Hello, World!");
        }
    }


