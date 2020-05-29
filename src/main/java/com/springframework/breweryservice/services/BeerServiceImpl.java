package com.springframework.breweryservice.services;

import com.springframework.breweryservice.web.model.BeerDto;

import java.util.UUID;

import com.springframework.breweryservice.web.model.BeerStyleEnum;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;
@Service
@Slf4j
public class BeerServiceImpl implements BeerService {
    @Override
    public BeerDto getBeerById(UUID beerId) {
        return BeerDto.builder().id(UUID.randomUUID()).
                beerName("Galaxy Cat")
                .beerStyle(BeerStyleEnum.valueOf("PALE_ALE"))
                .build();
    }

    @Override
    public BeerDto savedNewBeer(BeerDto beerDto) {
        return BeerDto.builder()
                .id(UUID.randomUUID())
                .build();
    }

    @Override
    public void updateBeer(UUID beerId, BeerDto beerDto) {
        //to-do
    }

    @Override
    public void deleteBeer(UUID beerId) {
        log.debug("Deleting beer...");
    }

}