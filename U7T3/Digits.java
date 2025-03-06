package U7T3;
import java.util.ArrayList;

public class Digits {
    /**
     * The list of digits from the number used to construct this object.
     * The digits appear in the list in the same order in which they appear in the original number.
     */
    private ArrayList<Integer> digitList;

    /**
     * Constructs a Digits object that represents num.
     * PRECONDITION: num >= 0
     */
    public Digits(int num) {
        digitList = new ArrayList<Integer>();
        String strNum = Integer.toString(num);
        for (int i = 0; i < strNum.length(); i++) {
            int singleDigit = Integer.parseInt(strNum.substring(i, i + 1));
            digitList.add(singleDigit);
        }
    }
    
    // GETTER METHOD: added to enable test code (not provided in original FRQ)
    public ArrayList<Integer> getDigitList() {
        return digitList;
    }

    /**
     * Returns true if the digits in this Digits object are in strictly increasing order;
     * false otherwise.
     */
    public boolean isStrictlyIncreasing() {
        boolean bool = true;
        if (digitList.size() <= 1) {
            return bool;
        }
        for (int i = 1; i < digitList.size(); i++) {
            if (digitList.get(i) <= digitList.get(i - 1)) {
                bool = false;
            }
        }
        return bool;
    }
}
