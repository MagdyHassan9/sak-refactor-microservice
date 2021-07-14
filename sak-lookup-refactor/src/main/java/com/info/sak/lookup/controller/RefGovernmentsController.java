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

import com.info.sak.lookup.support.dto.RefGovernmentsDto;
import com.info.sak.lookup.support.handler.RefGovernmentsHandler;

import lombok.AllArgsConstructor;


@CrossOrigin
@RestController
@RequestMapping("/ref-governments")
@AllArgsConstructor
public class RefGovernmentsController {
    private RefGovernmentsHandler refGovernmentsHandler;

    @GetMapping
    public ResponseEntity listAll() {
        return refGovernmentsHandler.listRefGovernmentsHandler();
    }
    @GetMapping(path = "/page/{page}/size/{size}")
    public ResponseEntity listAll(@PathVariable(name = "page") int page, @PathVariable(name = "size") int size) {
        return refGovernmentsHandler.listRefGovernmentsHandler(page, size);
    }
    @PostMapping
    public ResponseEntity<?> create(@RequestBody RefGovernmentsDto refGovernments) {
        return refGovernmentsHandler.createRefGovernmentsHandler(refGovernments);
    }
    @PutMapping
    public ResponseEntity<?> update(@RequestBody RefGovernmentsDto refGovernments) {
        return refGovernmentsHandler.updateRefGovernmentsHandler(refGovernments);
    }
    @DeleteMapping(path = "/{id}")
    public ResponseEntity<?> delete(@PathVariable(name = "id") Integer entityId) {
        return refGovernmentsHandler.handleRefGovernmentsDeleteById(entityId);
    }
    @GetMapping(path = "/{id}")
    public ResponseEntity findById(@PathVariable(name = "id") Integer entityId) {
        return refGovernmentsHandler.handleRefGovernmentsFindById(entityId);
    }

}

