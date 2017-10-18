package com.aaron.demo.controller;

import com.aaron.demo.entity.City;
import com.aaron.demo.mapper.CityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by kittaaron on 2017/10/18.
 * DemoController
 */
@RestController
@RequestMapping("/")
public class DemoController {

    @Autowired
    private CityMapper cityMapper;

    @RequestMapping("/demo")
    String demo() {
        return "demo";
    }

    @RequestMapping("/dbdemo")
    City city(@RequestParam("id") Long id) {
        return cityMapper.findCityById(id);
    }
}
