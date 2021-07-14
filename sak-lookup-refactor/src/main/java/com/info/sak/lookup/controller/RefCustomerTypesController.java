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

import com.info.sak.lookup.support.dto.RefCustomerTypesDto;
import com.info.sak.lookup.support.handler.RefCustomerTypesHandler;

import lombok.AllArgsConstructor;

@CrossOrigin
@RestController
@RequestMapping("/ref-customer-types")
@AllArgsConstructor
public class RefCustomerTypesController {
	private RefCustomerTypesHandler refCustomerTypesHandler;
	@GetMapping
    public ResponseEntity listAll() {
    	return refCustomerTypesHandler.listRefCustomerTypesHandler();
    }
    
    @GetMapping(path = "/page/{page}/size/{size}")
    public ResponseEntity listAll(@PathVariable(name = "page") int page, @PathVariable(name = "size") int size) {
        return refCustomerTypesHandler.listRefCustomerTypesHandler(page, size);
    }
    
    @PostMapping
    public ResponseEntity<?> create(@RequestBody RefCustomerTypesDto refCustomerTypesDto) {
        return refCustomerTypesHandler.createRefCustomerTypesHandler(refCustomerTypesDto);
    }
    @PutMapping
    public ResponseEntity<?> update(@RequestBody RefCustomerTypesDto refCustomerTypesDto) {
        return refCustomerTypesHandler.updateRefCustomerTypesHandler(refCustomerTypesDto);
    }
    @DeleteMapping(path = "/{id}")
    public ResponseEntity<?> delete(@PathVariable(name = "id") Integer entityId) {
        return refCustomerTypesHandler.handleRefCustomerTypesDeleteById(entityId);
    }
    @GetMapping(path = "/{id}")
    public ResponseEntity findById(@PathVariable(name = "id") Integer entityId) {
    	return refCustomerTypesHandler.handleRefCustomerTypesFindById(entityId);
    }
}
