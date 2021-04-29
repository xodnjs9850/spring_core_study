package com.spring.core.basic.oop.discount;

import com.spring.core.basic.oop.member.Grade;
import com.spring.core.basic.oop.member.Member;

// 정률 할인 정책
// 역할 : VIP 회원에게만 정해진 비율의 할인액을 적용해준다.
public class RateDiscountPolicy implements DiscountPolicy {

    //할인률
    private final static double DISCOUNT_RATE = 0.2; // 20% 할인

    @Override
    public int discount(Member member, int itemPrice) {

        if (member.getGrade() == Grade.VIP) {
            return (int) (itemPrice * DISCOUNT_RATE);
        } else {
            return 0;
        }

    }
}
