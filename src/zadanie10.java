import java.util.Scanner;
public class zadanie10 {
    public static void main(String[] args) {
        String pierwszeimie, drugieimie, ostatnieimie;

        Scanner dane = new Scanner(System.in);
//imie
        System.out.println("Podaj swoję imię: ");
        pierwszeimie = dane.nextLine();
//drugie imie
        System.out.println("Podaj swoję drugie imię: ");
        drugieimie = dane.nextLine();
//nazwisko
        System.out.println("Podaj swoję nazwisko: ");
        ostatnieimie = dane.nextLine();
//czary mary
        char firstInitial = pierwszeimie.charAt(0), middleInitial = drugieimie.charAt(0), lastInitial = ostatnieimie.charAt(0);

        System.out.println("Twoje imie: " + pierwszeimie + ". drugie imie: " + drugieimie + ". nazwisko: " + ostatnieimie);
        System.out.println("Twoje inicjaly: " + firstInitial + middleInitial + lastInitial);
    }
}