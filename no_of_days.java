import java.util.*;
public class no_of_days {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int year;
        int month;
        System.out.println("enter the year");
        year=s.nextInt();
        System.out.println("enter the month from 1 to 12");
        month=s.nextInt();
        switch (month) {
            case 1:
                System.out.println(" for january, it has 31 days");
                break;
            case 2:
                if((year%400==0 ||year%100!=0)&&year%4==0){
                    System.out.println("for february, it has 29 days");

                }else{
                    System.out.println("for february, it has 28 days");
                    
                } 
                break;
            case 3:
                System.out.println(" for march, it has 31 days");
                break;
            case 4:
                System.out.println(" for april, it has 30 days");
                break;
            case 5:
                System.out.println(" for may, it has 31 days");
                break;
            case 6:
                System.out.println(" for june, it has 30 days");
                break;
            case 7:
                System.out.println(" for july, it has 31 days");
                break;
            case 8:
                System.out.println(" for august, it has 31 days");
                break;
            case 9:
                System.out.println(" for september, it has 30 days");
                break;
            case 10:
                System.out.println(" for october, it has 31 days");
                break;
            case 11:
                System.out.println(" for november, it has 30 days");
                break;
            case 12:
                System.out.println(" for december, it has 31 days");
                break;
            default:
                System.out.println("enter correct number");;
        }
        s.close();
    }
}