package de.awacademy.classicModelsDemo.Data;
import de.awacademy.classicModelsDemo.Models.Customer;
import de.awacademy.classicModelsDemo.Models.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderService {

    @Autowired
    public OrderRepository orderRepository;
    @Autowired
    public CustomerService customerService;
    public List<Order> findOrdersByEmployee(Long employeeId){

        List <Order> orders = new ArrayList<>();
        List<Customer> customersByEmployee = customerService.findAllBySalesRep(employeeId);
        for(Customer customer : customersByEmployee){
            orders.addAll(orderRepository.findAllByCustomerNumber(customer.getCustomerNumber()));
        }

        return orders;
    }
}