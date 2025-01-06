import java.util.*;
public class lcm_of_n_numbers {
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }
    public static int findLCM(int[] numbers) {
        int result = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            result = lcm(result, numbers[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the no of elements: ");
        int n = s.nextInt();

        int[] numbers = new int[n];
        System.out.println("Enter numbers :");
        for (int i = 0; i < n; i++) {
            numbers[i] = s.nextInt();
        }
        int lcm = findLCM(numbers);
        System.out.println("The LCM of the given numbers is : " + lcm);
        s.close();
    }
}