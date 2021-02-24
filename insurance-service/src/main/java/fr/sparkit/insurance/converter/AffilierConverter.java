package fr.sparkit.insurance.converter;

import fr.sparkit.insurance.dto.AffilierDto;
import fr.sparkit.insurance.dto.AssuranceDto;
import fr.sparkit.insurance.entities.Affilier;
import fr.sparkit.insurance.entities.Assurance;
import org.modelmapper.ModelMapper;

import java.lang.reflect.Type;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class AffilierConverter {
    private static ModelMapper modelMapper = new ModelMapper();
    private AffilierConverter(){

    }
    public static AffilierDto modelToDto(Affilier affilier) {
        return modelMapper.map(affilier ,  AffilierDto.class);
    }
    public static Affilier dtoToModel(AffilierDto affilierDto) {
        return new Affilier(affilierDto.getNom(), affilierDto.getPrenom(),affilierDto.isIsClientVip());
    }
    public static List<AssuranceDto> modelsToDtos(Collection<Assurance> assurances) {
        return assurances.stream().filter(Objects::nonNull).map(InssuranceConverter::modelToDto).collect(Collectors.toList());
    }
}
