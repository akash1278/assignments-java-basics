import java.util.*;
public class count_vowels {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("enter any thing to count ");
        String str=s.nextLine();
        int countv=0;
        int countc=0;
        int countd=0;
        int counts=0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||
            str.charAt(i)=='u'||str.charAt(i)=='A'||str.charAt(i)=='E'||str.charAt(i)=='I'||
            str.charAt(i)=='O'||str.charAt(i)=='U'){
               countv++;
            }
            else if(str.charAt(i)==' ')
            {
                counts++;
            }
            else if(str.charAt(i)=='0'||str.charAt(i)=='1'||str.charAt(i)=='2'||str.charAt(i)=='3'||str.charAt(i)=='4'
            ||str.charAt(i)=='5'||str.charAt(i)=='6'||str.charAt(i)=='7'||str.charAt(i)=='8'||str.charAt(i)=='9'){
                countd++;
            }
            else{
                countc++;
            }
        }
        System.out.println("the no.of vowels in string is: "+countv);
        System.out.println("the no.of consonants in string is: "+countc);
        System.out.println("the no.of digits in string is: "+countd);
        System.out.println("the no.of space in string is: "+counts);
        s.close();
    }
}