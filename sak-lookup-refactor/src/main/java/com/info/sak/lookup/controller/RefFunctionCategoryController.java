package com.info.sak.lookup.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.info.sak.lookup.entity.RefFunctionCategory;
import com.info.sak.lookup.service.RefFunctionCategoryService;
import com.info.sak.lookup.support.dto.RefFunctionCategoryDto;
import com.info.sak.lookup.support.handler.RefFunctionCategoryHandler;
import com.info.sak.lookup.support.mapper.RefFunctionCategoryMapper;

import lombok.AllArgsConstructor;

@CrossOrigin
@RestController
@RequestMapping("/ref-function-category")
@AllArgsConstructor
public class RefFunctionCategoryController {

    private RefFunctionCategoryService functionCategoryService;
    private RefFunctionCategoryHandler functionCategoryHandler;
    private RefFunctionCategoryMapper functionCategoryMapper;

    @GetMapping
    public ResponseEntity listAll() {
        return new ResponseEntity(
                functionCategoryHandler.handleRefFunctionCategoryRemoveNestedObject(
                        functionCategoryService.listAll()), HttpStatus.OK);
    }

    @GetMapping(path = "/find")
    public ResponseEntity findById(@RequestParam(name = "id") Integer entityId) {
        RefFunctionCategory refFunctionCategory = functionCategoryService.findById(entityId);
        if (refFunctionCategory != null) {
            return new ResponseEntity(functionCategoryHandler.handleRefFunctionCategoryRemoveNestedObject(refFunctionCategory), HttpStatus.OK);
        }
        return new ResponseEntity("Not Found", HttpStatus.NOT_FOUND);
    }

    @PostMapping
    public ResponseEntity create(@RequestBody RefFunctionCategoryDto functionCategory) {
        return new ResponseEntity(
                functionCategoryHandler.handleRefFunctionCategoryRemoveNestedObject(
                        functionCategoryService.createEntity(functionCategoryMapper.toEntity(functionCategory))), HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity update(@RequestBody RefFunctionCategoryDto functionCategory) {
        return new ResponseEntity(
                functionCategoryHandler.handleRefFunctionCategoryRemoveNestedObject(
                        functionCategoryService.updateEntity(functionCategoryMapper.toEntity(functionCategory))), HttpStatus.OK);
    }

}
