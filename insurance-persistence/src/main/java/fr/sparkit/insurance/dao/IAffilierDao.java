package fr.sparkit.insurance.dao;

import fr.sparkit.insurance.dto.AffilierDto;
import fr.sparkit.insurance.entities.Affilier;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface  IAffilierDao extends  BaseRepository<Affilier,Long>{


}
