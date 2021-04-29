package com.spring.core.basic.oop.opder;

import com.spring.core.basic.oop.config.AppConfig;
import com.spring.core.basic.oop.member.Grade;
import com.spring.core.basic.oop.member.Member;
import com.spring.core.basic.oop.member.MemberService;
import com.spring.core.basic.oop.member.MemberServiceImpl;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrderServiceTest {

    AppConfig ac = new AppConfig();

    MemberService memberService = ac.memberService();
    OrderService orderService = ac.orderService();

    @Test
    void serviceTest() {
        Member member1 = new Member(1L, "pack", Grade.VIP);
        Member member2 = new Member(2L, "kim", Grade.BASIC);

        memberService.join(member1);
        memberService.join(member2);

        Order order1 = orderService.createOrder(member1.getId(), "삼겹살", 20000);
//       Order order1 = orderService.createOrder(member2.getId(), "카레", 8500);

        int payAmount = order1.calcFinalPrice();

        assertEquals(order1.getItemPrice() * 0.8, payAmount);


    }

}