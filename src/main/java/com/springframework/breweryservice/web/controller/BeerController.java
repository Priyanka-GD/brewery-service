package com.springframework.breweryservice.web.controller;

import com.springframework.breweryservice.web.model.BeerDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RequestMapping("/api/v1/beer")
@RestController
public class BeerController {

    @GetMapping({"/{beerId}"})
    public ResponseEntity<BeerDto> getBeerById(@PathVariable("beerId")UUID beerId)
        {
            //to-do
            return new ResponseEntity<>(BeerDto.builder().build(), HttpStatus.OK);
        }
    @PostMapping
    public ResponseEntity saveNewBeer(@RequestBody BeerDto beerBto)
    {
        //to-do
        return new ResponseEntity(HttpStatus.CREATED);
    }
    @PutMapping({"/{beerId}"})
    public ResponseEntity updateBeer(@PathVariable("beerId")UUID beerId,@RequestBody BeerDto beerBto)
    {
        //to-do
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }
    @DeleteMapping({"/{beerId}"})
    public void deleteBeer(@PathVariable("beerId")UUID beerId)
    {
        //to-do

    }
        }
