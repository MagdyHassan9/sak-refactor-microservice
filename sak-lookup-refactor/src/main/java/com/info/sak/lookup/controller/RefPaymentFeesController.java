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

import com.info.sak.lookup.support.dto.RefPaymentFeesDto;
import com.info.sak.lookup.support.handler.RefPaymentFeesHandler;

import lombok.AllArgsConstructor;

@CrossOrigin
@RestController
@RequestMapping("/Ref-payment-fees")
@AllArgsConstructor
public class RefPaymentFeesController {

    private RefPaymentFeesHandler paymentFeesHandler;

    @GetMapping
    public ResponseEntity listAll() {
        return paymentFeesHandler.list();
    }

    @GetMapping(path = "/page/{page}/size/{size}")
    public ResponseEntity listAll(@PathVariable(name = "page") int page, @PathVariable(name = "size") int size) {
        return paymentFeesHandler.list(page, size);
    }

    @PostMapping
    public ResponseEntity<?> create(@RequestBody RefPaymentFeesDto refPaymentFeesDto) {
        return paymentFeesHandler.create(refPaymentFeesDto);
    }

    @PutMapping
    public ResponseEntity<?> update(@RequestBody RefPaymentFeesDto refPaymentFeesDto) {
        return paymentFeesHandler.update(refPaymentFeesDto);
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<?> delete(@PathVariable(name = "id") Integer entityId) {
        return paymentFeesHandler.delete(entityId);
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity findById(@PathVariable(name = "id") Integer entityId) {
        return paymentFeesHandler.findById(entityId);
    }
}