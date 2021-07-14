package com.info.sak.lookup.support.handler;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.info.sak.lookup.entity.RefCustomerReligious;
import com.info.sak.lookup.service.RefCustomerReligiousService;
import com.info.sak.lookup.support.dto.RefCustomerReligiousDto;
import com.info.sak.lookup.support.mapper.RefCustomerReligiousMapper;
import com.info.sak.lookup.support.response.base.SuccessPageResponse;
import com.info.sak.lookup.support.response.base.SuccessResponse;
import com.info.sak.lookup.utils.PageUtils;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Component
@AllArgsConstructor
@NoArgsConstructor
public class RefCustomerReligiousHandler {
	private RefCustomerReligiousMapper refCustomerReligiousMapper;
	private RefCustomerReligiousService refCustomerReligiousService;
    private PageUtils<RefCustomerReligious> pageUtils;

    public ResponseEntity listRefCustomerReligiousHandler() {
        List<RefCustomerReligious> customerReligiousList = refCustomerReligiousService.listAll();
        List<RefCustomerReligiousDto> refCustomerReligiousDtoList = refCustomerReligiousMapper.toDtoList(customerReligiousList);
        return ResponseEntity.status(HttpStatus.OK).body(new SuccessPageResponse(refCustomerReligiousDtoList, (long) refCustomerReligiousDtoList.size()));
    }
    
    public ResponseEntity listRefCustomerReligiousHandler(int page, int size) {
        List<RefCustomerReligious> customerReligiousList = refCustomerReligiousService.listAll();
        Page<RefCustomerReligious> refCustomerReligiousPage = pageUtils.convertListToPage(customerReligiousList, page, size);
        List<RefCustomerReligiousDto> refCustomerReligiousDtoList = refCustomerReligiousMapper.toDtoList(refCustomerReligiousPage.getContent());
        return ResponseEntity.status(HttpStatus.OK).body(new SuccessPageResponse(refCustomerReligiousDtoList, refCustomerReligiousPage.getTotalElements()));
    }
    
    public ResponseEntity createRefCustomerReligiousHandler(RefCustomerReligiousDto refCustomerReligiousDto) {
    	RefCustomerReligious refCustomerReligiousCreated = refCustomerReligiousService.createEntity(refCustomerReligiousMapper.toEntity(refCustomerReligiousDto));
        return ResponseEntity.status(HttpStatus.OK).body(new SuccessResponse(refCustomerReligiousMapper.toDto(refCustomerReligiousCreated)));
    }
    
    public ResponseEntity updateRefCustomerReligiousHandler(RefCustomerReligiousDto refCustomerReligiousDto) {
    	RefCustomerReligious refCustomerReligiousCreated = refCustomerReligiousService.updateEntity(refCustomerReligiousMapper.toEntity(refCustomerReligiousDto));
        return ResponseEntity.status(HttpStatus.OK).body(new SuccessResponse(refCustomerReligiousMapper.toDto(refCustomerReligiousCreated)));
    }
    
    public ResponseEntity handleRefCustomerReligiousFindById(Integer refCustomerReligiousId) {
    	RefCustomerReligious refCustomerReligious= refCustomerReligiousService.findById(refCustomerReligiousId);
        return ResponseEntity.status(HttpStatus.OK).body(new SuccessResponse(refCustomerReligiousMapper.toDto(refCustomerReligious)));
    }
    
    public ResponseEntity handleRefCustomerReligiousDeleteById(Integer refCustomerReligiousId) {
        refCustomerReligiousService.deleteEntity(refCustomerReligiousId);
        return ResponseEntity.status(HttpStatus.OK).body(new SuccessResponse());
    }
    
    
    
}
