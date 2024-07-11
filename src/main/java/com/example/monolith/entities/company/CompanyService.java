package com.example.monolith.entities.company;

import java.util.List;

public interface CompanyService {

    List<Company> getAll();

    boolean updateById(Company company, Long id);

    void create(Company company);

    boolean deleteById(Long id);

    Company getById(Long id);

}
