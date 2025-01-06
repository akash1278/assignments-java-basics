import java.util.Scanner;
public class neon {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the number");
        int number = s.nextInt();
        int square=number*number;
        int temp=0;
        while(square!=0){
            temp+=square%10;
            square/=10;
        }
        if(temp==number){
            System.out.println("the number "+ number+" is a neon  number");
        }
        else
        {
            System.out.println("the number "+number+" is not a neon number");
        }
        s.close();
    }
}
