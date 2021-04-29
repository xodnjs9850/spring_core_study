package com.spring.core.basic.oop.member;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MemberTest {

    @Test
    void lombokTest(){
        Member member = new Member(1L, "kim", Grade.BASIC);
//        member.getName();

        System.out.println(member);

    }

}