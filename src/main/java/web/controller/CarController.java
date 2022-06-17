package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.Model.Car;
import web.Service.CarService;
import web.Service.CarServiceImpl;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/cars")

public class CarController {
    private final CarServiceImpl carService;

    @Autowired
    public CarController(CarServiceImpl carService) {
        this.carService = carService;
    }

    @GetMapping
    public String car(ModelMap model, @RequestParam (defaultValue = "0",required = false) Integer count) {
        model.addAttribute("auto",carService.showMyCar(count));

        return "cars";
    }
}
