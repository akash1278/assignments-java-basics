import java.util.*;
public class nprimes {
     public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of prime numbers to be print");
        int num=sc.nextInt();
        int count=0;
        int n=1;
        int temp=0;
        while(count < num){
            n+=1;
            for(int i=2;i<=n;i++){
                if(n%i==0){
                    temp=i;
                    break;
                }
            }
            if(temp==n){
                System.out.print(n+" ");
                count+=1;
            }
        }
        sc.close();
     }
}
