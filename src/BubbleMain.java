import controller.BubbleController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BubbleMain {
    public static void main(String[] args) {
        List<Integer> myList=
                new ArrayList<>(Arrays.asList(4,3,43,673,252,34,21,78,422,45,6,3,2,1,12,16,53,25));
        BubbleController bc = new BubbleController();
        System.out.println("Lista początkowa\n" + myList);
        System.out.println("Od najwiekszej");
        System.out.println(bc.sortASC(myList));
        System.out.println("Od najmniejszej");
        System.out.println(bc.sortDESC(myList));
    }
}
