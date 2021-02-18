package fr.sparkit.insurance.converter;

import fr.sparkit.insurance.dto.AssuranceDto;
import fr.sparkit.insurance.dto.StatusDto;
import fr.sparkit.insurance.entities.Assurance;
import fr.sparkit.insurance.entities.Status;
import org.modelmapper.ModelMapper;

import java.lang.reflect.Type;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public final  class InssuranceConverter {
    private static ModelMapper modelMapper = new ModelMapper();
    private InssuranceConverter(){

    }
    public static AssuranceDto modelToDto(Assurance assurance) {
        return modelMapper.map(assurance,  AssuranceDto.class);
    }
    public static Assurance dtoToModel(AssuranceDto assuranceDto) {
        return new Assurance(assuranceDto.getName(), assuranceDto.getType());
    }
    public static List<AssuranceDto> modelsToDtos(Collection<Assurance> assurances) {
        return assurances.stream().filter(Objects::nonNull).map(InssuranceConverter::modelToDto).collect(Collectors.toList());
    }
}
