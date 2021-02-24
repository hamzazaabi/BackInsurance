package fr.sparkit.insurance.restcontroller;

import fr.sparkit.insurance.dto.CompanyDto;
import fr.sparkit.insurance.services.ICompanySerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:3000")
@RequestMapping("/api/insurance/Company")
public class CompanyController {
private ICompanySerivce iCompanySerivce;
@Autowired
    public CompanyController(ICompanySerivce iCompanySerivce) {
        this.iCompanySerivce = iCompanySerivce;
    }
    @PostMapping()
    public ResponseEntity<CompanyDto> save(@RequestBody CompanyDto companyDto)   {
    System.out.println("post company");
       return this.iCompanySerivce.save(companyDto);
    }
    @GetMapping("/All")
    public List<CompanyDto> getAllCompanies()   {
        System.out.println("post company");
        return this.iCompanySerivce.getAllCompanies();
    }
    @DeleteMapping("/{id}")
    public boolean deleteCompany(@PathVariable Long id)   {
        System.out.println("delete company");
        return this.iCompanySerivce.deleteCompany(id);
    }
    @PutMapping("/update/{id}")
    public CompanyDto updateCompany(@PathVariable Long id,@RequestBody CompanyDto CompanyDto) throws Exception {
        System.out.println("put company"+id);
    return this.iCompanySerivce.update(CompanyDto,id);
    }
    @GetMapping("/{id}")
    public CompanyDto getCompany(@PathVariable Long id)   {
        System.out.println("get company"+id);
        return this.iCompanySerivce.getCompany(id);
    }



}
