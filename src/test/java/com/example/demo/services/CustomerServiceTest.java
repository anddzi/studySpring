package com.example.demo.services;

import com.example.demo.entities.Customer;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class CustomerServiceTest {
    @Autowired
    private CustomerService customerService;

    @Test
    public void testCreateCustomer() {
        Customer customer = customerService.createCustomer("aaa");
        assertNotNull(customer.getId());
        assertEquals(customer.getName(), "aaa");
    }
}
// CustomerService -> CustomerRepository
// jdbc
// hibernate
// annotations - Bean, Service, Repository, Controller, RestController
// xml vs boot
