package fr.sparkit.insurance.services.impl;

import fr.sparkit.insurance.converter.InssuranceConverter;
import fr.sparkit.insurance.dao.IAssuranceDao;
import fr.sparkit.insurance.dto.AssuranceDto;
import fr.sparkit.insurance.entities.Assurance;
import fr.sparkit.insurance.services.IAssuranceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AssuranceServiceImpl implements IAssuranceService {
    private final  IAssuranceDao iAssuranceDao;
   @Autowired
    public AssuranceServiceImpl(IAssuranceDao iAssuranceDao) {
        this.iAssuranceDao = iAssuranceDao;
    }

    @Override
    public AssuranceDto Saveinsurance(AssuranceDto assuranceDto) {

        Assurance inssurance = InssuranceConverter.dtoToModel(assuranceDto);
        Assurance savedinssurance = iAssuranceDao.saveAndFlush(inssurance);
        assuranceDto.setId(savedinssurance.getId());
    return assuranceDto ;
    }

    @Override
    public List<Assurance> findall() {
        return this.iAssuranceDao.findAll() ;
    }


}

