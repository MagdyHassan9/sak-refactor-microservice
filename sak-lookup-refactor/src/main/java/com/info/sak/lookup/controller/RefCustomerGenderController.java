package com.info.sak.lookup.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.info.sak.lookup.support.dto.RefCustomerGenderDto;
import com.info.sak.lookup.support.handler.RefCustomerGenderHandler;

import lombok.AllArgsConstructor;

@CrossOrigin
@RestController
@RequestMapping("/ref-customer-gender")
@AllArgsConstructor
public class RefCustomerGenderController {
    private RefCustomerGenderHandler refCustomerGenderHandler;
    
    @GetMapping
    public ResponseEntity listAll() {
    	return refCustomerGenderHandler.listRefCustomerGenderHandler();
    }
    
    @GetMapping(path = "/page/{page}/size/{size}")
    public ResponseEntity listAll(@PathVariable(name = "page") int page, @PathVariable(name = "size") int size) {
        return refCustomerGenderHandler.listRefCustomerGenderHandler(page, size);
    }
    
    @PostMapping
    public ResponseEntity<?> create(@RequestBody RefCustomerGenderDto refCustomerGenderDto) {
//@ExampleProperty(value ="kk",mediaType ="jj" )
        return refCustomerGenderHandler.createRefCustomerGenderHandler(refCustomerGenderDto);
    }
    @PutMapping
    public ResponseEntity<?> update(@RequestBody RefCustomerGenderDto refCustomerGenderDto) {
        return refCustomerGenderHandler.updateRefCustomerGenderHandler(refCustomerGenderDto);
    }
    @DeleteMapping(path = "/{id}")
    public ResponseEntity<?> delete(@PathVariable(name = "id") Integer entityId) {
        return refCustomerGenderHandler.handleRefCustomerGenderDeleteById(entityId);
    }
    @GetMapping(path = "/{id}")
    public ResponseEntity findById(@PathVariable(name = "id") Integer entityId) {
    	return refCustomerGenderHandler.handleRefCustomerGenderFindById(entityId);
    }

    
}
