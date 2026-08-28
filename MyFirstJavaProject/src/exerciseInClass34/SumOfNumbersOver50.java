package exerciseInClass34;

public class SumOfNumbersOver50 {

    public static void main(String[] args) {
        //ett tal i taget med start ifrån 0.
        int n = 0;
        //När summan av alla tidigare tal är mer än 50 ska programmet avsluta.
        for ( int i = 0; i < 50; i++) {
          n = n + i;
            System.out.println(i);
          if ( n > 50 ) {
              System.out.println(n);
              break;
          }
        }
    }

}
