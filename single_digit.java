import java.util.Scanner;
public class single_digit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the number");
        int number=scan.nextInt();
        int temp=0;
        int sum=0;
        while(number!=0){
            temp+=number%10;
            if(temp > 9){
                sum+=temp%9;
                temp=sum;
                sum=0;
            }
            number=number/10;

        }
        System.out.println("the sum of numbers in single digit is : "+ temp);
        scan.close();
    }
}