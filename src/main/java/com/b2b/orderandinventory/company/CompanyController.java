package com.b2b.orderandinventory.company;

import com.b2b.orderandinventory.company.dto.CreateCompanyDto;
import com.b2b.orderandinventory.exception.CompanyAlreadyExistsException;
import com.b2b.orderandinventory.model.Company;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/company")
public class CompanyController {

    private final CompanyService companyService;

    public CompanyController(CompanyService companyService) {
        this.companyService = companyService;
    }

    @PostMapping
    public ResponseEntity<Company> createCompany(CreateCompanyDto createCompanyDto){
        return ResponseEntity.ok(companyService.save(createCompanyDto));
    }

}
