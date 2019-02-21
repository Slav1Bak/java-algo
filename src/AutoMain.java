import controller.AutoController;

public class AutoMain {
    public static void main(String[] args) {
        AutoController ac = new AutoController();
        ac.addAutoModel("234DEACA54", "VW", "Passat", 150000);
        ac.addAutoModel("2315DA3224", "VW", "Golf", 80000);
        ac.addAutoModel("234RWSWE14", "VW", "Tuareg", 220000);
        System.out.println("\t\t\t\t\t\t\t\t\t       Glowna strona");

        ac.addEquipment("2315DA3224","B");
        ac.addEquipment("2315DA3224","C");
        ac.getAllAutos();

    }
}
