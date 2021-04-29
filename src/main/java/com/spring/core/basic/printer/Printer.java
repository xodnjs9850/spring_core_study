package com.spring.core.basic.printer;

public class Printer {

    private Paper paper;

    public Printer(Paper paper) {
        this.paper = paper;
    }

    public void printPaper() {
        System.out.println("------------- 출력 내용 --------------");
        for (String data : paper.getDatas()) {
            System.out.println("# " + data);
        }
    }

}
