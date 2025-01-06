import java.util.*;
public class sum_row_and_column {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("enter row value");
        int r=s.nextInt();
        System.out.println("enter column value");
        int c=s.nextInt();
        int arr[][]=new int[r][c];
        System.out.println("enter the values2");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                arr[i][j]=s.nextInt();
            }
        }
        System.out.println("the sum of rows: ");
        for (int idx = 0; idx < r; idx++) {
            int sum=0;
            for (int i = 0; i < c; i++) {
                sum+=arr[idx][i];
            }
            System.out.println("the sum of row "+(idx+1)+" is "+sum);
            
        }
        System.out.println("the sum of columns: ");
        for (int idx = 0; idx < c; idx++) {
            int sum=0;
            for (int i = 0; i < r; i++) {
                sum+=arr[i][idx];
            }
            System.out.println("the sum of column "+(idx+1)+" is "+sum);
            
        }
        s.close();
    }
}