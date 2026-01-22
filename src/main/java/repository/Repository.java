package repository;

import domain.Car;

import java.util.ArrayList;
import java.util.List;

public class Repository{
    private final ArrayList<Car> carsList = new ArrayList<>();

   // @Override
    public void add(Car car) {
        carsList.add(car);
    }

    //@Override
    public List<Car> show() {
        return List.copyOf(carsList);
    }
}
