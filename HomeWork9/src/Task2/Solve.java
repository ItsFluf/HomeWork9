package Task2;

import java.util.Scanner;

public class Solve {
    public static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Please give me a number: ");
        int num = reader.nextInt(), primesCount = 0;
        for (int i = 2 ; i <= num ; i++){
            boolean isPrime = true;
            for (int j = 2 ; j <= Math.sqrt(i) ; j++){
                if(i % j == 0){
                    isPrime = false;
                }
            }
            if (isPrime){
                System.out.print(i + ", ");
                primesCount++;
            }
        }
        System.out.println();
        System.out.println("There are " + primesCount + " prime number from 1 to " + num + ".");
    }
}
