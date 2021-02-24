package fr.sparkit.insurance.entities;

import fr.sparkit.insurance.constraint.validators.AuditedEntity;
import lombok.*;

import javax.persistence.*;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@ToString
@AuditedEntity
@Entity
@Table(name = "Affilier")
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Affilier extends Auditable {
    private static final long serialVersionUID = -5883364877326695622L;

    @Id

     private Long id;
    @Column(name = "AFF_NAME")
    private String nom ;
    @Column(name = "AFF_PRENOM")
    private  String prenom;
    @Column(name = "AFF_VIP")
    private  boolean IsClientVip;
    @Column(name = "ASR_IS_DELETED", columnDefinition = "bit default 0")
    private boolean isDeleted;

    @Column(name = "ASR_DELETED_TOKEN")
    private UUID deletedToken;

    @Column(name = "ASR_IS_ARCHIVED")
    private boolean isArchived;

    public Affilier(String nom, String prenom, boolean isClientVip) {
      this.nom=nom;
      this.prenom=prenom;
      this.IsClientVip =isClientVip;
    }

    public Affilier(Long id, String nom, String prenom, boolean IsClientVip) {
        super();
        this.id=id;
        this.nom=nom;
        this.prenom=prenom;
        this.IsClientVip =IsClientVip;
    }
}