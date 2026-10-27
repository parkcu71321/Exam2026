package kr.ac.kopo.pcu.exam2026.repository;

import kr.ac.kopo.pcu.bookmarket.domain.Order;

public interface OrderRepository {
    Long saveOrder(Order order);
}
