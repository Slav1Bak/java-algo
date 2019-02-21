package model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AutoModel {

    private String vin_no;
    private String bran, model;
    private double price_basic;
    private List<String> eq_name = new ArrayList<>(Arrays.asList("A", "B", "C"));
    private List<Double> eq_price = new ArrayList<>(Arrays.asList(5000., 10000., 15000.));
    private List<Integer> eq_order = new ArrayList<>(Arrays.asList(0, 0, 0));
    private List<List> equipment = new ArrayList<>(Arrays.asList(eq_name, eq_price, eq_order));

    public AutoModel(String vin_no, String bran, String model, double price_basic) {
        this.vin_no = vin_no;
        this.bran = bran;
        this.model = model;
        this.price_basic = price_basic;
    }
    public void setEquipmentOrderByName(String name){
        int index = eq_name.indexOf(name);
        eq_order.set(index,1);

    }

    public String getOrderedEquipmentNames() {
        String equipmentNames = "";
        for (int i = 0; i < eq_name.size(); i++) {
            if (eq_order.get(i) != 0) {
                equipmentNames += (eq_name.get(i) + "'");
            }
        }
        return equipmentNames;
    }

    public double calcFullPrice() {
        double price_full = price_basic;
        for (int i = 0; i < eq_order.size(); i++) {
            if (eq_order.get(i) != 0) {
                price_full += eq_price.get(i);
            }
        }

        return price_full;

    }

    @Override
    public String toString() {
        return String.format("%10s | %10s | %10s| %10.2fzl|  %10s | %15.2fzl",
                vin_no, bran, model, price_basic, getOrderedEquipmentNames(), calcFullPrice());
    }

    public String getVin_no() {
        return vin_no;
    }

    public void setVin_no(String vin_no) {
        this.vin_no = vin_no;
    }

    public String getBran() {
        return bran;
    }

    public void setBran(String bran) {
        this.bran = bran;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice_basic() {
        return price_basic;
    }

    public void setPrice_basic(double price_basic) {
        this.price_basic = price_basic;
    }
}
