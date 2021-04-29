package com.spring.core.basic.quiz;

import org.springframework.stereotype.Component;

@Component("LgMonitor")
public class LgMonitor implements Monitor {
    @Override
    public void info() {
        System.out.println("LG 모니터");
    }
}
