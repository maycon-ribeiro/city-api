package com.github.mayconribeiro.cityapi.countries.repository;

import com.github.mayconribeiro.cityapi.countries.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
