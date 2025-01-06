import java.util.*;
public class swap_last_two {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the number");
        int num=s.nextInt();
        int temp;
        int rev=0;
        for(int i=0;i<2;i++){
            temp=num%10;
            rev*=10;
            rev+=temp;
            num=num/10;
        }
        num*=100;
        num+=rev;
        System.out.println("the swap of last two digits is "+ num);
         s.close();
    }
}