import controller.MessageController;

import java.util.Scanner;

public class MainMessage {
    public static void main(String[] args) {
        MessageController mc = new MessageController();
//        System.out.println("Twoja poczta glosowa");
//        System.out.println("masz " + mc.getSize() + " nowych wiadomosci");
//        System.out.println("1. odczytaj wiadomosc \n2. usun wiadomosc \n3. dodaj wiadomosc  \n0. wyjdz");
        Scanner sc = new Scanner(System.in);
        int decision = -1;
        while (decision != 0) {
            System.out.println("Twoja poczta glosowa");
            System.out.println("masz " + mc.getSize() + " nowych wiadomosci");
            System.out.println("1. odczytaj wiadomosc \n2. usun wiadomosc \n3. dodaj wiadomosc  \n0. wyjdz");
            decision = sc.nextInt();
            sc.nextLine();
            switch (decision) {
                case 1:
                    mc.getMessage();
                    break;
                case 2:
                    mc.deleteMessage();
                    break;
                case 3:
                    System.out.println("podaj adresata");
                    String author = sc.nextLine();
                    System.out.println("podaj tresc");
                    String content = sc.nextLine();
                    mc.addMessage(content, author);
                    System.out.println("zapisano wiadomosc");
                    break;
                case 0:
                    System.out.println("dziekuje");
                    break;
                default:
                    break;
            }
        }
    }
}
