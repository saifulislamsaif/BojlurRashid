package averageMaxMin;

import java.util.Scanner;

public class AverageMaxMin {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("length of array");

        int sizeOfArray = input.nextInt();

        int[] numbers = new int[sizeOfArray];

        for (int i = 0; i < numbers.length; i++) {
            System.out.println( "Enter "+i + " : ");
            numbers[i] = input.nextInt();
        }

        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        double avg = sum / numbers.length;

        int min;
        int max;

        min = numbers[0];
        max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (min < numbers[i]) {
                min = numbers[i];
            }
            if (max > numbers[i]) {
                max = numbers[i];
            }
        }

        System.out.println("Sum of the Array " + sum);
        System.out.println("Average of the Array " + avg);
        System.out.println("Max of the Array " + max);
        System.out.println("Min of the Array " + min);

    }
}
