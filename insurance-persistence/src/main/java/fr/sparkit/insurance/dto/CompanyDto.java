package fr.sparkit.insurance.dto;

import lombok.*;

import javax.persistence.Column;
import java.util.Date;

@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class CompanyDto extends  AuditableDto{

     private Long id;
     private String name;
     private String reference_number;
     private String email;
     private String country;
     private int  NumberEmp;
     private String TypeInsurance;
     private Date DateCreation;

}
