package com.messomPimentel.citiesapi.repository;

import com.messomPimentel.citiesapi.countries.Country;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;

import java.awt.print.Pageable;

public interface CountryRepository extends JpaRepository<Country, Long> {

    Page<Country> findAll(Pageable page);
}
