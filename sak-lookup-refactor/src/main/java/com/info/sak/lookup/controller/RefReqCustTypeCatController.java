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

import com.info.sak.lookup.support.dto.RefReqCustTypeCatDto;
import com.info.sak.lookup.support.handler.RefReqCustTypeCatHandler;

import lombok.AllArgsConstructor;

@CrossOrigin
@RestController
@RequestMapping("/ref-req-cust-type-cat")
@AllArgsConstructor
public class RefReqCustTypeCatController {
    private RefReqCustTypeCatHandler refReqCustTypeCatHandler;

    @GetMapping
    public ResponseEntity listAll() {
        return refReqCustTypeCatHandler.listRefReqCustTypeCatHandler();
    }
    @GetMapping(path = "/page/{page}/size/{size}")
    public ResponseEntity listAll(@PathVariable(name = "page") int page, @PathVariable(name = "size") int size) {
        System.out.println("7asbyallahhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
        return refReqCustTypeCatHandler.listRefReqCustTypeCatHandler(page, size);
    }
    @PostMapping
    public ResponseEntity<?> create(@RequestBody RefReqCustTypeCatDto refReqCustTypeCat) {
        return refReqCustTypeCatHandler.createRefReqCustTypeCatHandler(refReqCustTypeCat);
    }
    @PutMapping
    public ResponseEntity<?> update(@RequestBody RefReqCustTypeCatDto refReqCustTypeCat) {
        return refReqCustTypeCatHandler.updateRefReqCustTypeCatHandler(refReqCustTypeCat);
    }
    @DeleteMapping(path = "/{id}")
    public ResponseEntity<?> delete(@PathVariable(name = "id") Integer entityId) {
        return refReqCustTypeCatHandler.handleRefReqCustTypeCatDeleteById(entityId);
    }
    @GetMapping(path = "/{id}")
    public ResponseEntity findById(@PathVariable(name = "id") Integer entityId) {
        return refReqCustTypeCatHandler.handleRefReqCustTypeCatFindById(entityId);
    }

}
