import java.util.*;
public class descending {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int arr[];
        int n;
        boolean swap;
        System.out.println("enter the size of array");
        n=s.nextInt();
        arr=new int[n];
        for(int i=0;i < n;i++){
            System.out.println("enter values");
            arr[i]=s.nextInt();
        }
        for (int id = 0; id < arr.length; id++) {
            swap = false;
            for (int idx = 1; idx < arr.length; idx++) {
                if(arr[idx]>arr[idx-1]){
                    int temp=arr[idx];
                    arr[idx]=arr[idx-1];
                    arr[idx-1]=temp;
                    swap = true;
                }

            }
            if(swap==false){
                break;
            }
        }
        for (int idx = 0; idx < arr.length; idx++) {
            System.out.print(arr[idx]+" ");           
        }
        s.close();
    }
}