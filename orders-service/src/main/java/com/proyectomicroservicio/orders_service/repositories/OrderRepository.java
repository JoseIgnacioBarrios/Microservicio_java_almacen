package com.proyectomicroservicio.orders_service.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.proyectomicroservicio.orders_service.model.entitties.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
    
}
