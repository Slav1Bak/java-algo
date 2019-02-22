package controller;

import model.AutoModel;

import java.util.ArrayList;
import java.util.List;

public class AutoController {
    private List<AutoModel> ordered_autos = new ArrayList<>();

    public void addAutoModel(String vin_no, String bran, String model, double price_basic) {
        AutoModel a = new AutoModel(vin_no, bran, model, price_basic);
        ordered_autos.add(a);
        System.out.println("Zamowienie przyjete! " + a);
    }

//    public void deleteEquipment(String vin, String eq_name) {
 //       for (int i = 1; )
  //  }

    public void getAllAutos() {
        ordered_autos.forEach(auto -> System.out.println(auto));
    }

    public void addEquipment(String vin, String name) {
        for (int i = 0; i < ordered_autos.size(); i++) {
            if (ordered_autos.get(i).getVin_no().equals(vin)) {
                ordered_autos.get(i).setEquipmentOrderByName(name);
            }
        }
    }

    public boolean deleteOrderedCar(String vin) {

        for (int i = 0; i < ordered_autos.size(); i++) {
            if (ordered_autos.get(i).getVin_no().equals(vin)) {
                //sout musi być przed operacją usunięcia
                System.out.println("Zamówienie usunięto =-> " + ordered_autos.get(i));
                //usunięcie
                ordered_autos.remove((ordered_autos.get(i)));
                return true;

            }
        }

        System.out.println("Zamówienia nie usunięto. Brak samochodu?");
        return false;
    }
}
