package repository;

import domain.Car;

import java.util.List;

interface DataSource {
    void add(Car car);
    List<Car> show();
}
