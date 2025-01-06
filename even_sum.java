import java.util.*;
public class even_sum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the number");
        int number=s.nextInt();
        int temp=0;
        int sum=0;
        int prod=1;
        while(number!=0){
            temp=number%10;
            if(temp%2==0){
                sum+=temp;
            }
            else{
                prod*=temp;
            }
            number/=10;
        }
        System.out.println("the sum of even numbers in the given number is "+sum);
        System.out.println("the product of odd numbers in given number is "+prod);
        s.close();
    }
}