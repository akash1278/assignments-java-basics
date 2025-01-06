import java.util.*;
public class permutation_and_combination {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("enter no.of values");
        int num=s.nextInt();
        System.out.println("enter the repeation number");
        int rep=s.nextInt();
        if(num<0||num<rep||rep<0)
        {
            System.out.println("enter correct values");

        }
        else{
            long per=fact(num)/fact(num-rep);
            long comb=per/fact(rep);
            System.out.println("the perumation is "+per+ " the combination is "+comb);
        }
        s.close();
    }
    public static long fact(int n)
    {
        if(n==0||n==1)
        {
            return 1;
        }
        else
        {
            return n*fact(n-1);
        }
    }
}