// 02 Write a Java program to calculate factorial of given number.eg.3!=3*2*1=6

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input from user                                    
        System.out.print("Enter a number: ");       
        int num = sc.nextInt();

        int factorial = 1;

        // Calculating factorial using loop
        for(int i = 1; i <= num; i++) {            
            factorial *= i;
        }

         // Output
        System.out.println("Factorial of " + num + " is: " + factorial);     
    }
}
