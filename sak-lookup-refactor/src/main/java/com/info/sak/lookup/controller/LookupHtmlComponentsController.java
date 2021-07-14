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

import com.info.sak.lookup.support.dto.LookupHtmlComponentsDto;
import com.info.sak.lookup.support.handler.LookupHtmlComponentsHandler;

import lombok.AllArgsConstructor;

@CrossOrigin
@RestController
@RequestMapping("/lookup-html-components")
@AllArgsConstructor
public class LookupHtmlComponentsController {

    private LookupHtmlComponentsHandler htmlComponentsHandler;

    @GetMapping
    public ResponseEntity listAll() {
        return htmlComponentsHandler.list();
    }

    @GetMapping(path = "/page/{page}/size/{size}")
    public ResponseEntity listAll(@PathVariable(name = "page") int page, @PathVariable(name = "size") int size) {
        return htmlComponentsHandler.list(page, size);
    }

    @PostMapping
    public ResponseEntity<?> create(@RequestBody LookupHtmlComponentsDto htmlComponentsDto) {
        return htmlComponentsHandler.create(htmlComponentsDto);
    }

    @PutMapping
    public ResponseEntity<?> update(@RequestBody LookupHtmlComponentsDto htmlComponentsDto) {
        return htmlComponentsHandler.update(htmlComponentsDto);
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<?> delete(@PathVariable(name = "id") Integer entityId) {
        return htmlComponentsHandler.delete(entityId);
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity findById(@PathVariable(name = "id") Integer entityId) {
        return htmlComponentsHandler.findById(entityId);
    }
}
