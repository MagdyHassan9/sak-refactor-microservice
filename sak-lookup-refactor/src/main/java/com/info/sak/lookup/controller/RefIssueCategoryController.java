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

import com.info.sak.lookup.support.dto.RefIssueCategoryDto;
import com.info.sak.lookup.support.handler.RefIssueCategoryHandler;

import lombok.AllArgsConstructor;


@CrossOrigin
@RestController
@RequestMapping("/ref-issue-category")
@AllArgsConstructor
public class RefIssueCategoryController {
    private RefIssueCategoryHandler refIssueCategoryHandler;

    @GetMapping
    public ResponseEntity listAll() {
        return refIssueCategoryHandler.listRefIssueCategoryHandler();
    }
    @GetMapping(path = "/page/{page}/size/{size}")
    public ResponseEntity listAll(@PathVariable(name = "page") int page, @PathVariable(name = "size") int size) {
        return refIssueCategoryHandler.listRefIssueCategoryHandler(page, size);
    }
    @PostMapping
    public ResponseEntity<?> create(@RequestBody RefIssueCategoryDto refIssueCategory) {
        return refIssueCategoryHandler.createRefIssueCategoryHandler(refIssueCategory);
    }
    @PutMapping
    public ResponseEntity<?> update(@RequestBody RefIssueCategoryDto refIssueCategory) {
        return refIssueCategoryHandler.updateRefIssueCategoryHandler(refIssueCategory);
    }
    @DeleteMapping(path = "/{id}")
    public ResponseEntity<?> delete(@PathVariable(name = "id") Integer entityId) {
        return refIssueCategoryHandler.handleRefIssueCategoryDeleteById(entityId);
    }
    @GetMapping(path = "/{id}")
    public ResponseEntity findById(@PathVariable(name = "id") Integer entityId) {
        return refIssueCategoryHandler.handleRefIssueCategoryFindById(entityId);
    }

}


