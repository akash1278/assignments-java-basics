import java.util.*;
public class fibonacci_n {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("enter the number ");
        int num=scanner.nextInt();
        int first=0;
        int second=1;
        System.out.print(first+" "+second);
        for(int i=2;i<num;i++){
            int next=first+second;
            first=second;
            second=next;
            System.out.print(" "+next);
        }
        scanner.close();
    }
}