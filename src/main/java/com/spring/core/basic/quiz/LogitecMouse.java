package com.spring.core.basic.quiz;

import org.springframework.stereotype.Component;

@Component("lgm")
public class LogitecMouse implements Mouse {

    @Override
    public void info() {
        System.out.println("로지텍 마우스");
    }
}
