package com.arquitechthor.eshop.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.arquitechthor.eshop.entity.Price;
import com.arquitechthor.eshop.repository.PriceRepository;
import com.arquitechthor.eshop.request.PriceRequest;
import com.arquitechthor.eshop.response.PriceResponse;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PriceService {
	
	private final PriceRepository priceRepository;
	
	public PriceResponse getPricebyDateProductAndBrand(PriceRequest priceRequest) {
		
		Optional<Price> priceOp = priceRepository.findFirstbyBrandProductAndDate(
				priceRequest.getApplicationDate(), 
				priceRequest.getProductId(),
				priceRequest.getBrandId());
		
		PriceResponse priceResponse = null;
        if (!priceOp.isEmpty()) {
        	Price price = priceOp.get();
        	priceResponse = PriceResponse.builder()
            		.price(price.getPrice())
            		.priceList(price.getPriceList())
            		.applicationDate(priceRequest.getApplicationDate())
            		.brandId(priceRequest.getBrandId())
            		.productId(priceRequest.getProductId())
            		.build();
        }
        
        return priceResponse;
		
	}
}
