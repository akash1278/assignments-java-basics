import java.util.*;
public class missing_values {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("enter the length of array");
        int n=s.nextInt();
        int arr[]= new int[n];
        System.out.println(" enter the values in array");
        for(int i=0;i< n;i++)
        {
            arr[i]=s.nextInt();
        }
        miss(arr);
        s.close();
    }
    public static void miss(int arr[])
    {
        Arrays.sort(arr);
        int l = arr[0];
        int h = arr[arr.length-1];
        System.out.print("Missing numbers are : ");
        for(int i= l;i<=h;i++)
        {
            boolean b=false;
            for(int num:arr){
                if(num==i)
                {
                    b=true;
                }
            }
            if(!b)
            {
                System.out.print(i+" ");
            }
        }
    }
}