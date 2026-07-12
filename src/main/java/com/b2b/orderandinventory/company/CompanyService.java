package com.b2b.orderandinventory.company;

import com.b2b.orderandinventory.company.dto.CreateCompanyDto;
import com.b2b.orderandinventory.exception.CompanyAlreadyExistsException;
import com.b2b.orderandinventory.exception.CompanyDoesNotExistException;
import com.b2b.orderandinventory.model.Company;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.Optional;

@Service
public class CompanyService {
    private final CompanyRepository companyRepository;

    public CompanyService(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    public Company findByName(String name){
        return companyRepository.findByNameIgnoreCase(name).orElseThrow(() -> new CompanyDoesNotExistException(name));
    }

//    public boolean existsByName(String name){
//        return companyRepository.
//    }

    public Company save(CreateCompanyDto createCompanyDto){
        if(!companyRepository.existsByNameIgnoreCaseAndAddressIgnoreCase(createCompanyDto.getName(), createCompanyDto.getAddress())){

            Company company = new Company();
            company.setName(createCompanyDto.getName());
            company.setAddress(createCompanyDto.getAddress());

            return companyRepository.save(company);
        }
        throw new CompanyAlreadyExistsException(createCompanyDto.getName());
    }


    public Company findById(Long companyId) {
        return companyRepository.findById(companyId).orElseThrow(() -> new CompanyDoesNotExistException(companyId.toString()));
    }
}
