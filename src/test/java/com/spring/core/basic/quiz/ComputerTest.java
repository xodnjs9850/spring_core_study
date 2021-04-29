package com.spring.core.basic.quiz;

import com.spring.core.basic.config.ComputerAutoConfig;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

class ComputerTest {

    @Test
    void computerTest() {
        /*
        스피링 컨테이너를 통해 컴퓨터 객체를 받아서 의존관계가
        모두 설정되고 주입된 형태의 컴퓨터의 info()가 작동하도록
        작성
        */
        ApplicationContext context = new AnnotationConfigApplicationContext(ComputerAutoConfig.class);

        Computer computer = context.getBean(Computer.class);
        Computer computer2 = context.getBean(Computer.class);
        Computer computer3 = context.getBean(Computer.class);

        System.out.println("computer = " + computer);
        System.out.println("computer2 = " + computer2);
        System.out.println("computer3 = " + computer3);

        computer.info();


    }

}