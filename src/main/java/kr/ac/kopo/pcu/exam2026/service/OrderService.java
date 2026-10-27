package kr.ac.kopo.pcu.exam2026.service;

import kr.ac.kopo.minn.bookmarket.domain.Order;

public interface OrderService {
    void confirmOrder(String bookId, long quantity); //도서 재고 수량 확인
    Long saveOrder(Order order);
}
