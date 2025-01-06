import java.util.Scanner;
public class temperature {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the temperature in celsius");
        float temp=s.nextFloat();
        float fahrenheit=((temp*9)/5)+32;
        System.out.println("the temperature in fahrenheit is "+fahrenheit);
        System.out.println("enter the temperature in fahrenheit");
        temp=s.nextFloat();
        float celsius=(temp - 32) * 5 / 9;
        System.out.println("the temperature in celsius is "+celsius);
        s.close();

    }
}