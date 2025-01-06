import java.util.*;
public class reverse {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("enter number");
        int num=s.nextInt();
        int rev=0;
        String str=Integer.toString(num);
        int size=str.length();
        while(num!=0){
            int temp=num%10;
            rev*=10;
            rev+=temp;
            num/=10;
        }
        System.out.println("the reverse of number is "+rev+" size is "+size);
        s.close();
    }
}