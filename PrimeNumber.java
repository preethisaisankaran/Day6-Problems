package Day6problems;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        int n;
        int count = 0;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the number");
        n = obj.nextInt();
        //if (n<2)
        // System.out.println("Not prime");
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            System.out.println("It is prime");
        } else {
            System.out.println("It is nort prime");
        }
    }
}
