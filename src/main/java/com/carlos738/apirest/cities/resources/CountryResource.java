package com.carlos738.apirest.cities.resources;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.carlos738.apirest.countries.enitities.Country;
import com.carlos738.apirest.countries.repositories.CountryRepository;

@RestController
public class CountryResource {

  private final CountryRepository repository;

  public CountryResource(final CountryRepository repository) {
    this.repository = repository;
  }

  @GetMapping("/countries")
  public List<Country> cities() {

    return repository.findAll();
  }
}
