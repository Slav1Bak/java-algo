import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Collections {
    public static void main(String[] args) {
        System.out.println("JCollections");
        //utworzenie pustej listy owocow
       List<String> fruits = new ArrayList<>();
       //sprawdzenie rozmiaru listy
        System.out.println("Rozmiar listy: " + fruits.size());
        //dodawanie do listy
        fruits.add("Jabłko");
        fruits.add("Gruszka");
        fruits.add("Pomidor");
        fruits.add("Mandarynka");
        fruits.add("Ogórek");
        //dodawanie na dowolnym indeksie
        fruits.add(1,"Mango");
        //wypisanie zawartosci tablicy
        System.out.println(fruits);
        System.out.println("Rozmiar listy: " + fruits.size());
        //wyrazenie lambda
        fruits.forEach(f -> System.out.print(f + " "));
        //to samo
        System.out.println();
        System.out.println("For each");
        for (String f : fruits){
            System.out.print(f+ " ");
        }
        //modyfikacja wartosci w liscie
        fruits.set(1,"Kaka");
        System.out.println();
        System.out.println(fruits.get(1));
        System.out.print(fruits + " ");
        //usuwanie
        fruits.remove("Gruszka");
        fruits.remove(0);
        System.out.println();
        System.out.println(fruits);
        System.out.println(fruits.get(0));
        //innicjalizowanie listy watosciami poczatkowymi
        List<String> brands = new ArrayList<>(Arrays.asList("BMW", "Audi", "VW", "Toyota"));
        brands.add("Porsche");
        System.out.println(brands);


    }
}
