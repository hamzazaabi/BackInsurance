package fr.sparkit.insurance.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AssuranceDtoPage {
    private List<AssuranceDto> AssuranceDtoList;
    private Long totalItems;
}
