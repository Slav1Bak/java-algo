import java.util.HashMap;
import java.util.Map;

public class MainMap {

    public static void main(String[] args) {
        //deklaracja mapy
        Map<String, Double> eq_prices = new HashMap<>();
        //dodanie wartosci d omapy
        eq_prices.put("Tapicerka skorzana", 7000.);
        eq_prices.put("Klima dwustrefowa", 3500.);
        eq_prices.put("ASB", 10000.);
        eq_prices.put("Lakier perlowy", 3000.);
        //wypisanie elementow mapy
        System.out.println(eq_prices);

        //zmiana ceny
        eq_prices.put("Lakier perlowy", 3500.);
        System.out.println(eq_prices);
        //rozmiar mapy
        System.out.println(eq_prices.size());
        //sprawdzanie wystepowania klucczy
        System.out.println(eq_prices.keySet());
        System.out.println(eq_prices.keySet().contains("Tapicerka skorzana"));
        System.out.println(eq_prices.keySet().contains("Tapicerka welurowa"));
        //sprawdzenie wartosci
        System.out.println(eq_prices.values());
//iterowanie po mapie
        for (Map.Entry<String, Double> eq : eq_prices.entrySet()) {
            System.out.println(eq.getKey() + " " + eq.getValue());
        }
//usuwanie z mapy
        eq_prices.remove("Lakier perlowy");
        System.out.println(eq_prices);

        // suma koszzto
        double sum = 0;
        for (Map.Entry<String, Double> eq : eq_prices.entrySet()) {
            sum += eq.getValue();
        }
        System.out.println("Suma za full " + sum);
    }
}

