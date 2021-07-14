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

import com.info.sak.lookup.support.dto.LookupMortgageViewsDto;
import com.info.sak.lookup.support.handler.LookupMortgageViewsHandler;

import lombok.AllArgsConstructor;

@CrossOrigin
@RestController
@RequestMapping("/lookup-mortgage-views")
@AllArgsConstructor
public class LookupMortgageViewsController {

    private LookupMortgageViewsHandler mortgageViewsHandler;

    @GetMapping
    public ResponseEntity listAll() {
        return mortgageViewsHandler.list();
    }

    @GetMapping(path = "/page/{page}/size/{size}")
    public ResponseEntity listAll(@PathVariable(name = "page") int page, @PathVariable(name = "size") int size) {
        return mortgageViewsHandler.list(page, size);
    }

    @PostMapping
    public ResponseEntity<?> create(@RequestBody LookupMortgageViewsDto mortgageViewsDto) {
        return mortgageViewsHandler.create(mortgageViewsDto);
    }

    @PutMapping
    public ResponseEntity<?> update(@RequestBody LookupMortgageViewsDto mortgageViewsDto) {
        return mortgageViewsHandler.update(mortgageViewsDto);
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<?> delete(@PathVariable(name = "id") Integer entityId) {
        return mortgageViewsHandler.delete(entityId);
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity findById(@PathVariable(name = "id") Integer entityId) {
        return mortgageViewsHandler.findById(entityId);
    }
}
