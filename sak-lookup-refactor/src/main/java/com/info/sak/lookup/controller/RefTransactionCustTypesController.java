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

import com.info.sak.lookup.support.dto.RefTransactionCustTypesDto;
import com.info.sak.lookup.support.handler.RefTransactionCustTypesHandler;

import lombok.AllArgsConstructor;

@CrossOrigin
@RestController
@RequestMapping("/ref-transaction-cust-types")
@AllArgsConstructor
public class RefTransactionCustTypesController {

    private RefTransactionCustTypesHandler transactionCustTypesHandler;

    @GetMapping
    public ResponseEntity listAll() {
        return transactionCustTypesHandler.list();
    }

    @GetMapping(path = "/page/{page}/size/{size}")
    public ResponseEntity listAll(@PathVariable(name = "page") int page, @PathVariable(name = "size") int size) {
        return transactionCustTypesHandler.list(page, size);
    }

    @PostMapping
    public ResponseEntity<?> create(@RequestBody RefTransactionCustTypesDto transactionCustTypesDto) {
        return transactionCustTypesHandler.create(transactionCustTypesDto);
    }

    @PutMapping
    public ResponseEntity<?> update(@RequestBody RefTransactionCustTypesDto transactionCustTypesDto) {
        return transactionCustTypesHandler.update(transactionCustTypesDto);
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<?> delete(@PathVariable(name = "id") Integer entityId) {
        return transactionCustTypesHandler.delete(entityId);
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity findById(@PathVariable(name = "id") Integer entityId) {
        return transactionCustTypesHandler.findById(entityId);
    }
}
