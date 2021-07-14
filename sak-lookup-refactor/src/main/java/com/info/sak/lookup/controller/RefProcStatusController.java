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

import com.info.sak.lookup.support.dto.RefProcStatusDto;
import com.info.sak.lookup.support.handler.RefProcStatusHandler;

import lombok.AllArgsConstructor;


@CrossOrigin
@RestController
@RequestMapping("/ ref-proc-status")
@AllArgsConstructor
public class RefProcStatusController {
    private RefProcStatusHandler procStatusHandler;

    @GetMapping
    public ResponseEntity listAll() {
        return procStatusHandler.list();
    }

    @GetMapping(path = "/page/{page}/size/{size}")
    public ResponseEntity listAll(@PathVariable(name = "page") int page, @PathVariable(name = "size") int size) {
        return procStatusHandler.list(page, size);
    }

    @PostMapping
    public ResponseEntity<?> create(@RequestBody RefProcStatusDto procStatusDto) {
        return procStatusHandler.create(procStatusDto);
    }

    @PutMapping
    public ResponseEntity<?> update(@RequestBody RefProcStatusDto procStatusDto) {
        return procStatusHandler.update(procStatusDto);
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<?> delete(@PathVariable(name = "id") Integer entityId) {
        return procStatusHandler.delete(entityId);
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity findById(@PathVariable(name = "id") Integer entityId) {
        return procStatusHandler.findById(entityId);
    }
}
