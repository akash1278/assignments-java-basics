import java.util.*;
public class min_and_max {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int arr[];
        int n;
        System.out.println("enter the size of array");
        n=s.nextInt();
        arr=new int[n];
        for (int idx = 0; idx < arr.length; idx++) {
            System.out.println("enter the values");
            arr[idx]=s.nextInt();
            
        }
        Arrays.sort(arr);
        int min=arr[0];
        int max=arr[n-1];
        System.out.println("the min and max of the given array is: "+min+" "+max);
        s.close();
    }
}