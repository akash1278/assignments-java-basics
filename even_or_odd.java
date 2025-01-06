import  java.util.Scanner;
public class even_or_odd {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the number: ");
        int number = s.nextInt();
        String result=(number%2==0)?"even":"odd";
        System.out.println("the number is "+result);
        s.close();
    }
}