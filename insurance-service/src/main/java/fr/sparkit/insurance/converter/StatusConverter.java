package fr.sparkit.insurance.converter;

import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import fr.sparkit.insurance.dto.StatusDto;
import fr.sparkit.insurance.entities.Status;
import org.modelmapper.ModelMapper;



public final class StatusConverter {

    private static ModelMapper modelMapper = new ModelMapper();

    private StatusConverter() {

    }

    public static StatusDto modelToDto(Status status) {
        return modelMapper.map(status, StatusDto.class);
    }


    public static Status dtoToModel(StatusDto statusDto) {
        return new Status(statusDto.getColor(), statusDto.getTitle());
    }

    public static List<StatusDto> modelsToDtos(Collection<Status> statuts) {
        return statuts.stream().filter(Objects::nonNull).map(StatusConverter::modelToDto).collect(Collectors.toList());
    }
}
