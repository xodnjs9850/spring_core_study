package com.spring.core.basic.oop.member;

import lombok.*;

// 회원 정보 도메인 클래스 : 엔터티 클래스, VO(Value Object)클래스
@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Member {

    private Long id; // 회원 식별 코드
    private String name; // 회원명
    private Grade grade; // 회원 등급

    // 자바 빈즈 규약
    /*
    * 1. 기분 생성자
    * 2. 파라미터 초기화 생성자
    * 3. Setter / Getter
    */



}
