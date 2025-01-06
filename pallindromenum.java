import java.util.Scanner;
public class pallindromenum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any number");
        int numb=sc.nextInt();
        int temp=numb;
        int n=0;
        while(numb!=0){
            int dig=numb%10;
            n*=10;
            n+=dig;
            numb=numb/10;
        }
        if(n==temp){
            System.out.println(temp +" the number is pallindrome");
        }
        else{
            System.out.println(temp +" not a pallindrome");
        }
    }

    
}