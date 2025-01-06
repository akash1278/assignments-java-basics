import java.util.Scanner;
public class fibonacci {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("enter the number 0f rows");
        int num=scanner.nextInt();
        int first=0;
        int second=1;
        for(int i=0;i<=num;i++){
            for(int j=0;j<i;j++){
                System.out.print(first+" ");
                int next=first+second;
                first=second;
                second=next;
            }
            System.out.println();
        }
        scanner.close();
    }
}