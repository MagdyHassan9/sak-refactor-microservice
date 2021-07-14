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

import com.info.sak.lookup.support.dto.RefRequestSourceDto;
import com.info.sak.lookup.support.handler.RefRequestSourceHandler;

import lombok.AllArgsConstructor;

@CrossOrigin
@RestController
@RequestMapping("/lookup-request-source")
@AllArgsConstructor
public class RefRequestSourceController {


    private RefRequestSourceHandler requestSourceHandler;

    @GetMapping
    public ResponseEntity listAll() {
        return requestSourceHandler.list();
    }

    @GetMapping(path = "/page/{page}/size/{size}")
    public ResponseEntity listAll(@PathVariable(name = "page") int page, @PathVariable(name = "size") int size) {
        return requestSourceHandler.list(page, size);
    }

    @PostMapping
    public ResponseEntity<?> create(@RequestBody RefRequestSourceDto requestSourceDto) {
        return requestSourceHandler.create(requestSourceDto);
    }

    @PutMapping
    public ResponseEntity<?> update(@RequestBody RefRequestSourceDto refRequestSourceDto) {
        return requestSourceHandler.update(refRequestSourceDto);
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<?> delete(@PathVariable(name = "id") Integer entityId) {
        return requestSourceHandler.delete(entityId);
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity findById(@PathVariable(name = "id") Integer entityId) {
        return requestSourceHandler.findById(entityId);
    }

}
