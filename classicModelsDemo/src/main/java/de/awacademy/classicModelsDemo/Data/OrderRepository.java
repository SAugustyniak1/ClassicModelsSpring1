package de.awacademy.classicModelsDemo.Data;

import de.awacademy.classicModelsDemo.Models.Employee;
import de.awacademy.classicModelsDemo.Models.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderRepository extends JpaRepository<Order, Long> {

    public List<Order> findAllByCustomerNumber(Long customerNumber);

}
