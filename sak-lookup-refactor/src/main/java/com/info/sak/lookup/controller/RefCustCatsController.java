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

import com.info.sak.lookup.support.dto.RefCustCatsDto;
import com.info.sak.lookup.support.handler.RefCustCatsHandler;

import lombok.AllArgsConstructor;

@CrossOrigin
@RestController
@RequestMapping("/ref-cust-cats")
@AllArgsConstructor
public class RefCustCatsController {
    private RefCustCatsHandler refCustCatsHandler;
    
    @GetMapping
    public ResponseEntity listAll() {
    	return refCustCatsHandler.listRefCustCatsHandler();
    }
    
    @GetMapping(path = "/page/{page}/size/{size}")
    public ResponseEntity listAll(@PathVariable(name = "page") int page, @PathVariable(name = "size") int size) {
        return refCustCatsHandler.listRefCustCatsHandler(page, size);
    }
    
    @PostMapping
    public ResponseEntity<?> create(@RequestBody RefCustCatsDto refCustCatsDto) {
        return refCustCatsHandler.createRefCustCatsHandler(refCustCatsDto);
    }
    @PutMapping
    public ResponseEntity<?> update(@RequestBody RefCustCatsDto refCustCatsDto) {
        return refCustCatsHandler.updateRefCustCatsHandler(refCustCatsDto);
    }
    @DeleteMapping(path = "/{id}")
    public ResponseEntity<?> delete(@PathVariable(name = "id") Integer entityId) {
        return refCustCatsHandler.handleRefCustCatsDeleteById(entityId);
    }
    @GetMapping(path = "/{id}")
    public ResponseEntity findById(@PathVariable(name = "id") Integer entityId) {
    	return refCustCatsHandler.handleRefCustCatsFindById(entityId);
    }

    
}
