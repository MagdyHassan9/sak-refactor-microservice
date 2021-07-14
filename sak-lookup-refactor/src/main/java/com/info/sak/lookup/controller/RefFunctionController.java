package com.info.sak.lookup.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.info.sak.lookup.support.dto.RefFunctionDto;
import com.info.sak.lookup.support.handler.RefFunctionHandler;

import lombok.AllArgsConstructor;

@CrossOrigin
@RestController
@RequestMapping("/ref-function")
@AllArgsConstructor
public class RefFunctionController {

    private RefFunctionHandler functionHandler;

    @GetMapping
    public ResponseEntity listAll() {
        return functionHandler.listRefFunctionHandler();
    }

    @GetMapping(path = "/list")
    public ResponseEntity listAll(@RequestParam(name = "page") int page, @RequestParam(name = "size") int size) {
        return functionHandler.listRefFunctionHandler(page, size);
    }

    @PostMapping
    public ResponseEntity<?> create(@RequestBody RefFunctionDto refFunction) {
        return functionHandler.createRefFunctionHandler(refFunction);
    }

    @PutMapping
    public ResponseEntity<?> update(@RequestBody RefFunctionDto refFunction) {
        return functionHandler.updateRefFunctionHandler(refFunction);
    }

    @DeleteMapping(path = "/delete")
    public ResponseEntity<?> delete(@RequestParam(name = "id") Integer entityId) {
        return functionHandler.handleRefFunctionDeleteById(entityId);
    }


    @GetMapping(path = "/find")
    public ResponseEntity findById(@RequestParam(name = "id") Integer entityId) {
        return functionHandler.handleRefFunctionFindById(entityId);
    }


}
