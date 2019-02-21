import controller.StringControler;
        import controller.UserController;

import java.util.Random;
import java.util.Scanner;
        import java.util.regex.Pattern;

public class UserMain {
    public static void main(String[] args) {
        UserController uc = new UserController();
        Scanner sc = new Scanner(System.in);
        uc.addUser("Slaw", "admin");
        uc.addUser("Paw", "glon");
        uc.addUser("Gaw", "admin23");
        uc.addUser("Slaw", "admin");
        System.out.println();
        //usuwanie
        uc.deleteUser("Paw");
        uc.deleteUser("PBaw");
        uc.showUsers();
        System.out.println();
        //  System.out.println("Wpisz login");
        //   String log = sc.nextLine();
        //   System.out.println("Wpisz haslo");
        //  String pass = sc.nextLine();
        //   uc.addUser(log,pass);
        //zmiana hasla

        uc.changePassword("Slaw","admin","Ad1min","Ad1min");
        uc.changePassword("Sla","admin","Admin","Admin");
        uc.changePassword("Gaw","admin","Admin","Admin");
        uc.changePassword("Gaw","admin23","Admin","Admin");

    }

}
