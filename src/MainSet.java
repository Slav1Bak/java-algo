import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MainSet {
    public static void main(String[] args) {
        //deklaracja zbioru
        Set<String> pesels = new HashSet<>();
        Set<String> pesels_Bydgoszcz = new HashSet<>(Arrays.asList("2222", "3333", "4223", "1134", "4255"));
        //dodawanie do zbioru
        System.out.println("Dodano? " + pesels.add("1234"));
        System.out.println("Dodano? " + pesels.add("1534"));
        System.out.println("Dodano? " + pesels.add("1254"));
        System.out.println("Dodano? " + pesels.add("1334"));
        System.out.println("Dodano? " + pesels.add("1134"));
        System.out.println("Dodano? " + pesels.add("1234"));
        System.out.println("Lista\n" + pesels);

        //sprawdzenie przynaleznosci do zbioru
        System.out.println("Czy jest taki w zbiorze? " + pesels.contains("1234"));
        System.out.println("Czy jest taki w zbiorze? " + pesels.contains("1934"));
        //usuniecie wartosci
        pesels.remove("1234");
        System.out.println(pesels);
        System.out.println();
        //suma zbiorow
        Set<String> temp = new HashSet<>();
        temp.addAll(pesels_Bydgoszcz);
        temp.addAll(pesels);
        System.out.println("Po dodaniu tych z Bdg " + pesels + "+" + pesels_Bydgoszcz + "=" + temp);
        //usuwamy 1 zbior
        Set<String> removed = new HashSet<>();
        removed.addAll(temp);
        System.out.println(removed);
        removed.removeAll(pesels);
        System.out.println("po usunieciu; " + removed);
        //szukanie czesci wspolnej
        Set<String> wsp = new HashSet<>();
        wsp.addAll(pesels);
        wsp.retainAll(pesels_Bydgoszcz);
        System.out.println("czesc wspolna " + wsp);
    }
}