package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiceImpl implements CarService {
    List<Car> carList;
    public CarServiceImpl() {
        carList = new ArrayList<>();
        carList.add(new Car("first", 11, "black"));
        carList.add(new Car("second", 12, "red"));
        carList.add(new Car("third", 13, "green"));
        carList.add(new Car("fourth", 14, "yellow"));
        carList.add(new Car("fifth", 15, "blue"));
    }

    @Override
    public List<Car> getCars(Integer count) {
        if (count == null || count >= carList.size()) {
            return carList;
        }
        return carList.subList(0, count);
    }
    }
