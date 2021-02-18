package fr.sparkit.insurance.dto;

import lombok.*;

import javax.persistence.Column;
@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class AssuranceDto extends  AuditableDto{
    private static final long serialVersionUID = 1L;
    private Long id;
    private String Name;
    private String Type;
}
