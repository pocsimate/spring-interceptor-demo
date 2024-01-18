package com.example.demo.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api/customer")
public class CustomerController {

    @GetMapping(path = "/{name}")
    public ResponseEntity<String> getCustomerByName(@PathVariable String name) {
        return new ResponseEntity<>(name, HttpStatus.OK);
    }

    @PutMapping(path = "/{fromName}/{toName}")
    public ResponseEntity<String> updateCustomerName(@PathVariable String fromName, @PathVariable String toName) {
        return new ResponseEntity<>("Name changed from ".concat(fromName).concat(" to ").concat(toName), HttpStatus.OK);
    }

    @DeleteMapping(path = "/{name}")
    public ResponseEntity<String> deleteCustomer(@PathVariable String name) {
        return new ResponseEntity<>("Deleted ".concat(name), HttpStatus.OK);
    }
}
