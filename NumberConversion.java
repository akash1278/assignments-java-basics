
// import java.util.Scanner;

// public class numberConversion {

//     public static String decimalToHexadecimal(int decimal) {
//         return Integer.toHexString(decimal).toUpperCase();
//     }

//     public static String hexadecimalToOctal(String hex) {
//         int decimal = Integer.parseInt(hex, 16);
//         return Integer.toOctalString(decimal);
//     }

//     public static String octalToBinary(String octal) {
//         int decimal = Integer.parseInt(octal, 8);
//         return Integer.toBinaryString(decimal);
//     }

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         System.out.print("Enter a decimal number: ");
//         int decimal = scanner.nextInt();

//         System.out.print("Enter a hexadecimal number: ");
//         String hex = scanner.next();

//         System.out.print("Enter an octal number: ");
//         String octal = scanner.next();

//         System.out.println("Decimal to Hexadecimal: " + decimalToHexadecimal(decimal));

//         System.out.println("Hexadecimal to Octal: " + hexadecimalToOctal(hex));

//         System.out.println("Octal to Binary: " + octalToBinary(octal));

//         scanner.close();
//     }
// }

import java.util.Scanner;

public class NumberConversion {

    public static String convertDecimalToHexadecimal(int decimal) {
        return Integer.toHexString(decimal).toUpperCase();
    }

    public static int convertHexadecimalToDecimal(String hex) {
        return Integer.parseInt(hex, 16);
    }

    public static String convertDecimalToOctal(int decimal) {
        return Integer.toOctalString(decimal);
    }

    public static String convertDecimalToBinary(int decimal) {
        return Integer.toBinaryString(decimal);
    }

    public static String convertHexToOctal(String hex) {
        int decimal = convertHexadecimalToDecimal(hex);
        return convertDecimalToOctal(decimal);
    }

    public static String convertOctalToBinary(String octal) {
        int decimal = Integer.parseInt(octal, 8);
        return convertDecimalToBinary(decimal);
    }

    public static void displayConversions(int decimal, String hex, String octal) {
        System.out.println("Decimal to Hexadecimal: " + convertDecimalToHexadecimal(decimal));
        System.out.println("Hexadecimal to Octal: " + convertHexToOctal(hex));
        System.out.println("Octal to Binary: " + convertOctalToBinary(octal)); // Display direct binary values
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a decimal number: ");
        int decimal = scanner.nextInt();

        System.out.print("Enter a hexadecimal number: ");
        String hex = scanner.next();

        System.out.print("Enter an octal number: ");
        String octal = scanner.next();

        displayConversions(decimal, hex, octal);

        scanner.close();
    }
}
