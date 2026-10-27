package kr.ac.kopo.pcu.exam2026.repository;

import kr.ac.kopo.pcu.bookmarket.domain.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderProRepository extends JpaRepository<Order, Long> {
}
