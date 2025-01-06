import java.util.*;
public class interchange {
    public static void main(String[] args) {
        Scanner  s = new Scanner(System.in);
        System.out.println("enter the number");
        int num=s.nextInt();
        int result=inter(num);
        System.out.println(" the interchange number is "+ result);
        s.close();
    }
    public static int inter(int num){
        String str=Integer.toString(num);
        if(str.length()==1) return Integer.parseInt(str);
        else
        {
            char st=str.charAt(0);
            char last=str.charAt(str.length()-1);
            String n=last+str.substring(1, str.length()-1)+st;
            return Integer.parseInt(n);


        }
    }
}