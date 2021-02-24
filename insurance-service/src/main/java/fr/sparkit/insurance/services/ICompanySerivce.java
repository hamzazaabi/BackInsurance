package fr.sparkit.insurance.services;

import fr.sparkit.insurance.dto.CompanyDto;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface ICompanySerivce {

    ResponseEntity<CompanyDto> save(CompanyDto company);
    List<CompanyDto> getAllCompanies();
    boolean deleteCompany(Long id);
    CompanyDto update(CompanyDto company,Long id) throws Exception;
    CompanyDto getCompany(Long id);



}
