package com.springframework.breweryservice.bootstrap;

import com.springframework.breweryservice.domain.Beer;
import com.springframework.breweryservice.repositories.BeerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class BeerLoader implements CommandLineRunner {

    private final BeerRepository beerRepository;
    public BeerLoader(BeerRepository beerRepository)
    {
        this.beerRepository=beerRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        loadBeerObjects();
    }

    private void loadBeerObjects() {
        if (beerRepository.count()==0)
        {
            beerRepository.save(Beer.builder()
                    .beerName("Mango Bobs")
                    .beerStyle("IPA")
                    .quantityToBrew(200)
                    .upc(786439075L)
                    .price(new BigDecimal("12.67"))
                    .build());
            beerRepository.save(Beer.builder()
                    .beerName("Galaxy Cat")
                    .beerStyle("PALE_ALE")
                    .quantityToBrew(200)
                    .upc(7864363375L)
                    .price(new BigDecimal("19.67"))
                    .build());
        }
        System.out.println("Beers count "+beerRepository.count());
    }
}
