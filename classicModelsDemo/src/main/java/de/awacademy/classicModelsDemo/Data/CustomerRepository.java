package de.awacademy.classicModelsDemo.Data;

import de.awacademy.classicModelsDemo.Models.Customer;
import de.awacademy.classicModelsDemo.Models.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

    public List<Customer> findAllBySalesRepEmployeeNumber(Long employeeID);

}
