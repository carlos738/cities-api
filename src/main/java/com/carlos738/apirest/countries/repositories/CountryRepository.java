package com.carlos738.apirest.countries.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.carlos738.apirest.countries.enitities.Country;

public interface CountryRepository extends JpaRepository<Country, Long>{

}
