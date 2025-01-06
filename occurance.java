import java.util.*;
public class occurance {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the size of array");
        int n=s.nextInt();
        int arr[];
        arr= new int[n];
        int count=0;
        for (int idx = 0; idx < arr.length; idx++) {
            System.out.println("enter the values ");
            arr[idx]=s.nextInt();
            
        }
        System.out.println("enter the number to check how many times it is in array");
        int num=s.nextInt();
        for (int idx = 0; idx < arr.length; idx++) {
            if(arr[idx]==num){
                count ++;
            }
            
        }
        System.out.println("the occurance of the given number "+num+" in array is: "+count);
        s.close();
    }
}