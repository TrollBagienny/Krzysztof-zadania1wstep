import java.util.Scanner;

public class zadanie9 {
    public static void main(String[] args) {
        String name;
        int age;
        double anualPay;
        Scanner dane = new Scanner(System.in);
//imie
        System.out.println("Podaj swoję imię: ");
        name = dane.nextLine();
//wiek
        System.out.println("Podaj swoj wiek: ");
        age = dane.nextInt();
        dane.nextLine();
//dochod
        System.out.println("Podaj oczekiwany roczny dochod: ");
        anualPay = dane.nextInt();
        dane.nextLine();
//wypisanie
        System.out.println("Nazywam się " + name + ". Mam " + age + " lat \ni chcę zarabiac " + anualPay);
    }
}
