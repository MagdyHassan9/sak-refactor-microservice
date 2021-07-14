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

import com.info.sak.lookup.support.dto.LookupReviewerTypeDto;
import com.info.sak.lookup.support.handler.LookupReviewerTypeHandler;

import lombok.AllArgsConstructor;

@CrossOrigin
@RestController
@RequestMapping("/lookup-reviewer-type")
@AllArgsConstructor
public class LookupReviewerTypeController {

    private LookupReviewerTypeHandler lookupReviewerTypeHandler;

    @GetMapping
    public ResponseEntity listAll() {
        return lookupReviewerTypeHandler.list();
    }

    @GetMapping(path = "/page/{page}/size/{size}")
    public ResponseEntity listAll(@PathVariable(name = "page") int page, @PathVariable(name = "size") int size) {
        return lookupReviewerTypeHandler.list(page, size);
    }

    @PostMapping
    public ResponseEntity<?> create(@RequestBody LookupReviewerTypeDto lookupReviewerTypeDto) {
        return lookupReviewerTypeHandler.create(lookupReviewerTypeDto);
    }

    @PutMapping
    public ResponseEntity<?> update(@RequestBody LookupReviewerTypeDto lookupReviewerTypeDto) {
        return lookupReviewerTypeHandler.update(lookupReviewerTypeDto);
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<?> delete(@PathVariable(name = "id") Integer entityId) {
        return lookupReviewerTypeHandler.delete(entityId);
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity findById(@PathVariable(name = "id") Integer entityId) {
        return lookupReviewerTypeHandler.findById(entityId);
    }
}
