package tuanshang.door.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tuanshang.bean.Car;
import tuanshang.bean.House;

@RestController
public class HelloController {

    @Autowired
    Car car;
    @Autowired
    House house;

    @RequestMapping("/car")
    public Car car() {
        return car;
    }

    @RequestMapping("/house")
    public House house() {
        return house;
    }
}

