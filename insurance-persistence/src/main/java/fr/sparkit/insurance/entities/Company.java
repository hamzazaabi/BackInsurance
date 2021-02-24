package fr.sparkit.insurance.entities;

import fr.sparkit.insurance.constraint.validators.AuditedEntity;
import lombok.*;

import javax.persistence.*;
import java.util.Date;
import java.util.UUID;

@Entity
@DiscriminatorValue("Entreprise")
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@ToString
@AuditedEntity
public class Company extends  Auditable {
   @Id
   @GeneratedValue
   @Column(name = "COM_ID")
   @EqualsAndHashCode.Include
    private Long id;
    @Column(name = "COM_NAME")
    private String name;
    @Column(name = "COM_REFERENCE_NUMBER")
    private String reference_number;
    @Column(name = "COM_EMAIL")
    private String email;
    @Column(name = "COM_COUNTRY")
    private String country;
    @Column(name = "COM_NUMBER_EMP")
    private int  NumberEmp;
    @Column(name = "COM_TYPR_INSURANCE")
    private String TypeInsurance;
    @Column(name = "COM_DATE_CREATION")
    private Date DateCreation;

    @Column(name = "COM_IS_DELETED")
    private boolean isDeleted;

    @Column(name = "COM_DELETED_TOKEN")
    private UUID deletedToken;


    @Column(name = "COM_IS_ARCHIVED")
    private boolean isArchived;

 public Company(String name,String reference_number,String email, Date dateCreation, String country, String typeInsurance) {
  this.email= email;
  this.DateCreation=dateCreation;
  this.country=country;
  this.TypeInsurance=typeInsurance;
  this.name=name;
  this.reference_number=reference_number;

 }
}
