import java.util.*;
public class sum_last_3_digits {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("enter any number");
        int number=s.nextInt();
        String str=Integer.toString(number);
        int res=0;
        int size=str.length();
        if(size>3){
            for(int i=3;i>0;i--)
            {
                res+=number%10;
                number/=10;
            }
            if((res>1&&res<10)||(res==11||res==22))
            {
                System.out.println("the sum of last three digits of given is: "+res+" pallindrome");

            }
            else
            {
                System.out.println("the sum of last three digits of given is: "+res+" not a pallindrome");
            }
        }
        else{
            System.out.println("enter number with more than 3 digits");

        }
        s.close();
    }
}