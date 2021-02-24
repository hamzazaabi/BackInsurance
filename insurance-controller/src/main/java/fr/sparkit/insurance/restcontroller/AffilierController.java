package fr.sparkit.insurance.restcontroller;

import fr.sparkit.insurance.entities.Affilier;
import fr.sparkit.insurance.entities.Assurance;
import fr.sparkit.insurance.services.IAffilierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@CrossOrigin("http://localhost:3000")
@RequestMapping("/api/insurance/Affilier")
public class AffilierController {
    private IAffilierService iAffilierService;
  @Autowired
    public AffilierController(IAffilierService iAffilierService) {
        this.iAffilierService = iAffilierService;
    }


    @GetMapping("/GetAll")
    public List<Affilier> getAssurance() {

      return  iAffilierService.FindVipClient();
    }
}
