package exerciseofarray;

public class Exercise04 {


    public static void main(String[] args) {
        int[] numbers = {33, 1, 2, 3, 4, 5, 6, 17, 8, 9,
                0, 1, 2, 34, 4, 5, 6, 7, 8, 9,
                40, 1, 2, 3, 4, 5, 6, 7, 8, 9,
                0, 1, 2, 3, 4, 5, 6, 7, 8, 9,
                0, 1, 42, 3, 4, 95, 6, 7, 8, 39
        };



        for (int i= 0; i < 50 ; i += 2){
            numbers[i] += 2;
        }
        for ( int i = 0 ; i < 50; i ++){

            System.out.println(numbers[i]);
            System.out.println("Nu är i : " + i );
        }



    }






}
