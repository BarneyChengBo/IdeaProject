package exerciseofarray;

public class Exercise03 {
    public static void main(String[] args) {
        int[] numbers = {3, 1, 2, 3, 4, 5, 6, 7, 8, 9,
                0, 1, 2, 3, 4, 5, 6, 7, 8, 9,
                0, 1, 2, 3, 4, 5, 6, 7, 8, 9,
                0, 1, 2, 3, 4, 5, 6, 7, 8, 9,
                0, 1, 2, 3, 4, 5, 6, 7, 8, 99
        };

        int bigNumber = 0;

        for (int i = 0 ; i < 50; i++) {

            System.out.println(numbers[i]);
                if (numbers[i] > numbers[0]) {
                    bigNumber += 1;
                }
            System.out.println("Nu är i: " + i);
            System.out.println("Nu är bigNumber: " + bigNumber);
        }




    }
}
