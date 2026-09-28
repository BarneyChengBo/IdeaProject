package exerciseofarray;

public class Exercise08 {
    public static void main(String[] args) {
        int[] numbers = {3, 1, 2, 3, 4, 5, 6, -17, 8, 9,
                35, 1, 2, 34, 4, 5, 6, -7, 8, 9,
                40, 1, 2, 3, -4, 5, 6, 7, -8, 9,
                81, -1, 2, 3, 4, 5, 6, 7, 8, 9,
                2, -1, 42, 3, 4, 95, 6, 7, 8, 39,
                2, -1, 42, 3, 4, 95, 6, 7, 8, 39,
                99,999,99,99,99,99,99,9
        };

        int sum = 0;


        for ( int i = 0; i < numbers.length; i ++) {
            sum = sum + numbers[i];
        }

        int average = sum / numbers.length;

        System.out.println("The toal is " + sum);
        System.out.println("The average is " + average );



    }
}
