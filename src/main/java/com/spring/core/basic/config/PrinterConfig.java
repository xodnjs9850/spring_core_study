package com.spring.core.basic.config;

import com.spring.core.basic.printer.Paper;
import com.spring.core.basic.printer.Printer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

// 프린터가 필요한 객ㅊ[를 셍성하고 주입해주는 설정 클래스
// 스프링 컨테이너 설정 방법
@Configuration // 이 클래스는 스프링 컨테이너 설정 클래스입니다.
public class PrinterConfig {

    // 빈(Bean) 등록 : 컨테이너에 필요한 객체를 미리 생성하는 개념
//    @Bean(name = "A4paper")
    @Bean // 빈에 이름을 등록하지 않으면 메서드 이름이 빈의 이름으로 결정됨!
    public Paper paper() {
        return new Paper(Arrays.asList("자바", "스프링", "DI 컨테이너"));
    }

    @Bean // 빈의 이름은 printer
    public Printer printer() {
        return new Printer(paper());
    }


}
