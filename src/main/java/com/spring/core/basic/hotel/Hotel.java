package com.spring.core.basic.hotel;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class Hotel {

//    @Autowired
    private final Restaurant restaurant;

    /*@Autowired
    public Hotel(Restaurant restaurant) {
        this.restaurant = restaurant;
    }*/

    /*@Autowired
    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }*/

    //레스토랑 예약기능
    public void reserveRestaurant() {
        System.out.println("레스토랑을 운영");
        restaurant.orderDinner();
    }

}
