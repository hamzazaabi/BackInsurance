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
@Table(name = "TYPE_Insurance")
@EqualsAndHashCode(onlyExplicitlyIncluded = true)


public class Assurance extends  Auditable {
    private static final long serialVersionUID = -5883364877326695622L;
    @Id
    @GeneratedValue
    @Column(name = "Asr_ID")
    @EqualsAndHashCode.Include
    private Long id;
    @Column(name = "ASR_NAME")
    private String Name;
    @Column(name = "ASR_TYPE")
    private String Type;
    @Column(name = "ASR_IS_DELETED", columnDefinition = "bit default 0")
    private boolean isDeleted;

    @Column(name = "ASR_DELETED_TOKEN")
    private UUID deletedToken;

    @Column(name = "ASR_IS_ARCHIVED")
    private boolean isArchived;

    public Assurance(String name, String type) {
        this.Name=name;
        this.Type=type;
    }


}
