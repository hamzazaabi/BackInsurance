package fr.sparkit.insurance.restcontroller;

import fr.sparkit.insurance.dto.AssuranceDto;
import fr.sparkit.insurance.dto.AssuranceDtoPage;
import fr.sparkit.insurance.entities.Assurance;
import fr.sparkit.insurance.services.IAssuranceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:3000")
@RequestMapping("/api/insurance/Insurance")
public class InssuranceController {

    private final IAssuranceService iAssuranceService;

    @Autowired
    public InssuranceController(IAssuranceService iAssuranceService) {
        this.iAssuranceService = iAssuranceService;
    }

    @PostMapping("/saveAssurance")
    public ResponseEntity<AssuranceDto> saveAssurance(@RequestBody AssuranceDto assuranceDto) {
        return new ResponseEntity<>(iAssuranceService.Saveinsurance(assuranceDto), HttpStatus.CREATED);
    }
    @GetMapping("/GetAssurance")
    public List<Assurance> getAssurance() {
   return iAssuranceService.findall();
    }
}
