package com.example.cs.service;

import com.example.cs.model.RetailCustomer;
import com.example.cs.model.RetailCustomerDTO;
import org.springframework.http.ResponseEntity;

public interface RetailService {

    ResponseEntity<RetailCustomer> create(RetailCustomer retailCustomer);

    ResponseEntity<RetailCustomer> getCustomersById(Long customerID);

}
