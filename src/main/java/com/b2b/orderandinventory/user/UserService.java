package com.b2b.orderandinventory.user;

import com.b2b.orderandinventory.company.CompanyService;
import com.b2b.orderandinventory.exception.UserAlreadyExistsException;
import com.b2b.orderandinventory.model.Company;
import com.b2b.orderandinventory.model.User;
import com.b2b.orderandinventory.user.dto.CreateUserDto;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepository userRepository;
    private final CompanyService companyService;

    public UserService(UserRepository userRepository, CompanyService companyService) {
        this.userRepository = userRepository;
        this.companyService = companyService;
    }

    public User createUser(CreateUserDto createUserDto) {
        Company company = companyService.findByName(createUserDto.getCompanyName());
        if (!userRepository.existsByEmailIgnoreCase(createUserDto.getEmail())) {

            User u = new User();
            u.setFirstName(createUserDto.getFirstName());
            u.setLastName(createUserDto.getLastName());
            u.setMiddleName(createUserDto.getMiddleName());
            u.setCompany(company);

            return userRepository.save(u);

        }
        throw new UserAlreadyExistsException(createUserDto.getEmail());

    }
}
