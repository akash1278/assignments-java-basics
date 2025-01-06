import java.util.Scanner;
public class strong {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the number");
        int num=scan.nextInt();
        int st=0;
        int temp=num;
        while(num!=0){
            int dig=num%10;
            st+=fact(dig);
            num=num/10;

        }
        if(temp==st){
            System.err.println(temp +" is a Strong number");
        }
        else{
            System.err.println(temp +" is not a strong number");
        }
        
    }
    public static int fact(int n){
        if(n>1){
            return n * fact( n-1);
        }
        else{
            return 1;
        }

    }
}