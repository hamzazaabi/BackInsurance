package fr.sparkit.insurance.services.impl;

import fr.sparkit.insurance.converter.CompanuConverter;
import fr.sparkit.insurance.dao.CompanyDao;
import fr.sparkit.insurance.dto.CompanyDto;
import fr.sparkit.insurance.entities.Company;
import fr.sparkit.insurance.services.ICompanySerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class CompanyImpl implements ICompanySerivce {
    private CompanyDao companyDao;
  @Autowired
    public CompanyImpl(CompanyDao companyDao) {
        this.companyDao = companyDao;
    }


    @Override
    public ResponseEntity<CompanyDto> save(CompanyDto companydto)   {

        if(companyDao.existsByName(companydto.getName())==false)
        {

            Company CompanyTosave = CompanuConverter.dtoToModel(companydto);
           this.companyDao.saveAndFlush(CompanyTosave);
            companydto.setId(CompanyTosave.getId());
         }

        return new ResponseEntity<CompanyDto>(companydto , HttpStatus.OK ) ;
    }

    @Override
    public List<CompanyDto> getAllCompanies() {
    List<Company> Companies = this.companyDao.findAll();

      return CompanuConverter.modelsToDtos(Companies);
    }

    @Override
    public boolean deleteCompany(Long id) {
     if( this.companyDao.findById(id).isPresent())
     {
         this.companyDao.delete(id, UUID.randomUUID());
         return true;
     }

        return false;
    }

    @Override
    public CompanyDto update(CompanyDto companydto,Long id) throws Exception {
         if(this.companyDao.findById(id).isPresent()) {
             companydto.setId(id);
             Company company = CompanuConverter.dtoToModel(companydto);
             company.setId(id);
             this.companyDao.saveAndFlush(company);
             return  companydto;

         }
         throw new Exception("Company Not Found");



    }

    @Override
    public CompanyDto getCompany(Long id) {

        return CompanuConverter.modelToDto(this.companyDao.findById(id).get());

    }
}
