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

import com.info.sak.lookup.support.dto.RefPeriodDto;
import com.info.sak.lookup.support.handler.RefPeriodHandler;

import lombok.AllArgsConstructor;

@CrossOrigin
@RestController
@RequestMapping("/ref-period")
@AllArgsConstructor
public class RefPeriodController {

    private RefPeriodHandler periodHandler;

    @GetMapping
    public ResponseEntity listAll() {
        return periodHandler.list();
    }

    @GetMapping(path = "/page/{page}/size/{size}")
    public ResponseEntity listAll(@PathVariable(name = "page") int page, @PathVariable(name = "size") int size) {
        return periodHandler.list(page, size);
    }

    @PostMapping
    public ResponseEntity<?> create(@RequestBody RefPeriodDto periodDto) {
        return periodHandler.create(periodDto);
    }

    @PutMapping
    public ResponseEntity<?> update(@RequestBody RefPeriodDto periodDto) {
        return periodHandler.update(periodDto);
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<?> delete(@PathVariable(name = "id") Integer entityId) {
        return periodHandler.delete(entityId);
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity findById(@PathVariable(name = "id") Integer entityId) {
        return periodHandler.findById(entityId);
    }
}
