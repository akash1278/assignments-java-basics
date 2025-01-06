import java.util.*;
public class sum_and_product {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("enter the number");
        int num=s.nextInt();
        String str=Integer.toString(num);
        if(str.length()<2)
        {
            System.out.println("enter more tha two digits ");

        }
        else
        {
            int sum;
            int prod=1;
            int first= Character.getNumericValue(str.charAt(0));
            int last= Character.getNumericValue(str.charAt(str.length()-1));
            sum=first+last;
            boolean b=false;
            for(int i=1;i<str.length()-1;i++)
            {
                b=true;
                prod*=Character.getNumericValue(str.charAt(i));
            }
            if(b==true)
            {
                System.out.println("the sum of first and last number is "+ sum+ " the product of remaining numbers is "+prod);
            }
            else
            {
                System.out.println("the sum of first and last number is "+ sum+" and there are no middle numbers.");
            }
        }
        s.close();
    }
}