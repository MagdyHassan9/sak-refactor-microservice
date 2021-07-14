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

import com.info.sak.lookup.support.dto.LookupRequestStatusDto;
import com.info.sak.lookup.support.handler.LookupRequestStatusHandler;

import lombok.AllArgsConstructor;

@CrossOrigin
@RestController
@RequestMapping("/lookup/request-status")
@AllArgsConstructor
public class LookupRequestStatusController {

    private LookupRequestStatusHandler requestStatusHandler;

    @GetMapping
    public ResponseEntity listAll() {
        return requestStatusHandler.list();
    }

    @GetMapping(path = "/page/{page}/size/{size}")
    public ResponseEntity listAll(@PathVariable(name = "page") int page, @PathVariable(name = "size") int size) {
        return requestStatusHandler.list(page, size);
    }

    @PostMapping
    public ResponseEntity<?> create(@RequestBody LookupRequestStatusDto requestStatusDto) {
        return requestStatusHandler.create(requestStatusDto);
    }

    @PutMapping
    public ResponseEntity<?> update(@RequestBody LookupRequestStatusDto requestStatusDto) {
        return requestStatusHandler.update(requestStatusDto);
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<?> delete(@PathVariable(name = "id") Integer entityId) {
        return requestStatusHandler.delete(entityId);
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity findById(@PathVariable(name = "id") Integer entityId) {
        return requestStatusHandler.findById(entityId);
    }

}
