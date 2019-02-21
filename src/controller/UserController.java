package controller;

import model.UserModel;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;

public class UserController {
    //kolekcja, metody addUser symulujaca rejestracje w bazie- podaje login, haslo i zwraca boolean czy zostal zarejsetrowany do bazyw czy nie
    //metoda showUsers wyswietlajaca w petli wwsystkich uzytkownikow

    private List<UserModel> registered_users = new ArrayList<>();
    private Set<String> registrated_login = new HashSet<>();

    public boolean addUser(String login, String password) {
        if (registrated_login.contains(login)) {
            System.out.println("Podany login istnieje");
            return false;
        }
        UserModel u = new UserModel(login, password);
        registered_users.add(u);
        registrated_login.add(login);
        System.out.println("Zarejestrowano uzytkownika");
        return true;
    }

    public void showUsers() {
        registered_users.forEach(userModel -> System.out.println(userModel));
    }

    public boolean deleteUser(String login_delete) {
        for (int i = 0; i < registered_users.size(); i++) {
            if (registered_users.get(i).getLogin().equals(login_delete)) {
                registered_users.remove(registered_users.get(i));
                registrated_login.remove(login_delete);
                System.out.println("Usunieto uzytkownika " + login_delete);
                return true;
            }
        }
        System.out.println("nie ma takiego");
        return false;
    }

    public boolean passwowrdCheck(String newPassword1) {
        //dlugos hasla co najmniej 6 znakow,  a max 32 znaki
        String template = ".{6,32}";
        return Pattern.matches(template, newPassword1);
    }
    //musi byc 1 wielka i 1 cyfra
   public boolean passwordChecker(String newestPassword){
        //cyfra
        String template2=".*\\d+.*";
        //wielka litera
       String template3 =".*[A-Z]+.*";
                return Pattern.matches(template2,newestPassword) && Pattern.matches(template3,newestPassword);
   }

    public boolean changePassword(String login, String oldPassword, String newPassword, String newPassword2) {
        for (int i = 0; i < registered_users.size(); i++) {
            if (registered_users.get(i).getLogin().equals(login) && registered_users.get(i).getPassword().equals(oldPassword)) {
                if (newPassword.equals(newPassword2) && !newPassword.equals(oldPassword)) {
                    if (passwowrdCheck(newPassword) && passwordChecker(newPassword)) {
                        registered_users.get(i).setPassword(newPassword);
                        System.out.println("haslo zostalo zmienione");
                        return true;
                    }

                }
                System.out.println("Hasla sa rozne lub takie same jak stare haslo, lub jest za krotkie");
                return false;
            }


        }
        System.out.println("Taki uzytkownik nie istnieje lub bledne haslo ");
        return false;
    }

    //  public void changePassword

    /// {
    //poszukac po kolekcji
    //wpisac stare haslo
    //podac nowe
    //}

}
