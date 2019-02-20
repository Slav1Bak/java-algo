package z1;

import controller.StringControler;

public class StringMain {
    public static void main(String[] args) {
        StringControler sc = new StringControler();
        System.out.println("Czy zawiera znak? " + sc.isCharacter('y'));
        System.out.println("ile razy wystepuje dany znak? " + sc.countAllCharakters('L') );
   //meoda reverse
        System.out.println("odwrotnosc " + sc.reveres());
    }
}
