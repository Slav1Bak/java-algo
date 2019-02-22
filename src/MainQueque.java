import java.time.LocalTime;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.NoSuchElementException;
import java.util.Queue;

public class MainQueque {
    public static void main(String[] args) {
        //deklaracja koleklo
        Queue<LocalTime> times = new ArrayDeque<>();
        //dodawanie wartosci do kolejnki
        times.add(LocalTime.now());
        times.add(LocalTime.now());
        times.add(LocalTime.now());
        times.add(LocalTime.now());
        times.add(LocalTime.of(12, 00, 00));
        //odczyt wartosci z kolejki
        System.out.println(times);
        //usuwanie elementow  z kolejki
        System.out.println("usuniecie najstarszego elementu kolejki: " + times.remove());
        System.out.println(times);
        //------------------------
        //kolejka dwukierunkowa
        Deque<String> people = new ArrayDeque<>();
        //dodawanie elementow
        people.addFirst("Anna");   ///removeFirst
        people.addLast("Janusz");   /// removeLast
        people.addLast("Bartek");
        people.addFirst("Aga");
        people.addFirst("Alan");
        people.addLast("Seba");
        try {
            while (people.getLast() != null) {
                System.out.println(people.removeLast());
            }
        } catch (
                NoSuchElementException e) {
            System.out.println("koniec kolejki");
        }
        System.out.println("druga petla");

    }
}
