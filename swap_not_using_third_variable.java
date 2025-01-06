import java.util.*;
public class swap_not_using_third_variable {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("enter the first number");
        int first=S.nextInt();
        System.out.println("enter the second number");
        int second=S.nextInt();
        System.out.println("the numbers before swapping: "+first+" "+second);
        first+=second;
        second=first-second;
        first-=second;
        System.out.println("the numbers after swapping: "+first+" "+second);
        S.close();
    }
}