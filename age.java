import java.util.*;
public class age {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int arr[];
        int count=0;
        arr=new int[100];
        for(int i=0;i < 100;i++){
            System.out.println("enter the age of "+i+" person:");
            arr[i]=s.nextInt();
            if(arr[i]>=50&&arr[i]<=60){
                count++;
            }
        }
        System.out.println("the number of persons whose age is between 50 and 60 is "+count);
        s.close();

    }
}