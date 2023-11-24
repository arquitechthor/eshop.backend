package com.arquitechthor.eshop.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.arquitechthor.eshop.request.PriceRequest;
import com.arquitechthor.eshop.response.PriceResponse;
import com.arquitechthor.eshop.service.PriceService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/v1")
@AllArgsConstructor
public class PriceController {
	
	private final PriceService priceService;

    @RequestMapping(value = "/price" ,method = RequestMethod.POST)
    public ResponseEntity<PriceResponse> getPrice(@RequestBody PriceRequest priceRequest) {
        
    	PriceResponse priceResponse = priceService.getPricebyDateProductAndBrand(priceRequest);
    	
        if (priceResponse != null) {
            return ResponseEntity.ok(priceResponse);
        } else {
            return new ResponseEntity<PriceResponse>(HttpStatus.NOT_FOUND);
        }
    }

}
