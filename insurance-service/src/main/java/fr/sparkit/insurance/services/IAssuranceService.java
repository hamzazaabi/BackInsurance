package fr.sparkit.insurance.services;

import fr.sparkit.insurance.dao.IAssuranceDao;
import fr.sparkit.insurance.dto.AssuranceDto;
import fr.sparkit.insurance.entities.Assurance;
import org.springframework.data.domain.Pageable;

import java.util.List;


public interface IAssuranceService {
    AssuranceDto Saveinsurance(AssuranceDto assuranceDto);

    List<Assurance> findall();

}