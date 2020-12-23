package de.awacademy.classicModelsDemo.Data;


import de.awacademy.classicModelsDemo.Data.CustomerRepository;
import de.awacademy.classicModelsDemo.Models.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    @Autowired
    public CustomerRepository customerRepository;

    public List<Customer> findAllBySalesRep(Long employeeId){
        List<Customer> customers = customerRepository.findAllBySalesRepEmployeeNumber(employeeId);
        return customers;
    }
}

