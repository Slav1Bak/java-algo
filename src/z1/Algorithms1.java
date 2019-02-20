package z1;

public class Algorithms1 {
    //algorytm potegowania zadanie 1
    public int power(int x, int y) {
        int result = 1;
        for (int i = 1; i <= y; i++) {
            result = result * x;

        }
        return result;
    }

    //zadanie 2
    public int factorial(int n) {
        int resultn = 1;
        for (int i = 1; i <= n; i++) {
            resultn = resultn * i;
        }

        return resultn;
    }

    //zadanie 3
    public double geoSequence(int a0, int q, int n) {
        int sum = 0;
        for (int i = 0; i <= n - 1; i++) {
            sum = sum + (a0 * power(q, i));

        }
        return sum;

    }

    public double geoAritmetic(int a0, int r, int n) {
        int sum = 0;
        for (int i = 0; i <= n - 1; i++) {
            sum = sum + (a0 + i * r);
        }
        return sum;
    }

    public boolean perfectNum(int d) {
        int sum = 0;
        for (int i = 1; i < d; i++) {
            if (d % i == 0) {
                sum = sum + i;
            }
        }
        return d == sum ? true : false;
    }

    public int getNWD(int x, int y) {
        //sprawdzenie ktora mniejsza
        int less = x;
        int greather = y;
        if (x > y) {
            less = y;
            greather = x;
        }
        // 2. iterujemy w petli i sprawdzamy czy dzielnik less jest dzielnikiem greather
        for (int i = less; less > 1; i--) {
            if (less % i == 0 && greather % i == 0) {
                return i;
            }
        }
        return 1;
    }

    public String decimalToBinary(int decimal) {
        String binary = "";
        while (decimal >= 1) {
            binary = binary.concat(String.valueOf(decimal % 2));
            decimal = decimal / 2;

        }
        //odwrocenie liczby
        //string buffer pozwala na modyfikacje zawartosci tablicy
        StringBuffer sb = new StringBuffer(binary);
        return sb.reverse().toString();
    }
    public int binaryToDecimal(String binary) {
        int decimal = 0;
        for (int i = 0; i < binary.length(); i++) {
            decimal = decimal + (((int) binary.charAt(i) - 48) * power(2, (binary.length()-1) - i));
        }
        return decimal;

    }
    public boolean isPrimary(int number){
        int counter = 0;
        // inicjalizacja licznika podzielnikow
        //for zliczamy wszystkie l naturalne do liczby number
        //sprawdzajac czy te liczby sa dzielnikami number
        //tak ++
        //nie nic
        //zwracamy true jesli licznik ==0; false jesli licznik >0


        for (int i =2;i< number; i++){
            if(number % i == 0){
                counter++;

            }
        }
        return counter == 0 ? true: false;
    }
}
