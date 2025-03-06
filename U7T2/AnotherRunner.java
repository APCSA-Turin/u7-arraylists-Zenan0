package U7T2;
import java.util.ArrayList;
import java.util.Arrays;

import U7T1.Car;

public class AnotherRunner {
    public static void main(String[] args) {
        Car[] carList = new Car[3];
        Car c1 = new Car("a", 1);
        Car c2 = new Car("b", 2);
        Car c3 = new Car("c", 3);
        carList[0] = c1;
        carList[1] = c2;
        carList[2] = c3;

        ArrayList<Car> carArrayList = new ArrayList<>(Arrays.asList(carList));
        System.out.println(carArrayList);
    }
}
