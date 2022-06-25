package com.microservices.moviecatalouge.controller;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CatalougeItem {

    private String name;
    private String desc;
    private int rating;

}
