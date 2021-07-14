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

import com.info.sak.lookup.support.dto.RefNationalityTypesTableDto;
import com.info.sak.lookup.support.handler.RefNationalityTypesTableHandler;

import lombok.AllArgsConstructor;

@CrossOrigin
@RestController
@RequestMapping("/ref-nationality-types-table")
@AllArgsConstructor
public class RefNationalityTypesTableController {
    private RefNationalityTypesTableHandler refNationalityTypesTableHandler;

    @GetMapping
    public ResponseEntity listAll() {
        return refNationalityTypesTableHandler.listRefNationalityTypesTableHandler();
    }

    @GetMapping(path = "/page/{page}/size/{size}")
    public ResponseEntity listAll(@PathVariable(name = "page") int page, @PathVariable(name = "size") int size) {
        return refNationalityTypesTableHandler.listRefNationalityTypesTableHandler(page, size);
    }

    @PostMapping
    public ResponseEntity<?> create(@RequestBody RefNationalityTypesTableDto refNationalityTypes) {
        return refNationalityTypesTableHandler.createRefNationalityTypesTableHandler(refNationalityTypes);
    }

    @PutMapping
    public ResponseEntity<?> update(@RequestBody RefNationalityTypesTableDto refNationalityTypes) {
        return refNationalityTypesTableHandler.updateRefNationalityTypesTableHandler(refNationalityTypes);
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<?> delete(@PathVariable(name = "id") Integer entityId) {
        return refNationalityTypesTableHandler.handleRefNationalityTypesTableDeleteById(entityId);
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity findById(@PathVariable(name = "id") Integer entityId) {
        return refNationalityTypesTableHandler.handleRefNationalityTypesTableFindById(entityId);
    }
}
