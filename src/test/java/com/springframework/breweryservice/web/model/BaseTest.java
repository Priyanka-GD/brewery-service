package com.springframework.breweryservice.web.model;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

class BaseTest {
    JsonPojo getJsonPogo()
    {
        return JsonPojo.builder().id(UUID.randomUUID())
                .beerName("Galaxy Cat")
                .beerStyle("PALE_ALE")
                .upc(1246895L)
                .createdDate(OffsetDateTime.now())
                .myLocalDate(LocalDate.now())
                .build();
    }

}