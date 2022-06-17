package web.Service;

import org.springframework.stereotype.Component;
import web.Model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
@Component
public class CarServiceImpl implements CarService {

    List<Car> auto = new ArrayList<>();

    {
        auto.add(new Car("BMW", "black", "V6"));
        auto.add(new Car("Ferrari", "red", "V8"));
        auto.add(new Car("Mercedes", "white", "V4"));
        auto.add(new Car("Lada", "brown", "V9"));
        auto.add(new Car("Volkswagen", "gray", "V12"));
    }

    @Override
    public List<Car> showMyCar(Integer count) {
        if (count >= 1 && count <= 4) {
            return auto.stream().limit(count).collect(Collectors.toList());
        } else {
            return auto;
        }
    }
}
