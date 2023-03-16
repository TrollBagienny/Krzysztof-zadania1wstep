public class Zadanie6 {
    public static void main(String[] args) {
        System.out.println("Pomieszczenie nr1 ma wymiary: 3m X 4m");
        int pokoj1,pokoj2,pokoj3,pokoj4,calkowita,naosobe1,naosobe2,naosobe3,naosobe4,naosobecalkowita;

        //pokoj 1

        pokoj1=3*4;
        naosobe1=(3*4)/4;
        System.out.println("Powierzchnia pomieszczenia nr1 to: " + pokoj1 + "m2");
        System.out.println("Powierzchnia przypadajaca na 1 osobe w pokoju nr1 wynosi: " + naosobe1 + "m2");
        System.out.println();

        //pokoj 2

        System.out.println("Pomieszczenie nr2 ma wymiary: 3m X 4m");
        pokoj2=3*4;
        naosobe2=(3*4)/4;
        System.out.println("Powierzchnia pomieszczenia nr2 to: " + pokoj2 + "m2");
        System.out.println("Powierzchnia przypadajaca na 1 osobe w pokoju nr2 wynosi: " + naosobe2
                + "m2");
        System.out.println();

        //pokoj 3

        System.out.println("Pomieszcznie nr3 ma wymiary: 2m X 3m");

        pokoj3=2*3;
        naosobe3=(2*3)/4;
        System.out.println("Powierzchnia pomieszczenia nr3 to: " + pokoj3 + "m2");
        System.out.println("Powierzchnia przypadajaca na 1 osobe w pokoju nr3 wynosi: " + naosobe3 + "m2");
        System.out.println();

        //pokoj 4

        System.out.println("Pomieszczenie nr4 ma wymiary: 2m X 2m");
        pokoj4=2*2;
        naosobe4=(2*2)/4;
        System.out.println("Powierzchnia pomieszczenia nr4 to: " + pokoj4 + "m2");
        System.out.println("Powierzchnia przypadajaca na 1 osobe w pokoju nr4 wynosi: " + naosobe4 + "m2");
        System.out.println();

        //calkowita

        calkowita=pokoj1+pokoj2+pokoj3+pokoj4;
        naosobecalkowita=calkowita/4;
        System.out.println("Powierzchnia calkowita wynosi: " +calkowita + "m2");
        System.out.println("Powierzchnia calkowita na 4 osoby wynosi: " + naosobecalkowita + "m2");
    }
}
