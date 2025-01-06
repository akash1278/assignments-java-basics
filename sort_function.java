import java.util.*;
public class sort_function {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the size of an array");
        int size=s.nextInt();
        int arr[];
        arr=new int[size];
        for (int idx = 0; idx < arr.length; idx++) {
            System.out.println("enter a value");
            arr[idx]=s.nextInt();
            
        }
        sort(arr,size);
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
        s.close();
    }
    public static void sort(int arr[],int size){
        
        for(int i=0;i<size;i++){
            boolean swap=false;
            for(int j=1;j<size;j++){
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swap = true;
                }
            }
            if(swap==false)
            {
                break;
            }
        }
    }
}