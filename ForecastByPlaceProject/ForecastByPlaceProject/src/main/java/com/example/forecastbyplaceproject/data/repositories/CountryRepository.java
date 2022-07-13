package com.example.forecastbyplaceproject.data.repositories;

import com.example.forecastbyplaceproject.data.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepository extends JpaRepository<Country,Long> {
    Country getCountryByCountryName(String name);
}
