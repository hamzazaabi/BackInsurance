package fr.sparkit.insurance.services;

import fr.sparkit.insurance.dto.AffilierDto;
import fr.sparkit.insurance.entities.Affilier;
import org.springframework.stereotype.Service;

import java.util.List;

public interface IAffilierService {


    List<Affilier> FindVipClient();
}
