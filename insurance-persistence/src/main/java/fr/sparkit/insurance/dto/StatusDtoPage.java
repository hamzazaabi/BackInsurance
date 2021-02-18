package fr.sparkit.insurance.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class StatusDtoPage {
    private List<StatusDto> statusDtoList;
    private Long totalItems;
}
