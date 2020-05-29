package com.springframework.breweryservice.repositories;

import com.springframework.breweryservice.domain.Beer;
import com.sun.xml.bind.v2.model.core.ID;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.UUID;

public interface BeerRepository extends PagingAndSortingRepository<Beer, UUID> {

}
