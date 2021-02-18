package fr.sparkit.insurance.dto;

import java.io.Serializable;
import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class AuditableDto implements Serializable {
    private static final long serialVersionUID = -5118436860237703104L;

    protected String createdBy;

    protected LocalDateTime createdDate;

    protected String lastModifiedBy;

    protected LocalDateTime lastModifiedDate;
}
