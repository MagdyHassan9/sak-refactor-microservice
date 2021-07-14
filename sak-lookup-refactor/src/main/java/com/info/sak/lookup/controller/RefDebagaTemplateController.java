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

import com.info.sak.lookup.support.dto.RefDebagaTemplateDto;
import com.info.sak.lookup.support.handler.RefDebagaTemplateHandler;

import lombok.AllArgsConstructor;


@CrossOrigin
@RestController
@RequestMapping("/ref-debaga-template")
@AllArgsConstructor
public class RefDebagaTemplateController {
    private RefDebagaTemplateHandler debagaTemplateHandler;

    @GetMapping
    public ResponseEntity listAll() {
        return debagaTemplateHandler.listRefDebagaTemplateHandler();
    }

    @GetMapping(path = "/page/{page}/size/{size}")
    public ResponseEntity listAll(@PathVariable(name = "page") int page, @PathVariable(name = "size") int size) {
        return debagaTemplateHandler.listRefDebagaTemplateHandler(page, size);
    }

    @GetMapping(path = "/request-type-id/{request-type-id}")
    public ResponseEntity getBYRequestId(@PathVariable(name = "request-type-id") Integer page) {
        return debagaTemplateHandler.listRefDebagaTemplateHandler(page);
    }

    @PostMapping
    public ResponseEntity<?> create(@RequestBody RefDebagaTemplateDto refDebagaTemplateDto) {
        return debagaTemplateHandler.createRefDebagaTemplateHandler(refDebagaTemplateDto);
    }

    @PutMapping
    public ResponseEntity<?> update(@RequestBody RefDebagaTemplateDto refDebagaTemplate) {
        return debagaTemplateHandler.updateRefDebagaTemplateHandler(refDebagaTemplate);
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<?> delete(@PathVariable(name = "id") Integer entityId) {
        return debagaTemplateHandler.handleRefDebagaTemplateDeleteById(entityId);
    }
    @GetMapping(path = "/{id}")
    public ResponseEntity findById(@PathVariable(name = "id") Integer entityId) {
        return debagaTemplateHandler.handleRefDebagaTemplateFindById(entityId);
    }

}
