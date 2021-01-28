package arraylist;

import java.util.*;

public class App {
    public static void main(String[] args) {
        System.out.println("java.util.ArrayList");
        List<Integer> myArrayList = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            myArrayList.add(i);
        }

        for (int i = 0; i < myArrayList.size(); i++) {
            System.out.println(myArrayList.get(i));
        }
    }

}