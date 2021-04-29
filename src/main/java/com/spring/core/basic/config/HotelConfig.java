package com.spring.core.basic.config;

import com.spring.core.basic.hotel.Chef;
import com.spring.core.basic.hotel.Hotel;
import com.spring.core.basic.hotel.Restaurant;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HotelConfig {

    /*@Bean
    public Chef chef() {
        return new Chef();
    }

    @Bean
    public Restaurant restaurant() {
        return new Restaurant(chef());
    }

    @Bean
    public Hotel hotel() {
        return new Hotel(restaurant());
    }*/

}
