package controller;

import java.util.ArrayList;
import java.util.List;

public class BubbleController {
    private List<Integer> tempList = new ArrayList<>();

    public List<Integer> sortASC(List<Integer> list) {
        tempList = list;
        //petla iterujaca po testach
        for (int i = 1; i < tempList.size(); i++) {
            //iterujaca po wartosciach
            for (int j = 1; j < tempList.size(); j++) {
                if (tempList.get(j - 1) < tempList.get(j)) {
                    swap(j - 1, j);
                }

            }
        //    System.out.println(i + " " + tempList);
        }
        return tempList;

    }

    public List<Integer> sortDESC(List<Integer> list) {
        tempList = list;
        //petla iterujaca po testach
        for (int i = 1; i < tempList.size(); i++) {
            //iterujaca po wartosciach
            for (int j = 1; j < tempList.size(); j++) {
                if (tempList.get(j - 1) > tempList.get(j)) {
                    swap(j - 1, j);
                }
            }
        }
        return tempList;
    }



    //metoda zmieniajaca miejscami na wskazanych idexach
    public void swap(int index1, int index2) {
        int tempIndex = tempList.get(index1);
        //wprowadzam index2 w miejsce index1
        tempList.set(index1, tempList.get(index2));
        //wprowadzenie wartosci dla index 1 w miejscu index 2
        tempList.set(index2, tempIndex);

    }
}