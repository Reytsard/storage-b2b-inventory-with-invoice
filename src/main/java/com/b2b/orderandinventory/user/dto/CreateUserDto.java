package com.b2b.orderandinventory.user.dto;

public class CreateUserDto {
    private String firstName;
    private String lastName;
    private String middleName;
    private String companyName;
    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public CreateUserDto(String firstName, String lastName, String middleName, String companyName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.companyName = companyName;
    }
}
