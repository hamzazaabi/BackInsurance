package fr.sparkit.insurance.services.impl;

import fr.sparkit.insurance.dao.IAffilierDao;
import fr.sparkit.insurance.dto.AffilierDto;
import fr.sparkit.insurance.entities.Affilier;
import fr.sparkit.insurance.services.IAffilierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
   @Service
public class AffilierServiceImpl implements IAffilierService {
    private IAffilierDao affilierDao;
 @Autowired
    public AffilierServiceImpl(IAffilierDao affilierDao) {
        this.affilierDao = affilierDao;
    }

    @Override
    public List<Affilier> FindVipClient() {
     List<Affilier> list = new ArrayList<>();
        affilierDao.save(new Affilier(1L,"hamza","zaabi",true));
        affilierDao.save(new Affilier(2L,"houda","attlah",true));
        affilierDao.save(new Affilier(3L,"xxxx","yyy",false));
      affilierDao.findAll().forEach((s)->{
         System.out.println("1");
         if(s.isIsClientVip()==true)
              list.add(s);
     }

    );
        return list;
    }


}
