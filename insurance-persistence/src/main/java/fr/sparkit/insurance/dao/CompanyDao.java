package fr.sparkit.insurance.dao;

import fr.sparkit.insurance.entities.Company;

public interface CompanyDao extends BaseRepository<Company,Long>{
    boolean existsByName(String name);
    //boolean existsByNameAndReference_number(String name,String reference);
}
