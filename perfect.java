import java.util.Scanner;
public class perfect {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the number");
        int num=scan.nextInt();
        int perf=0;
        for(int i=1;i<num;i++){
            if(num%i==0){
                perf+=i;//perfect number is nothing but the sum of its factors
            }
        }
        if(num==perf)
        {
            System.out.println(num+" is a perfect number.");
        }
        else{
            System.out.println(num +" is not a perfect number.");
        }

    }
}