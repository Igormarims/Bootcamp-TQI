package com.tqi.java.developer.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tqi.java.developer.entities.Country;

public interface CountryRepository extends JpaRepository<Country, Long>{

}
