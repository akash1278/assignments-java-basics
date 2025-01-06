import java.util.Scanner;
public class natural {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("enter the number");
        int number=scan.nextInt();
        int sum=0;
        for(int i=1;i<=number;i++){
            sum+=i;
        }
        System.out.println("the sum of N naturl numbers is : "+ sum);
        scan.close();
    }
}