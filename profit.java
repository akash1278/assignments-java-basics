import java.util.*;
public class profit {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.print("enter the buying price: ");
        int buy=s.nextInt();
        System.out.print("enter the selling price: ");
        int sell=s.nextInt();
        int balance=remain(buy, sell);
        if(buy>sell){
            System.out.println("the loss: "+balance);
        }
        else{
            System.out.println("the profit: "+balance);
        }
        s.close();
    }
    public static int remain(int value1,int value2)
    {
        if(value1>value2){
            return (value1-value2);
        }
        else{
            return (value2-value1);
        }
    }
}