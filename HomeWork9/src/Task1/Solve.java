package Task1;

import java.util.Scanner;

public class Solve {
    public static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        int[] numArray = new int[50];
        int sum = 0;
        double average = 0.0;
        System.out.println("Please give me 50 numbers: ");
        for (int i = 0; i < numArray.length; i++) {
            System.out.print("Number " + (i+1) + ": ");
            int num = reader.nextInt();
            if((num < 20) && (num >= 0)){
                numArray[i] = num;
            }
            else {
                System.out.println("Please enter a whole number that is lower than 20!");
                i--;
            }
        }
        for (int j = 0; j < numArray.length ; j++) {
            sum += numArray[j];
        }
        average = (double) sum / (numArray.length);

        for (int k = 0; k < numArray.length; k++) {
            if (numArray[k] <= average){
                System.out.print(numArray[k] + ", ");
            }
        }
    }
}
