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

import com.info.sak.lookup.support.dto.RefPayTypesDto;
import com.info.sak.lookup.support.handler.RefPayTypesHandler;

import lombok.AllArgsConstructor;

@CrossOrigin
@RestController
@RequestMapping("/Ref-pay-types")
@AllArgsConstructor
public class RefPayTypesController {
    private RefPayTypesHandler payTypesHandler;

    @GetMapping
    public ResponseEntity listAll() {
        return payTypesHandler.list();
    }

    @GetMapping(path = "/page/{page}/size/{size}")
    public ResponseEntity listAll(@PathVariable(name = "page") int page, @PathVariable(name = "size") int size) {
        return payTypesHandler.list(page, size);
    }

    @PostMapping
    public ResponseEntity<?> create(@RequestBody RefPayTypesDto refPayTypesDto) {
        return payTypesHandler.create(refPayTypesDto);
    }

    @PutMapping
    public ResponseEntity<?> update(@RequestBody RefPayTypesDto refPayTypesDto) {
        return payTypesHandler.update(refPayTypesDto);
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<?> delete(@PathVariable(name = "id") Integer entityId) {
        return payTypesHandler.delete(entityId);
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity findById(@PathVariable(name = "id") Integer entityId) {
        return payTypesHandler.findById(entityId);
    }

}
