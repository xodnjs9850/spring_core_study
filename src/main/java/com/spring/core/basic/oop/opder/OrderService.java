package com.spring.core.basic.oop.opder;

// 주문을 생성하는 역할
public interface OrderService {

    Order createOrder(Long memberId, String itemName, int itemPrice);

}
