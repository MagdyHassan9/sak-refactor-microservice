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

import com.info.sak.lookup.support.dto.RefParticpationTypeDto;
import com.info.sak.lookup.support.handler.RefParticpationTypeHandler;

import lombok.AllArgsConstructor;

@CrossOrigin
@RestController
@RequestMapping("/ref-particpation-type")
@AllArgsConstructor
public class RefParticpationTypeController {

    private RefParticpationTypeHandler refParticpationTypeHandler;

    @GetMapping
    public ResponseEntity listAll() {
        return refParticpationTypeHandler.listRefParticpationTypeHandler();
    }

    @GetMapping(path = "/page/{page}/size/{size}")
    public ResponseEntity listAll(@PathVariable(name = "page") int page, @PathVariable(name = "size") int size) {
        return refParticpationTypeHandler.listRefParticpationTypeHandler(page, size);
    }

    @PostMapping
    public ResponseEntity<?> create(@RequestBody RefParticpationTypeDto refParticpationTypeDto) {
        return refParticpationTypeHandler.createRefParticpationTypeHandler(refParticpationTypeDto);
    }
    @PutMapping
    public ResponseEntity<?> update(@RequestBody RefParticpationTypeDto refParticpationTypeDto) {
        return refParticpationTypeHandler.updateRefParticpationTypeHandler(refParticpationTypeDto);
    }
    @DeleteMapping(path = "/{id}")
    public ResponseEntity<?> delete(@PathVariable(name = "id") Integer entityId) {
        return refParticpationTypeHandler.handleRefParticpationTypeDeleteById(entityId);
    }
    @GetMapping(path = "/{id}")
    public ResponseEntity findById(@PathVariable(name = "id") Integer entityId) {
        return refParticpationTypeHandler.handleRefParticpationTypeFindById(entityId);
    }

}
