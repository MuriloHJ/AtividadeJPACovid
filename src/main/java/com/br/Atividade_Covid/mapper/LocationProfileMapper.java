package com.br.Atividade_Covid.mapper;

import com.br.Atividade_Covid.dto.LocationProfileResponse;
import com.br.Atividade_Covid.dto.LocationResponse;
import com.br.Atividade_Covid.entity.Location;
import com.br.Atividade_Covid.entity.LocationProfile;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class LocationProfileMapper
{
    public LocationProfileResponse toResponse(LocationProfile locationProfile)
    {
        return new LocationProfileResponse(
                locationProfile.getLocationId(),
                locationProfile.getPopulation(),
                locationProfile.getPopulationDensity(),
                locationProfile.getMedianAge()
        );
    }

    public List<LocationProfileResponse> toResponseList(List<LocationProfile> locationsProfiles)
    {
        return locationsProfiles.stream()
                .map(this::toResponse)
                .toList();
    }
}
