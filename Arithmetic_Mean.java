import java.util.*;
public class Arithmetic_Mean {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("enter the size or array");
        int n=s.nextInt();
        System.out.println("enter the values ");
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=s.nextInt();
        }
        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum+=arr[i];
        }
        int avg_mean=sum/n;
        System.out.println("the arithmetic mean is "+avg_mean);
        s.close();
    }
}