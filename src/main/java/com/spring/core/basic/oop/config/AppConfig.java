package com.spring.core.basic.oop.config;

import com.spring.core.basic.oop.discount.DiscountPolicy;
import com.spring.core.basic.oop.discount.FixDiscountPolicy;
import com.spring.core.basic.oop.discount.RateDiscountPolicy;
import com.spring.core.basic.oop.member.MemberRepository;
import com.spring.core.basic.oop.member.MemberRepositoryImpl;
import com.spring.core.basic.oop.member.MemberService;
import com.spring.core.basic.oop.member.MemberServiceImpl;
import com.spring.core.basic.oop.opder.OrderService;
import com.spring.core.basic.oop.opder.OrderServiceImpl;

public class AppConfig {

    // 객체를 생성하고 필요에 맞게 주입하는 클래스
    public MemberRepository memberRepository() {
        return new MemberRepositoryImpl();
    }

    public DiscountPolicy discountPolicy() {
        return new RateDiscountPolicy();
    }

    public OrderService orderService() {
        return new OrderServiceImpl(
                memberRepository(), discountPolicy()
        );
    }

    public MemberService memberService() {
        return new MemberServiceImpl(memberRepository());
    }

}
