package de.awacademy.classicModelsDemo.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "customers")
public class Customer {

    @Id
    @Column(name = "customerNumber")
    private Long customerNumber;

    @Column(name = "salesRepEmployeeNumber")
    private Long salesRepEmployeeNumber;

    public Customer() {
    }

    public Long getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(Long customerNumber) {
        this.customerNumber = customerNumber;
    }

    public Long getSalesRepEmployeeNumber() {
        return salesRepEmployeeNumber;
    }

    public void setSalesRepEmployeeNumber(Long salesRepEmployeeNumber) {
        this.salesRepEmployeeNumber = salesRepEmployeeNumber;
    }
}
