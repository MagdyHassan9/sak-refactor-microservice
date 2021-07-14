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

import com.info.sak.lookup.support.dto.RefTransactionCategoryDto;
import com.info.sak.lookup.support.handler.RefTransactionCategoryHandler;

import lombok.AllArgsConstructor;

@CrossOrigin
@RestController
@RequestMapping("/ref-transaction-category")
@AllArgsConstructor
public class RefTransactionCategoryController {
    private RefTransactionCategoryHandler transactionCategoryHandler;

    @GetMapping
    public ResponseEntity listAll() {
        return transactionCategoryHandler.listRefTransactionCategoryHandler();
    }
    @GetMapping(path = "/page/{page}/size/{size}")
    public ResponseEntity listAll(@PathVariable(name = "page") int page, @PathVariable(name = "size") int size) {
        return transactionCategoryHandler.listRefTransactionCategoryHandler(page, size);
    }
    @PostMapping
    public ResponseEntity<?> create(@RequestBody RefTransactionCategoryDto refTransactionCategory) {
        return transactionCategoryHandler.createRefTransactionCategoryHandler(refTransactionCategory);
    }
    @PutMapping
    public ResponseEntity<?> update(@RequestBody RefTransactionCategoryDto refTransactionCategory) {
        return transactionCategoryHandler.updateRefTransactionCategoryHandler(refTransactionCategory);
    }
    @DeleteMapping(path = "/{id}")
    public ResponseEntity<?> delete(@PathVariable(name = "id") Integer entityId) {
        return transactionCategoryHandler.handleRefTransactionCategoryDeleteById(entityId);
    }
    @GetMapping(path = "/{id}")
    public ResponseEntity findById(@PathVariable(name = "id") Integer entityId) {
        return transactionCategoryHandler.handleRefTransactionCategoryFindById(entityId);
    }

}
