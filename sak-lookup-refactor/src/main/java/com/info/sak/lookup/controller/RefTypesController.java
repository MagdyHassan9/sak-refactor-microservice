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

import com.info.sak.lookup.support.dto.RefTypesDto;
import com.info.sak.lookup.support.handler.RefTypesHandler;

import lombok.AllArgsConstructor;

@CrossOrigin
@RestController
@RequestMapping("/ref-types")
@AllArgsConstructor
public class RefTypesController {

    private RefTypesHandler typesHandler;

    @GetMapping
    public ResponseEntity listAll() {
        return typesHandler.list();
    }

    @GetMapping(path = "/page/{page}/size/{size}")
    public ResponseEntity listAll(@PathVariable(name = "page") int page, @PathVariable(name = "size") int size) {
        return typesHandler.list(page, size);
    }

    @PostMapping
    public ResponseEntity<?> create(@RequestBody RefTypesDto typesDto) {
        return typesHandler.create(typesDto);
    }

    @PutMapping
    public ResponseEntity<?> update(@RequestBody RefTypesDto typesDto) {
        return typesHandler.update(typesDto);
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<?> delete(@PathVariable(name = "id") Integer entityId) {
        return typesHandler.delete(entityId);
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity findById(@PathVariable(name = "id") Integer entityId) {
        return typesHandler.findById(entityId);
    }
}
