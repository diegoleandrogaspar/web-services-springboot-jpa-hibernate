package com.web.projeto.repository;

import com.web.projeto.entities.Order;
import com.web.projeto.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

}
