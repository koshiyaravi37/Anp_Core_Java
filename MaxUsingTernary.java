// 01 Write Java Program to find maximum number using ternary operator

public class MaxUsingTernary {
    public static void main(String[] args) {
        int num1 = 45;
        int num2 = 78;

        // Using ternary operator to find maximum
        int max = (num1 > num2) ? num1 : num2;

        System.out.println("The maximum number is: " + max);
    }
}
