package z1;

public class Main {
    public static void main(String[] args) {
        Algorithms1 a = new Algorithms1();
        System.out.println("Wynik potegowania " + a.power(2,5));
        System.out.println("Silnia wynosi " + a.factorial(4));
        System.out.println("suma ciagu geo " + a.geoSequence(2,2,4));
        System.out.println("suma ciagu aryt " + a.geoAritmetic(2,2,4));
        System.out.println("Czy ta liczba jest doskonala? " + a.perfectNum(6));
        System.out.println("Najwiekszy wspolny dzielnik to " + a.getNWD(12,6));
        System.out.println("DtB " + a.decimalToBinary(12));
        System.out.println("BtD " + a.binaryToDecimal("1100"));
        System.out.println("Czy to liczba pierwsza? " + a.isPrimary(15));

    }
}
