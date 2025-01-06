import java.util.*;
public class anagram {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("enter the first word");
        String s1=s.nextLine();
        System.err.println("enter the second word");
        String s2=s.nextLine();
        if(anag(s1,s2)){
            System.out.println(s1+" and "+s2+" are anagrams");
        }
        else{
            System.out.println(s1+" and "+s2+" are not anagrams");
        }
        
        s.close();
    }
    public  static boolean anag(String s1,String s2){
        s1=s1.replaceAll("\\s", "").toLowerCase();
        s2=s2.replaceAll("\\s", "").toLowerCase();
        char[] arr1= s1.toCharArray();
        char[] arr2=s2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);
    }
}