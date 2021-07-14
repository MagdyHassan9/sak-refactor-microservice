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

import com.info.sak.lookup.support.dto.RefNationalityTypesDto;
import com.info.sak.lookup.support.handler.RefNationalityTypesHandler;

import lombok.AllArgsConstructor;

@CrossOrigin
@RestController
@RequestMapping("/ref-nationality-types")
@AllArgsConstructor
public class RefNationalityTypesController {
	private RefNationalityTypesHandler refNationalityTypesHandler;

    @GetMapping
    public ResponseEntity listAll() {
        return refNationalityTypesHandler.listRefNationalityTypesHandler();
    }
    @GetMapping(path = "/page/{page}/size/{size}")
    public ResponseEntity listAll(@PathVariable(name = "page") int page, @PathVariable(name = "size") int size) {
        return refNationalityTypesHandler.listRefNationalityTypesHandler(page, size);
    }
    @PostMapping
    public ResponseEntity<?> create(@RequestBody RefNationalityTypesDto refNationalityTypes) {
        return refNationalityTypesHandler.createRefNationalityTypesHandler(refNationalityTypes);
    }
    @PutMapping
    public ResponseEntity<?> update(@RequestBody RefNationalityTypesDto refNationalityTypes) {
        return refNationalityTypesHandler.updateRefNationalityTypesHandler(refNationalityTypes);
    }
    @DeleteMapping(path = "/{id}")
    public ResponseEntity<?> delete(@PathVariable(name = "id") Integer entityId) {
        return refNationalityTypesHandler.handleRefNationalityTypesDeleteById(entityId);
    }
    @GetMapping(path = "/{id}")
    public ResponseEntity findById(@PathVariable(name = "id") Integer entityId) {
        return refNationalityTypesHandler.handleRefNationalityTypesFindById(entityId);
    }

}


