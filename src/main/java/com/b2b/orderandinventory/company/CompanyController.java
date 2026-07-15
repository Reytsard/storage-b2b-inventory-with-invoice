package com.b2b.orderandinventory.company;

import com.b2b.orderandinventory.company.dto.CompanyResponse;
import com.b2b.orderandinventory.company.dto.CreateCompanyDto;
import com.b2b.orderandinventory.exception.CompanyAlreadyExistsException;
import com.b2b.orderandinventory.mapper.EntityMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/company")
public class CompanyController {

    private final CompanyService companyService;
    private final EntityMapper mapper;

    public CompanyController(CompanyService companyService, EntityMapper mapper) {
        this.companyService = companyService;
        this.mapper = mapper;
    }

    @PostMapping
    public ResponseEntity<CompanyResponse> createCompany(CreateCompanyDto createCompanyDto){
        return ResponseEntity.ok(mapper.toResponse(companyService.save(createCompanyDto)));
    }

    @GetMapping
    public ResponseEntity<List<CompanyResponse>> findAll(){
        return ResponseEntity.ok(mapper.toCompanyResponseList(companyService.findAll()));
    }

}
