package com.b2b.orderandinventory.company;

import com.b2b.orderandinventory.model.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface CompanyRepository extends JpaRepository<Company, UUID> {
    Optional<Company> findByNameIgnoreCase(String name);
    Optional<Boolean> existsByNameIgnoreCase(String name);
    Boolean existsByNameIgnoreCaseAndAddressIgnoreCase(String name, String address);
}
