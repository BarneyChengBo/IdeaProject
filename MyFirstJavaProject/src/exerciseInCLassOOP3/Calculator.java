package exerciseInCLassOOP3;

public class Calculator {
    private int n1;
    private int n2;

    public Calculator(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public int sumOfTwo() {

        return  n1 + n2  ;
    }

    //public void samOfTwo() {
    //     System.out.println("The sum of these two is " + ( n1 + n2 ));
    //}

    public int productOfTwo () {

        return  n1 * n2  ;
    }

    public int devision(){
        return  n1 / n2  ;
    }

    public int difference(){
        return n1 - n2 ;
    }

}
