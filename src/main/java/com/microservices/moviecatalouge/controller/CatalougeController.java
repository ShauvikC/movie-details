package com.microservices.moviecatalouge.controller;

import java.util.Collections;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/catalogue")
public class CatalougeController {

    
    @GetMapping("/{userId}")
    public List<CatalougeItem> getCatalouge(@PathVariable("userId") String userid){
        return Collections.singletonList(new CatalougeItem("Transformers","test",4));

    }
    
}
