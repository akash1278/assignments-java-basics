import java.util.Scanner;
public class factors {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("enter the number to get its factors: ");
        int number=scan.nextInt();
        int count=0;
        System.out.print("the factors of "+number+" is :");
        for(int i=2;i<number;i++){
            if(number%i==0){
                System.out.print(i+" ");
                count++;
            }
        }
        if(count==0){
            System.out.print(" 1 "+ number);
        }
        scan.close();
    }
}