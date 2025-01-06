import java.util.Scanner;
public class prime {
    public static void main(String[] args) {
        Scanner st=new Scanner(System.in);
        System.out.println("enter the number");
        int num=st.nextInt();
        if(num<2){
            System.out.println(num +" enter a number more than one");
        }
        else if(num==2){
            System.out.println(num+" prime number");
        }
        else{
            int count=0;
            for(int i=2;i<num;i++){
                if(num%i==0){
                    count++;
                    break;
                }
            }
            if(count==0){
                System.out.println(num +" is a prime number");
    
            }
            else{
                System.out.println(num+" not a prime");
            }
        }
        
    }
}