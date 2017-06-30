package swing.service;

import swing.model.Car;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by agurgul on 30.06.2017.
 */
public class CarService {

    private List<Car> cars = new ArrayList<>();

    public CarService() {
    }

    public Car createCar(String model, String brand, Integer year) {
        Car car = new Car();
        car.setModel(model);
        car.setBrand(brand);
        car.setYear(year);
        car.setId(cars.size()+1l);
        return car;
    }

    public List<Car> findAll() {
        return cars;
    }
}
