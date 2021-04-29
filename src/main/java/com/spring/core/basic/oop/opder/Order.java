package com.spring.core.basic.oop.opder;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter @Getter @ToString
@AllArgsConstructor
public class Order {

    private Long memberId; // 주문한 회원의 아이디
    private String itemName; // 상품명
    private int itemPrice; // 상품 금액
    private int discountPrice; // 할인액

    // 최종 결재액 계산 가능
    public int calcFinalPrice() {
        return itemPrice - discountPrice;
    }

}
