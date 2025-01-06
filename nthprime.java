import java.util.*;
public class nthprime {
    public static void main(String[] args){
          Scanner sc=new Scanner(System.in);
          System.out.println("enter the number to print prime number at nth: ");
          int num=sc.nextInt();
          int count = 0;
          int n=1;
          int temp=0;
          while(count < num){
                n+=1;
                for(int i=2;i<=n;i++)
                {
                    if(n%i==0){
                        temp=i;
                        break;
                    }
                }
                if(temp==n){
                    count+=1;
                }
                
          }
          System.out.println(n + " is the nth prime number");
          sc.close();
    }
}
