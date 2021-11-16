package com.tqi.developer.Repositoy;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tqi.developer.entities.Country;

public interface CountryRepository extends JpaRepository<Country, Long>{

}
