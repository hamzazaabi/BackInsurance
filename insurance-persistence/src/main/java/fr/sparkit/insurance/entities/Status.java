package fr.sparkit.insurance.entities;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import fr.sparkit.insurance.constraint.validators.AuditedEntity;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@ToString
@AuditedEntity
@Entity
@Table(name = "T_STATUS")
public class Status extends Auditable  {
        private static final long serialVersionUID = -5883364877326695622L;
        @Id
        @GeneratedValue
        @Column(name = "STA_ID")
        @EqualsAndHashCode.Include
        private Long id;

        @Column(name = "STA_TITLE")
        private String title;

        @Column(name = "STA_COLOR")
        private String color;

        @Column(name = "STA_IS_DELETED", columnDefinition = "bit default 0")
        private boolean isDeleted;

        @Column(name = "STA_DELETED_TOKEN")
        private UUID deletedToken;


        @Column(name = "STA_IS_ARCHIVED")
        private boolean isArchived;

        public Status(String color, String title) {
                this.color = color;
                this.title = title;
        }

}
