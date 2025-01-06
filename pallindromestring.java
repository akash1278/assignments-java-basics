import java.util.Scanner;
public class pallindromestring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any word");
        String str=sc.nextLine();
        int strLength  =str.length()-1;
        String revStr = "";
        for(int i = strLength; i >= 0; i--){
            revStr = revStr + str.charAt(i);
        }
        if(str.toLowerCase().equals(revStr.toLowerCase())){
            System.out.println("Word is Palindrome..");
        }else{
            System.out.println("word is not a palindrome..");
        }
        sc.close();
        
    }
    
}