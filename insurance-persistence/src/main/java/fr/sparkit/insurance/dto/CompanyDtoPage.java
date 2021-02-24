package fr.sparkit.insurance.dto;

import fr.sparkit.insurance.entities.Company;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CompanyDtoPage {

    private List<Company> companysDtoList;
    private Long totalItems;
}
