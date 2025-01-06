import java.util.Scanner;
public class amstrong {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the number ");
       int num=scan.nextInt();
       int n=num;
        String str=Integer.toString(num);
        int length=str.length();
        int arm=0;
        while(num!=0)
        {
            int temp=num%10;
            arm+=Math.pow(temp,length);//amstrong number means sum of power of its digits
            num/=10;

        }
        if(n==arm)
        {
            System.out.println(n +" is an armstrong number");
        }
        else{
            System.out.println(n+" is not an armstrong number");
        }
        

    }
}