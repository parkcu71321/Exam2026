package kr.ac.kopo.pcu.exam2026.repository;

import kr.ac.kopo.pcu.bookmarket.domain.Order;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class OrderRepositoryImpl implements OrderRepository{
    private Map<Long, Order> listOfOrders;
    private long nextOrderId;

    public OrderRepositoryImpl() {
        listOfOrders = new HashMap<Long, Order>();
        nextOrderId = 2000;
    }

    @Override
    public Long saveOrder(Order order) {
        order.setOrderId(nextOrderId);
        listOfOrders.put(order.getOrderId(), order);
        return order.getOrderId();
    }

    private synchronized long getNextOrderId(){
        return nextOrderId++;
    }
}
