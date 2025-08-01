package com.example.ormlearn.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.ormlearn.model.Country;

@Repository
public interface CountryRepository extends JpaRepository<Country, String> {
}