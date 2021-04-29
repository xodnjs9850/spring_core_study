package com.spring.core.basic.printer;

import com.spring.core.basic.config.PrinterConfig;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import static org.junit.jupiter.api.Assertions.*;

class PrinterTest {

    @Test
    @DisplayName("스프링 컨테이너에 의해 프린터가 생성되어 정상 작동 Test")
    void printerTest() {
        // 스프링에게 사용할 설정파일을 알려줌
        ApplicationContext context = new AnnotationConfigApplicationContext(PrinterConfig.class);

        // 컨테이너에서 등록된 빈을 취득
        Printer printer = context.getBean(Printer.class);

        printer.printPaper();
    }

    @Test
    @DisplayName("스프링 xml 컨테이너에 의해 프린터가 생성되고 작동 Test")
    void printerTestByXmlConfig() {
        ApplicationContext context = new GenericXmlApplicationContext("printConfig.xml");

        Printer printer = context.getBean(Printer.class);

        printer.printPaper();

    }

}