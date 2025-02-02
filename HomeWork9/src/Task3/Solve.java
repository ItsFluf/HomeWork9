package Task3;

import java.util.Scanner;

public class Solve {
    public static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("what is the length of the array?");
        int arrayLength = reader.nextInt();
        int[] numArray = new int[arrayLength];
        System.out.println("please give me " + arrayLength + " numbers: ");
        for (int i = 0; i < arrayLength; i++) {
            System.out.print("number " + (i+1) + ": ");
            int num = reader.nextInt();
            numArray[i] = num;
        }
        int lengthOfLongestSeries = longestSeries(numArray);
        System.out.println("The length of the longest ascending order series is: " + lengthOfLongestSeries);
    }
    public static int longestSeries(int[] arr){
        if( arr.length == 0){
            return 0;
        }
        int currentLength = 1, maxLength = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] >= arr[i-1]){
                currentLength++;
                maxLength = Math.max(currentLength, maxLength);
            }
            else {
                currentLength = 1;
            }
        }
        return maxLength;
    }
}
