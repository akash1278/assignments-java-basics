import java.util.*;
public class lcm_and_hcf {
    public static int hcf(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return hcf(b, a % b);
        }
    }

    public static int lcm(int a, int b) {
        return (a * b) / hcf(a, b);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter a value : ");
        int num1 = s.nextInt();
        System.out.print("Enter b value : ");
        int num2 = s.nextInt();

        int hcfValue = hcf(num1, num2);
        int lcmValue = lcm(num1, num2);

        System.out.println("HCF of " + num1 + "," + num2 + " is : " + hcfValue);
        System.out.println("LCM of " + num1 + "," + num2 + " is : " + lcmValue);
        s.close();
    }
}