package U7T4;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numList = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8));
        numList.add(0, numList.remove(numList.size() - 1));
        System.out.println(numList);   // should print: [8, 1, 2, 3, 4, 5, 6, 7]

        ArrayList<Integer> numList2 = new ArrayList<Integer>(Arrays.asList(2, 2, 2, 4, 5, 6, 8, 8, 9, 10, 12));
        for (int i = numList2.size() - 1; i >= 0; i--) {
            if (numList2.get(i) % 2 == 0) {
                numList2.remove(i);
            }
        }
        System.out.println(numList2);  // should print: [5, 9]
    }
}
