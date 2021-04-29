package com.spring.core.basic.quiz;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Computer {

    private final Keyboard keyboard;
    private final Mouse mouse;
    private final Monitor monitor;

    @Autowired
    public Computer(
            @Qualifier("samsungKeyboard") Keyboard keyboard,
            @Qualifier("lgm") Mouse mouse,
            @Qualifier("appleMonitor") Monitor monitor) {
        this.keyboard = keyboard;
        this.mouse = mouse;
        this.monitor = monitor;
    }

    public void info() {
        keyboard.info();
        monitor.info();
        mouse.info();
    }

}
