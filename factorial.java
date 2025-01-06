import java.util.*;
public class factorial {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int num=sc.nextInt();
        System.out.println("the factorial of "+num+" is " +fact(num));
        sc.close();
    }
    public static int fact(int n){
        if(n>1){
            return n * fact(n-1);
        }else{
            return 1;
        }
    }
    
}
