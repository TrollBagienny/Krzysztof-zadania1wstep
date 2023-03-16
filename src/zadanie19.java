import java.util.Scanner;
public class zadanie19 {
    public static void main(String[] args) {
        int iloscludzi = 12467;
        System.out.println("Ilosc osob w ankiecie : " + iloscludzi);
        double iloscosenerge = iloscludzi * 0.14;
        System.out.println("Ilosc osob kupujacych energetyki : " + iloscosenerge);
        double cytrusy = iloscosenerge*0.64;
        System.out.println("Ilosc osob wybierajacych smak cytrusowy : " + cytrusy);
    }
}
