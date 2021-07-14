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

import com.info.sak.lookup.support.dto.RefRequestCustTypesDto;
import com.info.sak.lookup.support.handler.RefRequestCustTypesHandler;

import lombok.AllArgsConstructor;

@CrossOrigin
@RestController
@RequestMapping("/ref-request-cust-types")
@AllArgsConstructor
public class RefRequestCustTypesController {
    private RefRequestCustTypesHandler refRequestCustTypesHandler;

    @GetMapping
    public ResponseEntity listAll() {
        return refRequestCustTypesHandler.listRefRequestCustTypesHandler();
    }
    @GetMapping(path = "/page/{page}/size/{size}")
    public ResponseEntity listAll(@PathVariable(name = "page") int page, @PathVariable(name = "size") int size) {
        return refRequestCustTypesHandler.listRefRequestCustTypesHandler(page, size);
    }
    @PostMapping
    public ResponseEntity<?> create(@RequestBody RefRequestCustTypesDto refRequestCustTypes) {
        return refRequestCustTypesHandler.createRefRequestCustTypesHandler(refRequestCustTypes);
    }
    @PutMapping
    public ResponseEntity<?> update(@RequestBody RefRequestCustTypesDto refRequestCustTypes) {
        return refRequestCustTypesHandler.updateRefRequestCustTypesHandler(refRequestCustTypes);
    }
    @DeleteMapping(path = "/{id}")
    public ResponseEntity<?> delete(@PathVariable(name = "id") Integer entityId) {
        return refRequestCustTypesHandler.handleRefRequestCustTypesDeleteById(entityId);
    }
    @GetMapping(path = "/{id}")
    public ResponseEntity findById(@PathVariable(name = "id") Integer entityId) {
        return refRequestCustTypesHandler.handleRefRequestCustTypesFindById(entityId);
    }

}
