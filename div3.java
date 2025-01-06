import java.util.Scanner;
public class div3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number more than 3 digits");
        int number=sc.nextInt();
        String str= Integer.toString(number);
        String lt="";
        int count=str.length();
        if(count>3){
            for(int i=3;i>0;i--){
                lt+=str.charAt(count-i);
            }
        }
        else{
            System.out.println("enter the correct number");
        }
        Integer dig=Integer.parseInt(lt);
        System.out.println("the last three digits of the number is :  "+dig);
        if(dig%3 == 0){
            System.out.println("the number is divisible by 3");
        }
        else{
            System.out.println("not divisible by 3");
        }
        sc.close();
    }
   
}