package fr.sparkit.insurance.dto;


import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class StatusDto extends AuditableDto {
    private static final long serialVersionUID = 1L;

    private Long id;
    private String title;
    private String color;

}
