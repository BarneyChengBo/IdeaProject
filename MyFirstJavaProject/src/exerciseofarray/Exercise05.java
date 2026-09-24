package exerciseofarray;

public class Exercise05 {
    public static void main(String[] args) {
        int[] numbers = {-33, 1, 2, 3, 4, 5, 6, -17, 8, 9,
                35, 1, 2, 34, 4, 5, 6, -7, 8, 9,
                40, 1, 2, 3, -4, 5, 6, 7, -8, 9,
                81, -1, 2, 3, 4, 5, 6, 7, 8, 9,
                2, 1, 42, 3, 4, -95, 6, 7, 8, 39
        };

        int positive = 0;

        for( int i = 0; i < 50 ; i++) {
            if(numbers[i] > 0 ) {
                positive += 1;

            }
            System.out.println("Now we have i: " + i);
            System.out.println(numbers[i]);
            System.out.println("Number of positive numbers :" + positive );
        }

        System.out.println(positive);




    }
}
