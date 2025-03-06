package U7T3;
import java.util.ArrayList;

public class CustomerCheck {
    /** The check for a customer or group of customers
     *  Guaranteed to contain at least one MenuItem and all entries are non-null
     */
    private ArrayList<MenuItem> check;

    /* Constructor */
    public CustomerCheck(ArrayList<MenuItem> check) {
        this.check = check;
    }

    /** Returns the total of all MenuItem prices on the check,
     *  as described in part (a)
     */
    public double totalPrices() {
        double price = 0;
        for (MenuItem item : check) {
            price += item.getPrice();
        }
        return price;
    }

    /** Returns true if the restaurant’s coupon offer can be applied to this check and
     *  returns false otherwise, as described in part (b) */
    public boolean couponApplies() {
        for (int i = 0; i < check.size(); i++) {
            if (check.get(i).isDailySpecial() == true) {
                return false;
            }
            if (totalPrices() < 40) {
                return false;
            }
        }
        return true;
    }

    /** Calculates the final cost of this check, as described in part (c) */
    public double calculateCheck() {
        double total = totalPrices();
        double couponDiscount = 0;
        double tip = 0;
        int customers = 0;
        if (couponApplies()) {
            couponDiscount = total * 0.25;
        }
        for (int i = 0; i < check.size(); i++) {
            if (check.get(i).isEntree() == true) {
                customers++;
            }
        }
        if (customers >= 6) {
            tip = total * 0.2;
        }
        total = total + tip - couponDiscount;
        return total;
    }
}