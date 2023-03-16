import java.sql.SQLOutput;

public class Zadanie5 {
    public static void main(String[] args){

        System.out.println("Pomieszczenie nr1 ma wymiary: 3m X 4m");
       int pokoj1,pokoj2,pokoj3,pokoj4,calkowita;
       pokoj1=3*4;
        System.out.println("Powierzchnia pomieszczenia nr1 to: " + pokoj1 + "m2");
        System.out.println();

        System.out.println("Pomieszczenie nr2 ma wymiary: 3m X 4m");
        pokoj2=3*4;
        System.out.println("Powierzchnia pomieszczenia nr2 to: " + pokoj2 + "m2");
        System.out.println();

        System.out.println("Pomieszcznie nr3 ma wymiary: 2m X 3m");
        pokoj3=2*3;
        System.out.println("Powierzchnia pomieszczenia nr3 to: " + pokoj3 + "m2");
        System.out.println();

        System.out.println("Pomieszczenie nr4 ma wymiary: 2m X 2m");
        pokoj4=2*2;
        System.out.println("Powierzchnia pomieszczenia nr4 to: " + pokoj4 + "m2");
        System.out.println();

        calkowita=pokoj1+pokoj2+pokoj3+pokoj4;
        System.out.println("Powierzchnia calkowita wynosi: " +calkowita + "m2");


    }
}
