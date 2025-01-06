import java.util.*;
public class simple_calculator {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int one,two,temp;
        int count=0;

        do {
            System.out.println("enter the operation which you want to do:");
            System.out.println("For Addition : 1");
            System.out.println("For Subtraction : 2");
            System.out.println("For Multliplication : 3");
            System.out.println("For Divison : 4");
            System.out.println("For Modulo divison : 5");
            int num =s.nextInt(); 
            switch (num) {
                case   1:
                    System.out.println("enter the first number: ");
                    one=s.nextInt();
                    System.out.println("enter the Second number: ");
                    two=s.nextInt();
                    System.out.println("the addition= "+(one+two));
                    break;
                case 2:
                    System.out.println("enter the first number: ");
                    one=s.nextInt();
                    System.out.println("enter the Second number: ");
                    two=s.nextInt();
                    System.out.println("the subtraction= "+(one-two));
                    break;
                case 3:
                    System.out.println("enter the first number: ");
                    one=s.nextInt();
                    System.out.println("enter the Second number: ");
                    two=s.nextInt();
                    System.out.println("the multiplication= "+(one*two));
                    break;
                case 4:
                    System.out.println("enter the first number: ");
                    one=s.nextInt();
                    System.out.println("enter the Second number: ");
                    two=s.nextInt();
                    System.out.println("the divison= "+(one/two));
                    break;
                case 5:
                    System.out.println("enter the first number: ");
                    one=s.nextInt();
                    System.out.println("enter the Second number: ");
                    two=s.nextInt();
                    System.out.println("the Modulo Divison= "+(one%two));
                    break;     
                default:
                    System.out.println("enter correct operation");
            }
            System.out.println("do you want to continue or not ?");
            System.out.println("if yes enter 1 else enter 0");
            temp=s.nextInt();
            if(temp==1){
                count++;
            }
            else{
                count=0;
            }
        } while (count!=0);
        s.close();
    }
}