package com.cognizant.orm_learn.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cognizant.orm_learn.model.Country;
import com.cognizant.orm_learn.repository.CountryRepository;
import com.cognizant.orm_learn.service.exception.CountryNotFoundException;

@Service
public class CountryService {

    @Autowired
    private CountryRepository countryRepository;

    @Transactional
    public List<Country> getAllCountries() {
        return countryRepository.findAll();
    }

    @Transactional
    public Country findCountryByCode(String code)
            throws CountryNotFoundException {

        Optional<Country> result = countryRepository.findById(code);

        if (result.isEmpty()) {
            throw new CountryNotFoundException("Country Not Found");
        }

        return result.get();
    }

    @Transactional
    public List<Country> searchCountries(String text) {

        return countryRepository.findByNameContaining(text);

    }

    @Transactional
    public List<Country> searchCountriesSorted(String text) {

        return countryRepository.findByNameContainingOrderByNameAsc(text);

    }

    @Transactional
    public List<Country> searchCountriesStartingWith(String alphabet) {

        return countryRepository.findByNameStartingWith(alphabet);

    }

}