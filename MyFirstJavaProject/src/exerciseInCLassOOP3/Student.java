package exerciseInCLassOOP3;

public class Student {
    //Konstruktorn ska ta in namn och årskurs.
    //Skapa en metod promote som ökar årskursen med 1.
    // Skapa en metod som skriver ut vilket stadie man går på (Lågstadiet, mellanstadiet osv.)
    // Skapa ett Student-objekt och låt det gå upp en årskurs i main-metoden. Skriv ut årskurs och stadie ifrån mainmetoden.

    private String name;
    private int grade;

    public Student(String name,int grade){
        this.name = name;
        this.grade = grade;

    }

    public int promotGrade() {
        return grade ++ ;
    }

    public void printLevel() {
        System.out.println("His grade is " + grade );
        System.out.println("He is in Middle level.");
    }


}
