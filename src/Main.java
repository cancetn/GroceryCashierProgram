import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Patika.dev egitim kampi proje odevidir.
        //if else dongu kullanilmadan yapilmasi istenmektedir.

        double armut = 2.14, elma = 3.67, domates = 1.11, muz = 0.95, patlican = 5.00;
        double armutKilo, elmaKilo, domatesKilo, muzKilo, patlicanKilo;

        Scanner inp = new Scanner(System.in);

        System.out.println("Kac kilo armut aldiniz ? (Kg fiyati 2.14) = ");

        armutKilo = inp.nextDouble();

        Scanner inp1 = new Scanner(System.in);

        System.out.println("Kac kilo elma aldiniz ? (Kg fiyati 3.67) = ");

        elmaKilo = inp1.nextDouble();

        Scanner inp2 = new Scanner(System.in);

        System.out.println("Kac kilo domates aldiniz ? (Kg fiyati 1.11) = ");

        domatesKilo = inp2.nextDouble();

        Scanner inp3 = new Scanner(System.in);

        System.out.println("Kac kilo muz aldiniz ? (Kg fiyati 0.95) = ");

        muzKilo = inp3.nextDouble();

        Scanner inp4 = new Scanner(System.in);

        System.out.println("Kac kilo patlican aldiniz ? (Kg fiyati 5.00) = ");

        patlicanKilo = inp4.nextDouble();

        double toplam;

        toplam = (armut * armutKilo) + (elma * elmaKilo) + (domates * domatesKilo) + (muz * muzKilo) + (patlican * patlicanKilo);

        System.out.println("Toplam tutar = "+toplam +"TL");




    }
}
