package exerciseofarray;

public class Exercise06 {
    public static void main(String[] args) {
        int[] numbers = {3, 1, 2, 3, 4, 5, 6, -17, 8, 9,
                35, 1, 2, 34, 4, 5, 6, -7, 8, 9,
                40, 1, 2, 3, -4, 5, 6, 7, -8, 9,
                81, -1, 2, 3, 4, 5, 6, 7, 8, 9,
                2, 1, 42, 3, 4, -95, 6, 7, 8, 39
        };

        int bigNumber = 0;

        for ( int i = 0; i < 50 ; i++ ){
            if ( numbers[i] > numbers[0] ) {
                bigNumber++;
                System.out.println("This number " + numbers[i] + " is biggar than the first one");
            }
            System.out.println("Number i: " + i);

        }
        System.out.println("There are " + bigNumber + " numbers in the array are bigger than the first one");


    }
}
