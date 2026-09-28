package exerciseofarray;

public class Exercise07 {
    public static void main(String[] args) {
        int[] numbers = {3, 1, 2, 3, 4, 5, 6, -17, 8, 9,
                35, 1, 2, 34, 4, 5, 6, -7, 8, 9,
                40, 1, 2, 3, -4, 5, 6, 7, -8, 9,
                81, -1, 2, 3, 4, 5, 6, 7, 8, 9,
                2, -1, 42, 3, 4, 95, 6, 7, 8, 39
        };

        int targetIndex = 0;

        for ( int i = 49 ; i >= 0 ; i-- ){
            if ( numbers[i] < 0 ) {
                targetIndex = i;
                break;
            }
        }

        System.out.println("Target index is " + targetIndex);

    }
}
