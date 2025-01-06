import java.util.*;
public class binary_search {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the size of an array");
        int n=s.nextInt();
        int arr[];
        arr= new int[n];
        for (int idx = 0; idx < arr.length; idx++) {
            System.out.println("enter the values ");
            arr[idx]=s.nextInt();
            
        }
        Arrays.sort(arr);
        System.out.println("enter the value to search");
        int val=s.nextInt();
        int res=binary(arr,arr[0],arr[n-1],val);
        s.close();
        if(res==-1){
            System.out.println("element is not present in array");
        }
        else
        {
            System.out.println("element is present at "+res+" position");
        }
        s.close();
    }
    public static int binary(int arr[],int st,int end,int val){
        int mid;
        if(st<=end){
            mid=(st+end)/2;
            if(arr[mid]==val){
                return mid+1;
            }
            else if(arr[mid]>val){
                return binary(arr, st, arr[mid-1], val);
            }
            else
            {
                return binary(arr, arr[mid+1], end, val);
            }
        }
        return -1;
    }
}