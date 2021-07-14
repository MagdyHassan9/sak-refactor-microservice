package com.info.sak.lookup.controller;

import java.util.List;

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

import com.info.sak.lookup.entity.RefResourcesFunction;
import com.info.sak.lookup.service.RefResourcesFunctionService;
import com.info.sak.lookup.support.dto.RefResourcesFunctionDto;
import com.info.sak.lookup.support.mapper.RefResourcesFunctionMapper;
import com.info.sak.lookup.support.response.base.SuccessPageResponse;

import lombok.AllArgsConstructor;

@CrossOrigin
@RestController
@RequestMapping("/resources-function")
@AllArgsConstructor
public class RefResourcesFunctionController {

    private RefResourcesFunctionMapper resourcesFunctionMapper;
    private RefResourcesFunctionService resourcesFunctionService;

    @GetMapping
    public ResponseEntity<?> listAll() {
        List<RefResourcesFunctionDto> resourcesFunctionDtoList = resourcesFunctionMapper.toDtoList(resourcesFunctionService.listAll());
        return new ResponseEntity<>(new SuccessPageResponse(resourcesFunctionDtoList, (long) resourcesFunctionDtoList.size()), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<?> create(@RequestBody RefResourcesFunctionDto resourcesFunctionDto) {
        return new ResponseEntity<>(
                resourcesFunctionMapper.toDto(resourcesFunctionService.createEntity(resourcesFunctionMapper.toEntity(resourcesFunctionDto))),
                HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<?> update(@RequestBody RefResourcesFunctionDto resourcesFunctionDto) {
        return new ResponseEntity<>(
                resourcesFunctionMapper.toDto(resourcesFunctionService.updateEntity(resourcesFunctionMapper.toEntity(resourcesFunctionDto))),
                HttpStatus.CREATED);
    }

    @GetMapping(path = "/find")
    public ResponseEntity findById(@RequestParam(name = "id") Integer entityId) {
        RefResourcesFunction resourcesFunction = resourcesFunctionService.findById(entityId);
        if (resourcesFunction != null) {
            return new ResponseEntity(resourcesFunctionMapper.toDto(resourcesFunction), HttpStatus.OK);
        }
        return new ResponseEntity("Not Found ", HttpStatus.NOT_FOUND);
    }
}
