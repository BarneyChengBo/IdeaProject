package exerciseofarray;

public class Exercise11 {
    public static void main(String[] args) {

        int[] numbers = {3, 1, 2, 3, 4, 5, 6, -17, 8, 9,

        };

        int[] reversenumber = new int[10];

        for ( int i = 0 ; i < 10 ; i++ ){
            reversenumber[i] = numbers[ 9 - i];

        }

        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();


        for (int num : reversenumber) {
            System.out.print(num + " ");
        }





    }

}