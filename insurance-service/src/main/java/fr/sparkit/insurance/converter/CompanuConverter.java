package fr.sparkit.insurance.converter;

import fr.sparkit.insurance.dto.AssuranceDto;
import fr.sparkit.insurance.dto.CompanyDto;
import fr.sparkit.insurance.entities.Assurance;
import fr.sparkit.insurance.entities.Company;
import org.modelmapper.ModelMapper;

import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class CompanuConverter {
    private  static ModelMapper modelMapper = new ModelMapper();
    public static CompanyDto modelToDto(Company company)
    {
        return modelMapper.map(company,CompanyDto.class);
    }
    public static Company dtoToModel(CompanyDto companydto)
    {
        return new Company(companydto.getName(),companydto.getReference_number(),companydto.getEmail(),companydto.getDateCreation(),companydto.getCountry(),companydto.getTypeInsurance());
    }
    public static List<CompanyDto> modelsToDtos(Collection<Company> company) {
        return company.stream().filter(Objects::nonNull).map(CompanuConverter::modelToDto).collect(Collectors.toList());
    }
}
