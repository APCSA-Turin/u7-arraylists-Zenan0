package U7T1;

import java.util.ArrayList;

public class UsedCarLot {
    private ArrayList<Car> inventory;

    public UsedCarLot() {
        inventory = new ArrayList<Car>();
    }

    public ArrayList<Car> getInventory() {
        return inventory;
    }

    public void addCar(Car car) {
        inventory.add(car);
    }

    public Boolean swap(int one, int two) {
        if (one >= inventory.size() || one < 0 || two >= inventory.size() || two < 0) {
            return false;
        }
        Car swappedCar = inventory.set(one, inventory.get(two));
        inventory.set(two, swappedCar);
        return true;
    }
}
