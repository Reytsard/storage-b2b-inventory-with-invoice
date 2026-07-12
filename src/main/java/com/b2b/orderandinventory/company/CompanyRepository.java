package com.b2b.orderandinventory.company;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.b2b.orderandinventory.model.Company;

@Repository
public interface CompanyRepository extends JpaRepository<Company, Long> {
    Optional<Company> findByNameIgnoreCase(String name);
    Optional<Boolean> existsByNameIgnoreCase(String name);
    Boolean existsByNameIgnoreCaseAndAddressIgnoreCase(String name, String address);
}
