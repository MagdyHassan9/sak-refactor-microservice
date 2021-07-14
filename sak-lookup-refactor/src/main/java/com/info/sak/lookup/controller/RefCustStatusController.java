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

import com.info.sak.lookup.support.dto.RefCustStatusDto;
import com.info.sak.lookup.support.handler.RefCustStatusHandler;

import lombok.AllArgsConstructor;

@CrossOrigin
@RestController
@RequestMapping("/ref-cust-status")
@AllArgsConstructor
public class RefCustStatusController {
private RefCustStatusHandler refCustStatusHandler;
    
    @GetMapping
    public ResponseEntity listAll() {
    	return refCustStatusHandler.listRefCustStatusHandler();
    }
    
    @GetMapping(path = "/page/{page}/size/{size}")
    public ResponseEntity listAll(@PathVariable(name = "page") int page, @PathVariable(name = "size") int size) {
        return refCustStatusHandler.listRefCustStatusHandler(page, size);
    }
    
    @PostMapping
    public ResponseEntity<?> create(@RequestBody RefCustStatusDto refCustStatusDto) {
        return refCustStatusHandler.createRefCustStatusHandler(refCustStatusDto);
    }
    @PutMapping
    public ResponseEntity<?> update(@RequestBody RefCustStatusDto refCustStatusDto) {
        return refCustStatusHandler.updateRefCustStatusHandler(refCustStatusDto);
    }
    @DeleteMapping(path = "/{id}")
    public ResponseEntity<?> delete(@PathVariable(name = "id") Integer entityId) {
        return refCustStatusHandler.handleRefCustStatusDeleteById(entityId);
    }
    @GetMapping(path = "/{id}")
    public ResponseEntity findById(@PathVariable(name = "id") Integer entityId) {
    	return refCustStatusHandler.handleRefCustStatusFindById(entityId);
    }

    
}
